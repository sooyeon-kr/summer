package com.example.summer.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("non-member")
public class NonMemberDiscountService implements DiscountService {
    static final double PERCENTAGE = 0.09;
    @Override
    public DiscountRes discount(DiscountReq req) {

        return DiscountRes.from(req.getPrice() * (1-PERCENTAGE));
    }
}
