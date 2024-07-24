package com.example.summer.core;


public class House {
    private String name;
    private String address;

    public House() {
        name = "B house";
        System.out.println("Created House Bean!");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "House [name=" + name + "]";
    }
}
