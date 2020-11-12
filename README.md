#Questions: 
##Classroom
* ##### Constructor
    - No Arg : how does the "this()" method work
    - Two Arg : Standard 
* ##### Host Lecture Method. Overloaded method
    - Why did you seprate the singleton change it from:
        *         Person instructorAsPerson = Instructors.getInstance().findById(idOfInstructor);
                  Teacher instructorAsTeacher = (Teacher) instructorAsPerson;
    - To this:
        *             Instructors instructorsSingleton = Instructors.getInstance();
                      Person instructorAsPerson = instructorsSingleton.findById(idOfInstructor);
                      Teacher instructorAsTeacher = (Teacher) instructorAsPerson;
                      hostLecture(instructorAsTeacher, numberOfHours);
##  People
* the sometype of person
* line 11
* line 47

## Students
*toArray Overriden method