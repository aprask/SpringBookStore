package com.example.BookStoreManagementSystem.Controller;

import com.example.BookStoreManagementSystem.Service.ItemService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api/item")
@Data
public class ItemController {
    private final ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping()
    public void test() {
        System.out.println("Hi");
    }
}
