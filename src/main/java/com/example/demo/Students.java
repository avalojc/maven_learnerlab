package com.example.demo;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students(){
        this.add(new Student(0L, "JC"));
        this.add(new Student(1L, "Brian"));
        this.add(new Student(2L, "Brandt"));
        this.add(new Student(3L, "Trevor"));
        this.add(new Student(4L, "Neely"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }


    @Override
    public Student[] toArray() {
        Student[] arrayToBePopulated = new Student[0];
        Student[] populatedArray = personList.toArray(arrayToBePopulated);
        return populatedArray;
    }
}
