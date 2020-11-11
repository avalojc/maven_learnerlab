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
        Person person1 = new Person(null,"JC", new Date());
        Person person2 = new Person(null,"Avalo", new Date());
        service.create(person1);
        service.create(person2);
    }
}
