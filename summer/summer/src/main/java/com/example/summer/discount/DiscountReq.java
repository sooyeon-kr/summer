package com.example.summer.discount;

import org.apache.naming.factory.BeanFactory;

public class DiscountReq {
    private int price;
    private String id;
    private int grade;

    public DiscountReq(int price, String id, int grade) {
        this.price = price;
        this.id = id;
        this.grade = grade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}


