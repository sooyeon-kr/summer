package com.example.summer.discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class DiscountController {

    @Autowired
    private DiscountService discountService;
    @Autowired
    private WebApplicationContext applicationContext;


    @GetMapping("/discount")
    public String test(){
        return "hello discount";
    }
    @PostMapping("/discount")
    public DiscountRes discount(@RequestBody DiscountReq discountReq) {
        if (discountReq.getId().toCharArray()[0]=='m')
            return discountService.discount(discountReq);
        discountService =(DiscountService) applicationContext.getBean("nonMemberDiscountService");
        return discountService.discount(discountReq);
    }
}
