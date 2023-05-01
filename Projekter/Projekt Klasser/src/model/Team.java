package model;

public class Team {
    private String name;
    private String room;
    private Student[] students = new Student[32];

    private int studentsAmount = 0;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public void addStudent(Student student) {
        students[studentsAmount] = student;
        studentsAmount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public Student[] getStudents() {
        Student[] studentsList = new Student[studentsAmount];

        for (int i = 0; i < studentsAmount; i++) {
            studentsList[i] = students[i];
        }
        return studentsList;
    }

    public void removeStudent(String name) {

        Student[] studentsList = new Student[studentsAmount];
        int studentPlace = 0;

        for (int i = 0; i < studentsAmount; i++) {
            if (students[i].getName() == name) {
                studentPlace = i;
                studentsAmount--;
            }
        }

        for (int j = 0; j < studentPlace; j++) {
            studentsList[j] = students[j];
        }

        for (int k = studentPlace; k < studentsAmount; k++) {
            studentsList[k] = students[k + 1];
        }

        students = studentsList;
    }

    public double getAverageGradeTeam() {
        double teamGradeSum = 0;
        double averageGradeTeam;
        for (int i = 0; i < studentsAmount; i++) {
            teamGradeSum = teamGradeSum + students[i].getAvgGrade();
        }
        averageGradeTeam = teamGradeSum / studentsAmount;
        return teamGradeSum;
    }

//    public Student[] highScoreStudents(double minAverage) {
//
//        Student[] goodStudents = new Student[32];
//        int goodStudentsAmount = 0;
//
//        for (int i = 0; i < studentsAmount - 1; i++) {
//            if (students[i].getAvgGrade() > minAverage) {
//                goodStudents[goodStudentsAmount] = students[i];
//                goodStudentsAmount++;
//            }
//        }
//
//        Student[] studentsList = new Student[studentsAmount];
//
//        for (int i = 0; i < studentsList.length; i++) {
//            studentsList[i] = goodStudents[i];
//        }
//
//        return studentsList;
//    }

    public Student[] highScoreStudents(double minAverage) {
        Student[] goodStudents = new Student[32];
        int goodStudentsAmount = 0;

        for(int i = 0; i < students.length; i++) {
            if (students[i].getAvgGrade() >= minAverage) {
                goodStudents[goodStudentsAmount] = students[i];
                goodStudentsAmount++;
            }
        }
        Student[] studentsList = new Student[studentsAmount];

        for (int i = 0; i < goodStudentsAmount; i++) {
            studentsList[i] = goodStudents[i];
        }
        return studentsList;
    }


    }
