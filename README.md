# Atoll NoSQL demo repository

This is a repository for my presentation @ Atoll, which covers some well-known NoSQL solutions like Redis, ElasticSearch and MongoDB.

## Installation and usage

To launch these demo projects you will need JDK, Apache Maven and Docker (or need to install the various NoSQL database management systems instead of running from a Docker container).

Clone this repository, go to each folder and do a `mvn clean install`. After that you will get a runnable JAR file in every project's target folder. You can run this with `java -jar nameofthejar.jar`, but it will throw an exception if you did not setup the database for that proper project.

### RedisPubSub and RedisPubSub

Run Redis in Docker with the following command:
`docker run -d -p 6379:6379 --name redis redis:alpine`

After you start this two projects, the RedisPubSub project will listen on port 8080, RedisSub will listen on a random port (but it doesn't matter).  

You can throw a new message to the queue with the following command. This message will be displayed in the application log of both projects.  
`curl http://localhost:8080/pub`  

You can subscribe in Redis too by connect to the container with `docker exec -it redis sh` , open redis-cli by `redis-cli`, and `SUBSCRIBE pubsub:queue`. After that when you throw a new message it will be displayed in the Redis console as well.

### RedisMongoDemo

Run Redis in Docker with the following command (if you didn't start it yet):
`docker run -d -p 6379:6379 --name redis redis:alpine`

Run MongoDB in Docker with the following command:
`docker run -d -p 27017:27017 --name mongo mongo`

This project will listen on port 8080 and it focuses on basic MongoDB data modelling and Redis caching.

#### Available REST methods:
`curl -H "Content-Type: application/json" -X POST -d '{"id":"id1","title":"title-1","author":"Author 1","description":"Description"}' http://localhost:8080/book`  
The previous command create a book entity in MongoDB. You can see it if you connect to container with `docker exec -it mongo sh`, open mongo console by type `mongo`, and get the document by type `db.book.find().pretty()` in the mongo console.

`curl http://localhost:8080/book/title-1`  
This one will return the previously saved entity after 3 seconds delay at the first time. After that it will be cached in Redis and will be returned immediately. You can check the cached entry in redis-cli by `KEYS *`.

`curl -H "Content-Type: application/json" -X PUT -d '{"id":"id1","title":"title-1-updated","author":"Author 1 Updated","description":"Description Updated"}' http://localhost:8080/book/title-1`  
This command update the saved entity in MongoDB and Redis too.

`curl -X DELETE http://localhost:8080/book/title-1`  
This command delete the saved entity from MongoDB and Redis cache.

`curl -X POST http://localhost:8080/user`  
This will create a dummy user with two dummy product which can be read by connecting to the container with `docker exec -it mongo sh`, open mongo console by type `mongo`, and get the documents by type `db.user.find().pretty()` and `db.product.find().pretty()` in the mongo console.

`curl http://localhost:8080/user`  
This GET command will return a list of users with the referenced products as an embedded objects.