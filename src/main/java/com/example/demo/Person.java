package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
