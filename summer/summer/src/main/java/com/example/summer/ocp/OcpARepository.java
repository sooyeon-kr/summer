package com.example.summer.ocp;

import org.springframework.stereotype.Repository;


public class OcpARepository implements OcpRepository {
    @Override
    public void method1() {
        System.out.println("OcpARepository method1");
    }

    @Override
    public void method2() {
        System.out.println("OcpARepository method2");
    }
}
