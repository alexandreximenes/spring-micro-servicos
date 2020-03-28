package com.springboot.microservices.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LimiteServiceController {

    @Autowired
    private Configuration configuration;

    @GetMapping
    public LimiteConfiguration getLimiteConfiguration(){
        return new LimiteConfiguration(configuration.getMinimo(),configuration.getMaximo());
    }
}
