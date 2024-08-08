package com.example.summer.dbjpa;

public class ChildRes {
    int id;
    String name;
    Parent parent;

    ChildRes(int id, String name, Parent parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    ChildRes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ChildRes from(Child child){
        return new ChildRes(child.getId(), child.getName(), child.getParent());
    }



}
