package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable <Person>{
    public List <Person> personList = new ArrayList<>();

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

    public boolean contains (Person person){
        return personList.contains(person);
    }

    public void remove (Person person){
        personList.remove(person);
    }

    public void remove (Long id){
        remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }


}
