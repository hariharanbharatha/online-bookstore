package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {
        // Sample data
        books.add(new Book(1L, "Java for Beginners", "John Doe", 29.99));
        books.add(new Book(2L, "Spring Boot Guide", "Jane Smith", 39.99));
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
