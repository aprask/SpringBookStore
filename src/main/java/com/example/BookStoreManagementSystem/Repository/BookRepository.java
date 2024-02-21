package com.example.BookStoreManagementSystem.Repository;

import com.example.BookStoreManagementSystem.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "SELECT b FROM Book b WHERE b.id =?1")
    Optional<Book> findByName(String name);
}