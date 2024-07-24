package com.example.summer.trip;

public class AccommodationAddRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Accommodation to(){
        return new Accommodation(name);
    }
}
