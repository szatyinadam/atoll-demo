package com.atollgroup.repository;

import com.atollgroup.model.Book;
import com.atollgroup.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aszatyin on 2017-01-06.
 */
public interface UserRepository extends MongoRepository<User, String>{
    Book findByEmail(String email);
    void deleteByEmail(String email);
}
