package com.example.demo;


import java.util.Arrays;
import java.util.List;

public class Instructor extends Person implements Teacher {


    public Instructor() {
        super(id);
    }

    @Override
    public void teach(double numberOfHours, Learner learner) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(double numberOfHours, Learner[] learners) {
        List<Learner> learnerIterable = Arrays.asList(learners);
        double numberOfHousrPerLearner = numberOfHours/learners.length;
        learnerIterable.forEach( (n) -> n.learn(numberOfHousrPerLearner) );
    }
}
