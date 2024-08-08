package com.example.summer.dbjpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Child {
    @Id
    int id;
    String name;

    @ManyToOne
    @JoinColumn(name="parent_id")
    Parent parent;

    public Child(String name) {
        this.name = name;
    }

    public Child() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Parent getParent() {
        return parent;
    }
}
