package com.example.summer.core;

import org.springframework.beans.factory.annotation.Autowired;


public class Person {
    private House house;

    public Person(){
        System.out.println("Inside Person constructor");

    }

    @Autowired
    public Person(House house){
        System.out.println("Inside Person constructor");
        this.house = house;
        buyHouse(this.house);
    }


    public void buyHouse(House house){
        this.house = house;
        printBuyHouse();
    }

    private void printBuyHouse() {
        System.out.println(house+"집을 샀습니다.");
    }

    public String getHouse(){
        return house.getName();
    }

}
