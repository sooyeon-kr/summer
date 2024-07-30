package com.example.summer.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MemberDiscountService implements DiscountService {
    public static double PERCENTAGE = 0.05;
    @Override
    public DiscountRes discount(DiscountReq req) {
        System.out.println("MemberDiscountService discount");
        System.out.println(req.getPrice());
        System.out.println(req.getGrade());
        System.out.println(PERCENTAGE);
        System.out.println(req.getGrade() * PERCENTAGE);
        return DiscountRes.from(req.getPrice() * (1-req.getGrade() *PERCENTAGE));
    }
}
