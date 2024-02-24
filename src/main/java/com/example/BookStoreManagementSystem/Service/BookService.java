package com.example.BookStoreManagementSystem.Service;

import com.example.BookStoreManagementSystem.Model.Book;
import com.example.BookStoreManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
