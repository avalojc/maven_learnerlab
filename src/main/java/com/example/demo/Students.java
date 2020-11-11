package com.example.demo;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students(){
        this.add(new Student(0L, "JC"));
        this.add(new Student(1L, "Brian"));
        this.add(new Student(2L, "Brandt"));
        this.add(new Student(3L, "Trevor"));
        this.add(new Student(4L, "Neely"));
        this.add(new Student(5L, "Michal"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
