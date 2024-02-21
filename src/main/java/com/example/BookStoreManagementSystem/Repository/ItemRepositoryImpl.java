package com.example.BookStoreManagementSystem.Repository;

import com.example.BookStoreManagementSystem.Model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public List retrieveAll() {
        return null;
    }

    @Override
    public List<String> retrieveTitles() {
        return null;
    }

    @Override
    public List retrieveByMaker(String maker) {
        return null;
    }

    @Override
    public List retrieveInDescendingOrder(List itemList) {
        return null;
    }

    @Override
    public List retrieveInAscendingOrder(List itemList) {
        return null;
    }

    @Override
    public List retrieveInAlphabeticalOrder(List itemList) {
        return null;
    }

    @Override
    public int retrieveItemCount(List itemList) {
        return 0;
    }

    @Override
    public Item retrieveRandomItem(List itemList) {
        return null;
    }

    @Override
    public Item retrieveLatestItem(List itemList) {
        return null;
    }

    @Override
    public boolean removeValue(List itemList, int ID) {
        return false;
    }

    @Override
    public void changeItemName(Item item) {

    }

    @Override
    public void changeItemID(Item item) {

    }

    @Override
    public void changeItemPrice(Item item) {

    }

    @Override
    public void changeItemGenre(Item item) {

    }

    @Override
    public void changeItemYear(Item item) {

    }

    @Override
    public void changeItemOwner(Item item) {

    }

    @Override
    public void restockItem(Item item) {

    }

    @Override
    public void createItem() {

    }

    @Override
    public boolean isRented(Item item) {
        return false;
    }
}
