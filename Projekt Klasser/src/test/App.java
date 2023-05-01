//package test;
//
//import model.Student;
//import model.Team;
//
//public class App {
//    public static void main(String[] args) {
//        Student student1 = new Student("Børge", true, new int[]{02, 4, 7});
//        Student student2 = new Student("Peter", true, new int[]{02, 7, 12});
//        Student student3 = new Student("Signe", true, new int[]{02, 02, 4});
//        Student student4 = new Student("Hanne", true, new int[]{02, 7, 7});
//        Student student5 = new Student("Jesper", true, new int[]{00, 02, 7});
//        Student student6 = new Student("Birghitte", true, new int[]{7, 12, 12});
//
//        Team team1 = new Team("Datamatiker", "1.32");
//        Team team2 = new Team("Datamatiker", "1.33");
//        Team team3 = new Team("Datamatiker", "1.34");
//
//        team1.addStudent(student1);
//        team1.addStudent(student2);
//        team1.addStudent(student3);
//        team2.addStudent(student4);
//        team2.addStudent(student5);
//        team2.addStudent(student6);
//
//        System.out.println("Students in Team 1: ");
//        for (int i = 0; i < team1.getStudents().length; i++) {
//            System.out.println(team1.getStudents()[i].getName());
//            System.out.println("is active: " + team1.getStudents()[i].isActive());
//            System.out.println("Highest grade is: " + team1.getStudents()[i].getHighestGrade());
//            System.out.println("Average grade is: " + team1.getStudents()[i].getAvgGrade());
//            System.out.println();
//        }
//        System.out.println("Good students");
//        for (int i = 0; i < team1.highScoreStudents(5).length; i++) {
//            System.out.println(team1.getStudents()[i].getName());
//            System.out.println(team1.highScoreStudents(5)[i].getName());
//        }
//        System.out.println("Team grade average is: " + team1.getAverageGrade());
//
//        System.out.println();
//
//        team1.removeStudent("Peter");
//
//        System.out.println("Students in Team 1: ");
//        for (int i = 0; i < team1.getStudents().length; i++) {
//            System.out.print(team1.getStudents()[i].getName());
//            System.out.println(" is active: ");
//            System.out.println(team1.getStudents()[i].isActive());
//        }
//
//
//        System.out.println("Students in Team 2: ");
//        for (int i = 0; i < team2.getStudents().length; i++) {
//            System.out.println(team2.getStudents()[i].getName());
//            System.out.println("is active: " + team2.getStudents()[i].isActive());
//            System.out.println("Highest grade is: " + team2.getStudents()[i].getHighestGrade());
//            System.out.println("Average grade is: " + team2.getStudents()[i].getAvgGrade());
//            System.out.println();
//
//        }
//        System.out.println("Team grade average is: " + team2.getAverageGrade());
//
//        System.out.println();
//
//
//
//    }
//}
package test;

import model.Student;
import model.Team;

public class App {

    public static void main(String[] args) {
        Student student1 = new Student("Børge", true, new int[]{4, 7, 7});
        Student student2 = new Student("Peter", true, new int[]{10, 10, 12});
        Student student3 = new Student("Signe", true, new int[]{10, 4, 7});
        Student student4 = new Student("Hanne", true, new int[]{2, 7, 7});
        Student student5 = new Student("Jesper", true, new int[]{4, 10, 12});
        Student student6 = new Student("Birghitte", true, new int[]{10, 12, 12});

        Team team1 = new Team("Datamatiker", "1.32");
        Team team2 = new Team("Datamatiker", "1.33");
        Team team3 = new Team("Datamatiker", "1.34");

        team1.addStudent(student1);
        team1.addStudent(student2);
        team1.addStudent(student3);
        team2.addStudent(student4);
        team2.addStudent(student5);
        team2.addStudent(student6);

        System.out.println("Students in Team 1: ");
        for (int i = 0; i < team1.getStudents().length; i++) {
            System.out.println(team1.getStudents()[i].getName());
            System.out.println("is active: " + team1.getStudents()[i].isActive());
            System.out.println("Highest grade is: " + team1.getStudents()[i].getHighestGrade());
            System.out.println("Average grade is: " + team1.getStudents()[i].getAvgGrade());
            System.out.println();
        }

        System.out.println();

        System.out.println("Students in Team 2: ");
        for (int i = 0; i < team2.getStudents().length; i++) {
            System.out.println(team2.getStudents()[i].getName());
            System.out.println("is active: " + team2.getStudents()[i].isActive());
            System.out.println("Highest grade is: " + team2.getStudents()[i].getHighestGrade());
            System.out.println("Average grade is: " + team2.getStudents()[i].getAvgGrade());
            System.out.println();
        }

        System.out.println();

        team1.removeStudent("Peter");

        System.out.println();

        System.out.println("Students in Team 1: ");
        for (int i = 0; i < team1.getStudents().length; i++) {
            System.out.println(team1.getStudents()[i].getName());
        }

        System.out.println();

        System.out.println("Highest grade is: " + student2.getHighestGrade());

        System.out.println(student1.getAvgGrade());

        System.out.println(team1.getAverageGradeTeam());

        System.out.println("Good students in Team 1: ");
        for (int i = 0; i < team1.highScoreStudents(4).length; i++) {
            System.out.println(team1.highScoreStudents(4)[i].getName());
        }
    }
}
