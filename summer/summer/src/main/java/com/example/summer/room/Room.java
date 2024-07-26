package com.example.summer.room;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
    private int id;
    private String type;
    private int price;
    private int capacity;

    public Room(String type, int price, int id, int capacity) {
        this.type = type;
        this.price = price;
        this.id = id;
        this.capacity = capacity;
    }

    public Room() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

class NullRoom extends Room {
    NullRoom(){
        super();
    }
    @Override
    public String getType() {
        return "null";
    }
}
