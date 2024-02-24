package com.example.BookStoreManagementSystem.Service;

import com.example.BookStoreManagementSystem.Model.CD;
import com.example.BookStoreManagementSystem.Model.DVD;
import com.example.BookStoreManagementSystem.Repository.CDRepository;
import com.example.BookStoreManagementSystem.Repository.DVDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DVDService {
    private final DVDRepository dvdRepository;

    @Autowired
    public DVDService(DVDRepository dvdRepository) {
        this.dvdRepository = dvdRepository;
    }
    public List<DVD> findAllDVDs() {
        return dvdRepository.findAll();
    }
}
