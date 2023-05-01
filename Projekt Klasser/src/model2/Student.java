package model2;

public class Student {

    // Felt-variable
    private String name;
    private boolean active;
    private int[] grades; // Array of grades for the student
    private char[] answerMultipleChoice = new char[10];

    // Constructor
    public Student(String name, boolean active, int[] grades){
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

    public int getHighestGrade(){

        int highestGrade = 0;

        // Loop through each grade
        for (int i = 0; i < grades.length; i++) {

            // Find the highest grade in the array
            if (highestGrade < grades[i]) {
                highestGrade = grades[i];
            }
        }

        // Return the highest grade
        return highestGrade;
    }

    public double getAverageGrade(){

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

    public char getAnswers(char[] answers){

        char a = 0;
        return a;
    }
    public void setAnswerMultipleChoice(){

        char[] answers = {'A','B','C','D'};

        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random()*4);
            this.answerMultipleChoice[i] = answers[r];
        }
    }

    public char[] getAnswerMultipleChoice() {
        return answerMultipleChoice;
    }

    public int correctAnswers(char[] correct){
        int result = 0;

        for (int i = 0; i < 10; i++) {
            if(correct[i]==getAnswerMultipleChoice()[i]){
                result++;
            }
        }

        return result;
    }
}
