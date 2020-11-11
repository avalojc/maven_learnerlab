package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplimentaton{
        //given
        Instructor instructor = new Instructor(null, null);
        //when
        boolean outcome = instructor instanceof Teacher;
        //then
            Assert.assertTrue(outcome);
    }

    @Test
    public void testInheritance{
        //given
        Instructor instructor = new Instructor(null, null);
        //when
        boolean outcome = instructor instanceof Teacher;
        //then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(null, null);
        Learner student = new Student(null,null);
        double numberOfHoursToTeach = 10;
        double preStudyTime = student.getTotalStudyTime();
        double expected = preStudyTime+ numberOfHoursToTeach;
        //when
        instructor.teach( numberOfHoursToTeach, student);
        double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(null, null);
        Learner student1 = new Student(null,null);
        Learner student2 = new Student(null,null);
        Learner student3 = new Student(null,null);
        Learner[] students = {student1,student2, student3};
        double numberOfHoursToTeach = students.length;
        double preStudyTime1 = student1.getTotalStudyTime();
        double preStudyTime2 = student2.getTotalStudyTime();
        double preStudyTime3 = student3.getTotalStudyTime();
        double expected1 = preStudyTime+ numberOfHoursToTeach;
        double expected2 = preStudyTime+ numberOfHoursToTeach;
        double expected3 = preStudyTime+ numberOfHoursToTeach;
        //when
        instructor.teach(student, numberOfHoursToTeach);
        double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual,0.01);
    }

}
