package com.example.summer.discount;

public abstract class DiscountPolicy {
    private final int DISCOUNTED_PERCENT;

    DiscountPolicy(int DISCOUNTED_PERCENT) {
        this.DISCOUNTED_PERCENT = DISCOUNTED_PERCENT;
    }
    public int discount(int price) {
        return price * (1-DISCOUNTED_PERCENT);
    }
}
