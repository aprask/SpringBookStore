package com.example.BookStoreManagementSystem.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class DVD extends Item {
    private long id;
    private String director;
    private Date year;
    private String genre;
    public DVD(String itemName, long id, double itemCost, String director, Date year, String genre) {
        super(itemName, itemCost);
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.id = id;
    }
    @Override
    public int compareTo(@NotNull Item o) {
        return 0;
    }
}