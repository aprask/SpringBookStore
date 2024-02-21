package com.example.BookStoreManagementSystem.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class DVD extends Item {
    private String director;
    private Date year;
    private String genre;
    public DVD(String itemName, int itemID, double itemCost, String director, Date year, String genre) {
        super(itemName, itemID, itemCost);
        this.director = director;
        this.year = year;
        this.genre = genre;
    }
    @Override
    public int compareTo(@NotNull Item o) {
        return 0;
    }
}