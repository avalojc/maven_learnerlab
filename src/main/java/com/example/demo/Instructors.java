package com.example.demo;

public class Instructors extends People<Instructor> {
    private static Instructors INSTANCE ;

    private Instructors(){
        this.add(new Instructor(0L, "Leon"));
        this.add(new Instructor(1L, "Fred"));
        this.add(new Instructor(2L, "David"));
        this.add(new Instructor(3L, "Jothi"));
    }

    public static Instructors getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] arrayToBePopulated = new Instructor[0];
        Instructor[] populatedArray = personList.toArray(arrayToBePopulated);
        return populatedArray;
    }
}
