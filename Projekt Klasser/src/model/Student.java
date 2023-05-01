package model;

import java.util.Arrays;

public class Student {
    String name;
    boolean active;
    int[] grades;

    public Student(String name, boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public int getHighestGrade() {
        int highestGrade = 0;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] > highestGrade) {
                highestGrade = grades [i];
            }
        }
        return highestGrade;
    }
    public double getAvgGrade() {
        double averageGrade = 0;
        double gradeSum = 0;

        // Loop through each grade
        for (int i = 0; i < grades.length; i++){

            // Calculate the sum of all the grades
            gradeSum += grades[i];

            // Divide the sum of grades by the number of grades to get the average grade
            averageGrade = gradeSum / grades.length;
        }

        // Return the average grade
        return averageGrade;
    }
}
