package com.start.microservicos;

import com.start.microservicos.properties.JwtConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = JwtConfiguration.class)
public class MicroservicosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicosApplication.class, args);
    }
}
