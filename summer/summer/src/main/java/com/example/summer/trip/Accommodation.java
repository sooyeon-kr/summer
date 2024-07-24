package com.example.summer.trip;
import com.example.summer.room.Room;
import java.util.ArrayList;
import java.util.List;

public class Accommodation {
    private String name;
    private int lowPrice;
    private List<Room> rooms = new ArrayList<>();
    private int id;

    public Accommodation() {
    }

    public Accommodation(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(int lowPrice) {
        this.lowPrice = lowPrice;
    }
}
