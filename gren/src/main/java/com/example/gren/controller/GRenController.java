package com.example.gren.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GRenController {

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }

    @GetMapping("/hi")
    public void hi(){
        System.out.println("hi");

    }
}
