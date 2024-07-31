package com.example.summer.carrot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrotController {

    private final int MEMBER = 1;

    private final CarrotMemberService carrotMemberService;
    private final CarrotNotMemberService carrotNotMemberService;

    @Autowired
    public CarrotController(CarrotMemberService carrotMemberService, CarrotNotMemberService carrotNotMemberService) {
        this.carrotMemberService = carrotMemberService;
        this.carrotNotMemberService = carrotNotMemberService;
    }

    /**
    * 할인된 금액을 반환
    * @return 비회원 0, 회원 1
    */
    @GetMapping("/carrot/{id}")
    public int calcDiscountedPrice(@PathVariable int id){
        if(isMember(id)){
            return carrotMemberService.calcDiscountedPrice();
        }else {
            return carrotNotMemberService.calDiscountedPrice();
        }
    }

    private boolean isMember(int id) {
        return id == MEMBER;
    }

}