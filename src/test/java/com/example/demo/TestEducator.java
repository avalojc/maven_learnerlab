package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        //given
        Educator educator = Educator.LEON;
        //when
        boolean outcome = educator instanceof Teacher;
        //then
        Assert.assertTrue(outcome);
    }

    ///////// DOESNT INHERIT

    @Test
    public void testTeach(){
        //Given
        Educator educator = Educator.LEON;
        Student student = new Student(null, null);
        double expected = 2.0;
        //When
        educator.teach(expected,student);
        //Then
        double actual = educator.getTimeWorked();
        Assert.assertEquals(expected,actual, 0.01);

    }

    @Test
    public void testLecture(){
        //Given
        Educator educator = Educator.FRED;
        Students students = Students.getInstance();
        Learner[] learners = students.toArray();
        double expected = 600.0;
        //When
        educator.lecture(expected,learners);
        //Then
        double actual = educator.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.01);

    }
}
