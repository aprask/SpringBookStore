package com.example.BookStoreManagementSystem.Repository;

import com.example.BookStoreManagementSystem.Model.CD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CDRepository extends JpaRepository<CD, Long> {
}
