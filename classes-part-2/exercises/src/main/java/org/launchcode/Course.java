package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, ArrayList<Student> enrolledStudents, Teacher instructor) {
        this.topic = topic;
        this.enrolledStudents = enrolledStudents;
        this.instructor = instructor;
    }

    public String getTopic() {
        return topic;
    }

    void setTopic(String aTopic) {
        topic = aTopic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    @Override
    public String toString() {
        String courseInfo = String.format("%s teaches %s", this.instructor, this.topic);
        return courseInfo;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    @Override
    public boolean equals(Object toBeCompared) {
        if(toBeCompared == this) {
            return true;
        }
        if(toBeCompared == null) {
            return false;
        }
        if(toBeCompared.getClass() != getClass()) {
            return false;
        }
        Course theCourse = (Course) toBeCompared;
        return theCourse.getTopic() == getTopic();
    }
}
