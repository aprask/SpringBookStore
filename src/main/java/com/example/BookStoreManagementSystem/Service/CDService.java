package com.example.BookStoreManagementSystem.Service;

import com.example.BookStoreManagementSystem.Model.CD;
import com.example.BookStoreManagementSystem.Repository.CDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CDService {
    private final CDRepository cdRepository;

    @Autowired
    public CDService(CDRepository cdRepository) {
        this.cdRepository = cdRepository;
    }
    public List<CD> findAllCDs() {
        return cdRepository.findAll();
    }
}
