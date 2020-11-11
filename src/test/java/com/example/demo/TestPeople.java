package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        //given
        People people = new People();
        Person personToAdd = new Person(null,null);
        Assert.assertFalse(people.contains(personToAdd));

        //when
        people.add(personToAdd);

        //then
        Assert.assertTrue(people.contains(personToAdd));
    }

    @Test
    public void testRemove(){
        //given
        People people = new People();
        Person personToAdd = new Person(null,null);
        people.add(personToAdd);
        Assert.assertTrue(people.contains(personToAdd));
        //when
        people.remove(personToAdd);

        //then
        Assert.assertFalse(people.contains(personToAdd));
    }

    @Test
    public void testFindById(){
        //given
        People people = new People();
        Long expectedId = Long.MAX_VALUE;
        Person personToAdd = new Person(expectedId,null);
        people.add(personToAdd);
        Assert.assertTrue(people.contains(personToAdd));

        //when
        Person actualId = people.findById(expectedId);

        //then
        Assert.assertEquals(expectedId, actualId);
    }

}
