package com.example.BookStoreManagementSystem.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class CD extends Item {
    private long id;
    private String artist;
    private Date year;
    private String genre;
    public CD(){}
    public CD(String itemName, long id, double itemCost, String artist, Date year, String genre) {
        super(itemName, itemCost);
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.id = id;
    }
    @Override
    public int compareTo(@NotNull Item o) {
        return 0;
    }
}