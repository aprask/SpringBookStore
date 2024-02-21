package com.example.BookStoreManagementSystem.Model;

import lombok.*;

@Data
public abstract class Item implements Comparable<Item> {
    private String itemName;
    private double itemCost;

    public Item(){

    }

    public Item(String itemName, double itemCost) {
        this.itemName = itemName;
        this.itemCost = itemCost;
    }
}