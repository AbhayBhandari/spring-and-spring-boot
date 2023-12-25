package com.restAPI.restAPI.controller;

import com.restAPI.restAPI.entity.Book;
import com.restAPI.restAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBooksById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    @PostMapping("/books")
    public String addABook(@RequestBody Book book){
        bookService.addBook(book);
        return("Added a book " +book);
    }


}
