package com.example.demo;

public enum Educator implements Teacher{
    LEON, FRED, DAVID;

    private final Instructor instructor;
    private double timeWorked;

    Educator() {
        this.instructor = new Instructor((long)ordinal(), name()) {
            //Override
//            @Override
            public void teach(Learner learner, double numberOfHours) {
                super.teach( numberOfHours, learner );
                Educator.this.timeWorked += numberOfHours;
            }
        };
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(double numberOfHours, Learner learner) {
        instructor.teach( numberOfHours, learner );
    }

    @Override
    public void lecture(double numberOfHours, Learner[] learners) {
        instructor.lecture( numberOfHours, learners );
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public String toString() {
        return "Educator{"+
                "instructors="+instructor+
                "}";
    }
}
