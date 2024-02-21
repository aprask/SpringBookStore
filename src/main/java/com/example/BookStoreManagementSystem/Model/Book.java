package com.example.BookStoreManagementSystem.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;
@EqualsAndHashCode(callSuper = true)
@Data

public class Book extends Item {
    private String author;
    private String isbn;
    private Date year;
    private String genre;
    public Book() {}
    public Book(String itemName, int itemID, double itemCost, String author, String isbn, Date year, String genre) {
        super(itemName, itemID, itemCost);
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public int compareTo(@NotNull Item o) {
        return 0;
    }
}