package com.example.summer.room.dto;

import com.example.summer.room.Room;

public class RoomRegisterReq {
    private final String type;
    private final int price;
    private final int capacity;

    public RoomRegisterReq(String type, int price, int capacity) {
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getPrice(){
        return price;
    }

    public int getCapacity(){
        return capacity;
    }

    public Room toEntity(){
        return new Room(type, price, capacity);
    }
}
