package com.restAPI.restAPI.service;

import com.restAPI.restAPI.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {
    private static List<Book>books = new ArrayList<>();
    static{
        books.add(new Book("Book1", 1));
        books.add(new Book("Book2",2 ));
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public Book getBookById(int id){
        Book book = null;
        try{
            book = books.stream().filter(b -> b.getId() == id).findFirst().get();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return book;
    }

    public Book addBook(Book book){
        books.add(book);
        return book;
    }
}
