package com.atollgroup.controller;

import com.atollgroup.model.Book;
import com.atollgroup.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aszatyin on 2017-01-06.
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(value = "/book")
    public Book saveBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping(value = "/book/{title}")
    public Book findBookByTitle(@PathVariable String title) {
        return bookService.findByTitle(title);
    }

    @PutMapping(value = "/book/{title}")
    public Book updateBookByTitle(@PathVariable String title, @RequestBody Book book){
        return bookService.updateByTitle(title, book);
    }

    @DeleteMapping(value = "/book/{title}")
    public void deleteBookByTitle(@PathVariable String title){
        bookService.deleteByTitle(title);
    }
}
