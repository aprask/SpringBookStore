package com.example.BookStoreManagementSystem.Model;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@MappedSuperclass
public abstract class Item implements Comparable<Item> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_cost")
    private double itemCost;

    // Constructors, getters, setters, and other methods
    public Item() {}

    public Item(String itemName, double itemCost, long id) {
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.id = id;
    }
}
