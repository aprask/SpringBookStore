package com.example.BookStoreManagementSystem.Model;

import lombok.*;

@Data
public abstract class Item implements Comparable<Item> {
    private String itemName;
    private int itemID;
    private double itemCost;

    public Item(){

    }

    public Item(String itemName, int itemID, double itemCost) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.itemCost = itemCost;
    }
}