package com.example.summer.ocp;

import org.springframework.stereotype.Repository;

@Repository
public class OcpBRepository implements OcpRepository {
    @Override
    public String method1() {
        return "OcpBRepository method1";
    }

    @Override
    public String method2() {
        return "OcpBRepository method2";
    }
}
