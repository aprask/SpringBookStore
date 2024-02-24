package com.example.BookStoreManagementSystem.Model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@Table(name = "books")
public class Book extends Item {
    private String author;
    private Date year;
    private String genre;
    public Book() {}
    public Book(String itemName, long id, double itemCost, String author, Date year, String genre) {
        super(itemName, itemCost, id);
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public int compareTo(@NotNull Item o) {
        return 0;
    }
}