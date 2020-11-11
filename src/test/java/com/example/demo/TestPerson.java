package com.example.demo;


import org.junit.Test;
import org.junit.Assert;


public class TestPerson {
    @Test
    public void testConstructor() {

    //given
    long expectedId = Long.MAX_VALUE;
    String expectedName = "John";

    //when
    Person person = new Person( expectedId, expectedName );

    // then
    Assert.assertEquals( expectedName, person.getName() );
    Assert.assertEquals( expectedId, person.getId() );

    }
}
