package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {
    @Test
    public void test(){
        //given
        String[] nameArray = "JC, Trevor, Neely, Brandt,Brian".split(",");
        List<String> nameList = Arrays.asList(nameArray);

        //when
        for (Person person: Students.getInstance()){
            String personName = person.getName();
            //then
            Assert.assertTrue(nameList.contains(personName));
        }
    }
}
