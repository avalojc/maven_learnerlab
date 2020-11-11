package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person-controller")
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> readById(@PathVariable Long id){
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @GetMapping(value="/")
    public ResponseEntity<List<Person>>readAll(){
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK)    ;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Person> create (@RequestBody Person person){
        return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
    }

    @PutMapping (value = "/update/{id}")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newPersonData){
        return new ResponseEntity<>(service.updateById(id, newPersonData), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Person> delete(@PathVariable Long id){
        return new ResponseEntity<>(service.deleteById(id),HttpStatus.OK);
    }
}
