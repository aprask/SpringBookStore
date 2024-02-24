package com.example.BookStoreManagementSystem.Repository;

import com.example.BookStoreManagementSystem.Model.DVD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DVDRepository extends JpaRepository<DVD, Long> {
}
