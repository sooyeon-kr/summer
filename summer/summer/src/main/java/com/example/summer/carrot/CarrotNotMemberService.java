package com.example.summer.carrot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CarrotNotMemberService extends CarrotService{


    @Autowired
    CarrotNotMemberService(DiscountNotMemberPolicy discountNotMemberPolicy) {
        super(discountNotMemberPolicy);
    }

}
