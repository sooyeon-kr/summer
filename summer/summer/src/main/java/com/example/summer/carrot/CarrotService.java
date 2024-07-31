package com.example.summer.carrot;
import org.springframework.beans.factory.annotation.Autowired;

public class CarrotService {

    DiscountPolicy discountPolicy;

    @Autowired
    CarrotService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public int calcDiscountedPrice(){
        return discountPolicy.getJohang();
    }
}
