package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

        System.out.println("Application started successfully!");
        System.out.println("Open: http://localhost:8080");
    }
}
