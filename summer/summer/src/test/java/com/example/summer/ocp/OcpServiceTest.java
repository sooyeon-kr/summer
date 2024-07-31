package com.example.summer.ocp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;

@SpringBootTest
class OcpServiceTest {

    @Test
    public void testOcpService() {
        
        // 개발자
//        OcpARepository ocpARepository = new OcpARepository();
//        OcpBRepository ocpBRepository = new OcpBRepository();
//        OcpService ocpService = new OcpService(ocpARepository);

        OcpService ocpService = new OcpService();

        ocpService.callMethod1();
        ocpService.callMethod2();
    }
}