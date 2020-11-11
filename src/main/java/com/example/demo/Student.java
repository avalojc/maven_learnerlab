package com.example.demo;

public class Student extends Person implements Learner {
    public double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
    }

    public void learn (double numberOfHours){
        double result = this.getTotalStudyTime()+numberOfHours;
        setTotalStudyTime(result);
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
}
