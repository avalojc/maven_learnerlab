package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        Assert.assertTrue(new Student(0L, null) instanceof Learner);
    }
    @Test
    public void testInheritance() {
        Assert.assertTrue(new Student(0L, null) instanceof  Person);
    }

    @Test
    public void testLearn() {
        //given
        
        //when

        //then


    }
}
