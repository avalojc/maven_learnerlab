package com.example.demo;

import java.util.List;

public class People {
    public List <Person> personList;

    public void add (Person person){
        personList.add(person);
    }
//      TODO: Find by Id.
    public Person findById (long id){
        return personList
                .stream()
                .filter(person -> person.getId() ==id)
                .findFirst()
                .get();
    }
}
