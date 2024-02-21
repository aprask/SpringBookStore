package com.example.BookStoreManagementSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "books")
public class Book extends Item {
    @Id
    @SequenceGenerator(
            name = "book_seq",
            sequenceName = "book_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_seq"
    )
    private long id;
    private String author;
    private Date year;
    private String genre;
    public Book() {}
    public Book(String itemName, long id, double itemCost, String author, Date year, String genre) {
        super(itemName, itemCost);
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.id = id;
    }

    @Override
    public int compareTo(@NotNull Item o) {
        return 0;
    }
}