package com.example.summer.testJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


public class TestController {
    TestService testService;


    TestController(TestService testService) {
        this.testService=testService;
    }
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public void save(){
        testService.save();
    }



}
