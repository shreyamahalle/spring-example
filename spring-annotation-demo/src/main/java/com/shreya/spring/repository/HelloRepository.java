package com.shreya.spring.repository;

import org.springframework.stereotype.Repository;

@Repository

public class HelloRepository {

    public String greet() {
        return "Hello world";
    }
}
