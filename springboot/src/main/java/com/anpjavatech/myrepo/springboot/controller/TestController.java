package com.anpjavatech.myrepo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getString(){
        return "Service Running Successfully";
    }
}
