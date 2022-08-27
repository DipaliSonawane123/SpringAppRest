package com.example.firstproject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping("/Hello")
    public String Hello (){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }
}
