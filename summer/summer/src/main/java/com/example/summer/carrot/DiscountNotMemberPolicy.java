package com.example.summer.carrot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DiscountNotMemberPolicy implements DiscountPolicy {
    public int getJohang() {
        return 0;

    }
}
