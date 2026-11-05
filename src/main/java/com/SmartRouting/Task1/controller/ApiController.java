package com.SmartRouting.Task1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exceptions")
public class ApiController {
    @GetMapping("/data")
    public String getSecureData(){
        String name = null ;

        return name.toUpperCase();
    }

    @GetMapping("/num")
    public int num(){
        int num = 1/0;
        return num;
    }
}
