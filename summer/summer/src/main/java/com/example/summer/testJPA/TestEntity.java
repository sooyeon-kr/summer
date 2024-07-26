package com.example.summer.testJPA;

import jakarta.persistence.Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class TestEntity {
    private int id;
    private String name;

    TestEntity(String name) {
        this.name = name;
    }
    TestEntity() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
