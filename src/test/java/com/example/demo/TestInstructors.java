package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void test(){
        //given
        String[] nameArray = "Fred, Jothi, David, Leon".split(",");
        List<String> nameList = Arrays.asList(nameArray);

        //when
        for (Person person: Instructors.getInstance()){
            String personName = person.getName();
            //then
            Assert.assertTrue(nameList.contains(personName));
        }
    }
}
