package com.example.summer.carrot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrotNotMemberService implements CarrotService {

    DiscountNotMemberPolicy discountNotMemberPolicy;

    @Autowired
    CarrotNotMemberService(DiscountNotMemberPolicy discountNotMemberPolicy) {
        this.discountNotMemberPolicy = discountNotMemberPolicy;
    }

    public int calDiscountedPrice() {
        return discountNotMemberPolicy.getJohang();

    }

    @Override
    public int calcDiscountedPrice() {
        return 0;
    }
}
