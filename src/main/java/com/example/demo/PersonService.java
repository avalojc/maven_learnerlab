package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService implements PersonServiceInterface {
    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> readAll(){
        Iterable<Person> personIterable = repository.findAll();
        List<Person> personList = new ArrayList<>();
        personIterable.forEach((personList::add));
        return personList;
    }

    @Override
    public  Person read(Long id){
        return repository.findById(id).get();
    }

    @Override
    public Person create(Person person){
        Person savedInDatabase = repository.save(person);
        return savedInDatabase;
    }

    @Override
    public Person updateById(Long id, Person personData){
        Person personInDatabase = read(id);
        personInDatabase.setName(personData.getName());
        personInDatabase = repository.save(personInDatabase);
        return personInDatabase;
    }

    @Override
    public Person deleteById(Long id){
        Person personToBeDeleted = read(id);
        repository.delete(personToBeDeleted);
        repository.deleteById(id);
        return personToBeDeleted;

    }



}
