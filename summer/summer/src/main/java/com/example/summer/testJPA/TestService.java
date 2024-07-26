package com.example.summer.testJPA;


import java.beans.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class TestService {
    TestRepository testRepository;


    TestService(TestRepository testRepository){
        this.testRepository = testRepository;
    }

    @Transactional
    public void save(){
        testRepository.save();
    }
}
