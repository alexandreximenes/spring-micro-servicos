package com.springboot.microservices.limitservices;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "limit-service")
public class Configuration {

    private int minimo;
    private int maximo;

}
