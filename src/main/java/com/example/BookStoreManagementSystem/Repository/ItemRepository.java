package com.example.BookStoreManagementSystem.Repository;

import com.example.BookStoreManagementSystem.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface ItemRepository<T extends Item> extends JpaRepository<T, Long> {
    Optional<T> findById(long ID);
    Optional<T> findByName(String name);
    List<T> retrieveAll();
    List<String> retrieveTitles();
    List<T> retrieveInDescendingOrder(List<T> itemList);
    List<T> retrieveInAscendingOrder(List<T> itemList);
    List<T> retrieveInAlphabeticalOrder(List<T> itemList);
    int retrieveItemCount(List<T> itemList);
    T retrieveRandomItem(List<T> itemList);
    T retrieveLatestItem(List<T> itemList);
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
