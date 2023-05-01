package model2;

public class Team {

    // Felt-variable
    private String name;
    private String room;
    private Student[] students = new Student[32]; // Array of students, initially with a length of 32
    private int studentAmount = 0; // Number of students in the team
    private final char[] correct = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};

    // Constructor
    public Team(String name, String room){
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Student[] getStudents() {

        // Create a new array to store the students
        Student[] studentList = new Student[studentAmount];

        // Loop through each student and add them to the new array
        for (int i = 0; i < studentAmount; i++){
                studentList[i] = students[i];
            }

        // Return the new array
        return studentList;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void addStudent(Student student){

        // Add a new student to the array
        students[studentAmount] = student;

        // Increment the number of students in the team
        studentAmount++;
    }

    public void removeStudent(String name) {

        // Create a new array to store the updated list of students
        Student[] studentsList = new Student[studentAmount];
        int studentPlace = 0;

        // Loop through each student
        for (int i = 0; i < studentAmount; i++) {

            // Find the student with the given name
            if (students[i].getName() == name) {
                studentPlace = i; //?

                // Decrement the number of students in the team
                studentAmount--;
            }
        }

        // Copy the students before the removed student to the new array
        for (int j = 0; j < studentPlace; j++) {
            studentsList[j] = students[j];
        }

        // Copy the students after the removed student to the new array
        for (int k = studentPlace; k < studentAmount; k++) {
            studentsList[k] = students[k+1];
        }

        // Set the team's list of students to the updated array
        students=studentsList;
    }

    public double getAverageGradeTeam(){

        double averageGradeTeam = 0;
        double teamGradeSum = 0;

        // Loop through each student
        for (int i = 0; i < studentAmount; i++){

            // Calculate the sum of all the student's grades
            teamGradeSum = teamGradeSum + students[i].getAverageGrade();
        }

        // Divide the sum of grades by the number of students to get the average grade
        averageGradeTeam = teamGradeSum / studentAmount;

        // Return the average grade for the team
        return averageGradeTeam;
    }

    public Student[] highScoreStudents(double minAverage){

        // Create a new array to store the good students
        Student[] goodStudents = new Student[32];
        int goodStudentsAmount = 0;

        // Loop through all the students in the team
        for (int i = 0; i < students.length-1; i++) {

            // Check if the student's average grade is higher than the minAverage
            if (students[i].getAverageGrade() > minAverage) {

                // Add the student to the array of good students
                goodStudents[goodStudentsAmount] = students[i];

                // Increment the number of good students
                goodStudentsAmount++;
            }
        }

        // Create a new array to store the list of good students
        Student[] studentList = new Student[studentAmount];

        for (int i = 0; i < goodStudentsAmount; i++) {

            // Copy the good students to the new array
            studentList[i] = goodStudents[i];
        }

        // Return the list of good students
        return studentList;
    }
    public char[] getCorrect() {
        return correct;
    }

    public String[] infoStudent() {

        String[] info = new String[studentAmount];

        for (int i = 0; i < studentAmount; i++) {
            info[i] = "Name: " + students[i].getName()
                    + "\tAverage grade: " + students[i].getAverageGrade()
                    + "\tAmount correct: " + students[i].correctAnswers(correct);
        }

        return info;
    }

    public int[] howManyCorrectAnswer(){

        int[] correctAmount = new int[correct.length];

        for (int i = 0; i < studentAmount; i++) {
            Student student = students[i];
            for (int j = 0; j < correct.length; j++) {
                if(student.getAnswerMultipleChoice()[j]==correct[j]){
                    correctAmount[j]++;
                }

            }
        }
        return correctAmount;
    }
}
