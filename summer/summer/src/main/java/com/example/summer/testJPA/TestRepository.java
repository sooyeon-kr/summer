package com.example.summer.testJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class TestRepository {

    TestEntity testEntity;
    EntityManager entityManager;


    TestRepository(TestEntity testEntity, EntityManager entityManager){
        this.testEntity = testEntity;
        this.entityManager = entityManager;
        save();
    }

    @PersistenceContext
    public void save(){
        testEntity.setId(1);
        testEntity.setName("test");
    }

}
