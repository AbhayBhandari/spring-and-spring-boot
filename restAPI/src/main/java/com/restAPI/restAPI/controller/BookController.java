package com.restAPI.restAPI.controller;

import com.restAPI.restAPI.entity.Book;
import com.restAPI.restAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }

//    @GetMapping("/books/{id}")
//    public Book getBooksById(@PathVariable("id") int id){
//        return bookService.getBookById(id);
//    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book>getBookById(@PathVariable("id") int id){
        Book book = bookService.getBookById(id);
        if(book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/books")
    public String addABook(@RequestBody Book book){
        bookService.addBook(book);
        return("Added a book " +book);
    }


}
