package com.example.summer.carrot;

import org.springframework.stereotype.Component;

@Component
public class DiscountMemberPolicy implements DiscountPolicy{
    public int getJohang() {
        return 1;
    }
}
