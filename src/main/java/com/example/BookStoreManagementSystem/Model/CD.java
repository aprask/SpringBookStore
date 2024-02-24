package com.example.BookStoreManagementSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@Table(name = "cds")
public class CD extends Item {
    private String artist;
    private Date year;
    private String genre;
    public CD() {

    }
    public CD(String itemName, long id, double itemCost, String artist, Date year, String genre) {
        super(itemName, itemCost, id);
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }
    @Override
    public int compareTo(@NotNull Item o) {
        return 0;
    }
}