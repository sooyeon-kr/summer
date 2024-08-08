package com.example.summer.dbjpa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    ChildService childService;

    Controller(ChildService childService) {
        this.childService = childService;
    }
    @PostMapping(value="/child")
    public ResponseEntity<?> saveChild(@RequestBody ChildReq childReq) {
        System.out.println(childReq.getName());
        ChildRes childRes = childService.save(childReq);
        return ResponseEntity.ok(childRes);
    }

    @GetMapping(value="/child-test")
    public String testChild() {
        return "test";
    }

}
