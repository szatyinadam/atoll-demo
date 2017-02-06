package com.atollgroup.service;

import com.atollgroup.model.Book;
import com.atollgroup.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

/**
 * Created by aszatyin on 2017-01-06.
 */
@Service
@EnableCaching
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Cacheable(value = "book", key = "#title")
    public Book findByTitle(String title) {
        slowService();
        return bookRepository.findByTitle(title);
    }

    @CachePut(value = "book", key = "#title")
    public Book updateByTitle(String title, Book book) {
        Book bookFromDB = bookRepository.findByTitle(title);
        bookFromDB.setAuthor(book.getAuthor());
        bookFromDB.setDescription(book.getDescription());
        bookFromDB.setTitle(book.getTitle());
        return bookRepository.save(bookFromDB);
    }

    @CacheEvict(value = "book", key = "#title")
    public void deleteByTitle(String title){
        bookRepository.deleteByTitle(title);
    }

    private void slowService(){
        System.out.println("so sloooooooooooow............");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
