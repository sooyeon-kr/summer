package com.example.summer.ocp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class OcpServiceTest {

    @Test
    public void testOcpService() {
        OcpARepository ocpARepository = new OcpARepository();
        OcpService ocpService = new OcpService(ocpARepository);
        ocpService.method1();
        ocpService.method2();
        assertEquals(ocpService.method1(), ocpARepository.method1());
    }
}