package com.exampleguides.springboot_first_app.controllers;

import com.exampleguides.springboot_first_app.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/greet")
    public String greet() {
        return myService.serve();

    }

}
