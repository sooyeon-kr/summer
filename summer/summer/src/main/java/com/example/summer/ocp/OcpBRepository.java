package com.example.summer.ocp;

import org.springframework.stereotype.Repository;

@Repository
public class OcpBRepository implements OcpRepository {
    @Override
    public void method1() {
        System.out.println("OcpBRepository method1");
    }

    @Override
    public void method2() {
        System.out.println("OcpBRepository method2");
    }
}
