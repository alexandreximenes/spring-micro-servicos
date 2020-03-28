package com.springboot.microservices.limitservices;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LimiteConfiguration {

    private int minimo;
    private int maximo;

}
