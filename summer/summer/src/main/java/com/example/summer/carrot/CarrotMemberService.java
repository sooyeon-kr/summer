package com.example.summer.carrot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrotMemberService implements CarrotService{
    DiscountMemberPolicy discountMemberPolicy;

    @Autowired
    public CarrotMemberService(DiscountMemberPolicy discountMemberPolicy){
        this.discountMemberPolicy = discountMemberPolicy;
    }

    public int calcDiscountedPrice() {
//        객체.할인 해줘
        return discountMemberPolicy.getJohang();
    }
}
