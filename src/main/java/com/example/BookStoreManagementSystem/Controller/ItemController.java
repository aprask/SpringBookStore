package com.example.BookStoreManagementSystem.Controller;

import com.example.BookStoreManagementSystem.Model.Book;
import com.example.BookStoreManagementSystem.Model.CD;
import com.example.BookStoreManagementSystem.Model.DVD;
import com.example.BookStoreManagementSystem.Service.BookService;
import com.example.BookStoreManagementSystem.Service.CDService;
import com.example.BookStoreManagementSystem.Service.DVDService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@Data
public class ItemController {
    private final BookService bookService;
    private final CDService cdService;
    private final DVDService dvdService;
    @Autowired
    public ItemController(BookService bookService, CDService cdService, DVDService dvdService) {
        this.bookService = bookService;
        this.cdService = cdService;
        this.dvdService = dvdService;
    }
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }
    @GetMapping("/getAllCDs")
    public List<CD> getAllCDs() {
        return cdService.findAllCDs();
    }
    @GetMapping("/getAllDVDs")
    public List<DVD> getAllDVDs() {
        return dvdService.findAllDVDs();
    }
}
