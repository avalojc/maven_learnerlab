package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestClassroom {
    @Test
    public void testHostLecutuer(){
        //given
        Classroom classroom = Classroom.INSTANCE;
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();
        Teacher teacherAsTeacher = instructors.findById(1L);
        Map<Student, Double> preStudyMap = classroom.getStudyMap();
        Double numberOfHoursToTeach = 999.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.getInstance().count();

        //wehn
        classroom.hostLecture(teacherAsTeacher, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for(Student student: keySet){
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            Assert.assertEquals(expectedStudyTime,actualStudyTime);
        }

        //then


    }
}
