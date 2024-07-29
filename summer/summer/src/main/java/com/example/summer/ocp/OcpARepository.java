package com.example.summer.ocp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class OcpARepository implements OcpRepository {
    @Override
    public String method1() {
        return "OcpARepository method1";
    }

    @Override
    public String method2() {
        return "OcpARepository method2";
    }
}
