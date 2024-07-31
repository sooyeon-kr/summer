package com.example.summer.carrot;

import org.springframework.stereotype.Component;

@Component
public class DiscountNotMemberPolicy implements DiscountPolicy {
    public int getJohang() {
        return 0;

    }
}
