package org.example.GradeCalculator;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::mutiplyCreditAndCourseGrade)
                .sum();
        /*double multipliedCreditAndCourseGrade = 0;
        for (Course courses : courses){
            multipliedCreditAndCourseGrade += courses.mutiplyCreditAndCourseGrade();
        }
        return multipliedCreditAndCourseGrade;*/
    }

    public int calculateTotalCompletedCredit() {
        return  courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
