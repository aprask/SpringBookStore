package com.example.BookStoreManagementSystem.Repository;

import com.example.BookStoreManagementSystem.Model.Item;

import java.util.List;

public interface ItemRepository<T extends Item> {
    List<T> retrieveAll();
    List<String> retrieveTitles();
    List<T> retrieveByMaker(String maker);
    List<T> retrieveInDescendingOrder(List<T> itemList);
    List<T> retrieveInAscendingOrder(List<T> itemList);
    List<T> retrieveInAlphabeticalOrder(List<T> itemList);
    int retrieveItemCount(List<T> itemList);
    Item retrieveRandomItem(List<T> itemList);
    Item retrieveLatestItem(List<T> itemList);
    boolean removeValue(List<T> itemList, int ID);
    void changeItemName(Item item);
    void changeItemID(Item item);
    void changeItemPrice(Item item);
    void changeItemGenre(Item item);
    void changeItemYear(Item item);
    void changeItemOwner(Item item);
    void restockItem(Item item);
    void createItem();
    boolean isRented(Item item);
}