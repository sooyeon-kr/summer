package com.example.summer.dbjpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Parent {
    @Id
    int id;
    String name;
}
