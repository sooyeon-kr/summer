package com.example.summer.dbjpa;

public class ChildReq {
    private String name;

    ChildReq(){};
    ChildReq(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child toEntity(){
        return new Child(name);
    }
}
