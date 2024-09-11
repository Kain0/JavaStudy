package com.exampleguides.springboot_first_app.services;

import org.springframework.stereotype.Service;

public class ServantService extends MyServiceImpl implements MyService {
    @Override
    public String serve() {
        return "At your service my lord!";
    }
}
