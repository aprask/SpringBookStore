package com.example.BookStoreManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class of the application.
 * Starts the Spring Boot application using the {@link SpringApplication} class.
 *
 * @author Andrew Praskala
 */
@SpringBootApplication
public class BookStoreManagementSystemApplication {

    /**
     * Main method of the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(BookStoreManagementSystemApplication.class, args);
    }

}
