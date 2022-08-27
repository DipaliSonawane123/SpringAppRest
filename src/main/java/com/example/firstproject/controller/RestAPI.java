package com.example.firstproject.controller;


import com.example.firstproject.model.FirstModel;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@RestController
public class RestAPI {
    @RequestMapping("/home")
    public String Hello (){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }
    //Use GET Request Method and pass name as query parameter
    @GetMapping("/query")
    public String getUsers(@RequestParam(value = "name", defaultValue = "Dipali") String name) {
        return "<h1><font color=blue>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=green>Passing name as a parameter.</font>";
    }
    //Use GET Request Method and pass name as path variable
    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "<h1><font color=Black>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=Green>Passing name as a path variable.</font>";
    }
    //Use POST Request Method and pass first name and last name in the Body
    @PostMapping("/post")
    public String post(@RequestBody FirstModel  entity) {
        return "Hello " + entity.getFirstName() + " "+  entity.getLastName() + "!";
    }

}
