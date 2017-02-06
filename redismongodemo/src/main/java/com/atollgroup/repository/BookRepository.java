package com.atollgroup.repository;

import com.atollgroup.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aszatyin on 2017-01-06.
 */
public interface BookRepository  extends MongoRepository<Book, String>{
    Book findByTitle(String title);
    void deleteByTitle(String title);
}
