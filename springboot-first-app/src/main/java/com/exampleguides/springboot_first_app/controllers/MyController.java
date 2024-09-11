package com.exampleguides.springboot_first_app.controllers;

import com.exampleguides.springboot_first_app.annotations.InjectRandomInt;
import com.exampleguides.springboot_first_app.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    private final MyService myService;

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/greet")
    public String greet() {
        return myService.serve();

    }

}
