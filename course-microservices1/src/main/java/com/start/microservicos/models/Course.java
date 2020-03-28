package com.start.microservicos.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Course implements AbstractEntty{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
