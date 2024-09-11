package com.exampleguides.springboot_first_app;

import com.exampleguides.springboot_first_app.services.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootFirstAppApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(SpringbootFirstAppApplication.class, args);
        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.serve());

    }

}
