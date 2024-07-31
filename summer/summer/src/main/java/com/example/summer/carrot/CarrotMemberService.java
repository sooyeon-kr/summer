package com.example.summer.carrot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrotMemberService extends CarrotService{

    @Autowired
    public CarrotMemberService(DiscountMemberPolicy discountMemberPolicy){
        super(discountMemberPolicy);
    }

}
