package test2;

import model2.Student;
import model2.Team;

public class App {
    public static void main(String[] args) {

        // Create instances of the Student class
        Student student1 = new Student("Børge", true, new int[]{4, 7, 7});
        Student student2 = new Student("Peter", true, new int[]{10, 10, 12});
        Student student3 = new Student("Signe", true, new int[]{4, 10, 7});
        Student student4 = new Student("Hanne", true, new int[]{10, 7, 7});
        Student student5 = new Student("Jesper", true, new int[]{2, 2, 0});
        Student student6 = new Student("Birghitte", true, new int[]{2, 10, 10});

        // Create instances of the Team class
        Team team1 = new Team("Datamatiker", "1.32");
        Team team2 = new Team("Datamatiker", "1.33");
        Team team3 = new Team("Datamatiker", "1.34");

        // Add students to the teams
        team1.addStudent(student1);
        team1.addStudent(student2);
        team1.addStudent(student3);
        team2.addStudent(student4);
        team2.addStudent(student5);
        team2.addStudent(student6);

        // Print the students in team 1
        System.out.println("Students in Team 1: ");
        for (int i = 0; i < team1.getStudents().length; i++) {
            System.out.println(team1.getStudents()[i].getName());
        }

        System.out.println();

        // Print the students in team 2
        System.out.println("Students in Team 2: ");
        for (int i = 0; i < team2.getStudents().length; i++) {
            System.out.println(team2.getStudents()[i].getName());
        }

        // Remove a student from team 1
        team1.removeStudent("Peter");

        // Print the students in team 1 after the removal of a student
        System.out.println();
        System.out.println("Students in Team 1: ");
        for (int i = 0; i < team1.getStudents().length; i++) {
            System.out.println(team1.getStudents()[i].getName());
        }

        // Print the highest grade for student 1
        System.out.println(student1.getHighestGrade());

        // Print the average grade for student 1
        System.out.println(student1.getAverageGrade());

        // Print the average grade for team 1
        System.out.println(team1.getAverageGradeTeam());

        System.out.println();

        // Print the good students in team 1 (students with average grades above 2)
        System.out.println("Good students in Team 1: ");
        for (int i = 0; i < team1.highScoreStudents(4).length; i++) {
            System.out.println(team1.highScoreStudents(4)[i].getName());
        }
    }
}