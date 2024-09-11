package com.exampleguides.springboot_first_app.services;

import com.exampleguides.springboot_first_app.annotations.InjectRandomInt;
import com.exampleguides.springboot_first_app.annotations.Profiling;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
@Profiling
public class MyServiceImpl implements MyService {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public MyServiceImpl() {
        System.out.println("Phase 1");
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    @Override
    public String serve() {
        StringBuilder served = new StringBuilder();
        for (int i = 0; i < repeat; ++i){
            String message = "From MyServiceImpl: Ready to do my duty!\n";
            served.append(message);
        }
        return served.toString();
    }
}
