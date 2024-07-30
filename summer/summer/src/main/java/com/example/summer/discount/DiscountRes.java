package com.example.summer.discount;

public class DiscountRes {
    double discountedPrice;

    public DiscountRes(double discountPrice) {
        this.discountedPrice = discountPrice;
    }

    public static DiscountRes from (double getDiscountedPrice){
        return new DiscountRes(getDiscountedPrice);
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
