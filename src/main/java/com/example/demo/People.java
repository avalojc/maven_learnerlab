package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class People<SomeTypeOfPerson extends Person> implements Iterable <SomeTypeOfPerson>{

    public List <SomeTypeOfPerson> personList = new ArrayList<>();

    public void add (SomeTypeOfPerson person){
        personList.add(person);
    }

    public SomeTypeOfPerson findById (long id){
        return personList
                .stream()
                .filter(person -> person.getId() ==id)
                .findFirst()
                .get();
    }

    public boolean contains (SomeTypeOfPerson person){
        return personList.contains(person);
    }

    public void remove (SomeTypeOfPerson person){
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

    abstract public SomeTypeOfPerson[] toArray();
//    {
////        return personList.toArray(new SomeTypeOfPerson[0]);
//    }

    @Override
    public Iterator<SomeTypeOfPerson> iterator() {
        return personList.iterator();
    }


}
