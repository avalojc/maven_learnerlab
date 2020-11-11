package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Configuration
public class PersonConfiguration {
    @Autowired
    private PersonService service;

    @PostConstruct
    public void setup(){
        Person person1 = new Person(null,"JC");
        Person person2 = new Person(null,"Avalo");
        service.create(person1);
        service.create(person2);
    }
}
