package test2;

import model2.Student;
import model2.Team;

import java.util.Scanner;

public class KommunikationsApp {
    private String yes = "y";
    private String no = "n";

    public static void main(String[] args) {
        System.out.println("Do you wish to create a team? Y/N");
        Scanner create = new Scanner(System.in);
        String answerTeam = create.next();
        if (answerTeam.equals("y")) {
            System.out.println(answerTeam);
            System.out.println("How many teams do you wish to create?");
            int answerNumberOfteams = create.nextInt();
            Team[] teamsCreated = new Team[answerNumberOfteams];
            for (int i = 0; i < answerNumberOfteams; i++) {
                System.out.println("What should the team be called? no to stop");
                String answerTeamName = create.next();
                System.out.println(answerTeamName);
                System.out.println("What room should the team be located in?");
                String answerTeamRoom = create.next();
                System.out.println(answerTeamRoom);
                Team team = new Team(answerTeamName, answerTeamRoom);
                teamsCreated[i] = team;
                System.out.println("How many students are on the team?");
                int answerTeamNoOfStudents = create.nextInt();
                Student[] studentsCreated = new Student[answerTeamNoOfStudents];
                for (int j = 0; j < answerTeamNoOfStudents; j++) {
                    System.out.println("What is the name of the student?");
                    String answerStudentName = create.next();
                    System.out.println("Is the student active? true/false");
                    boolean answerStudentActive = create.nextBoolean();
                    System.out.println("How many grades has the student received?");
                    int answerStudentNofGrades = create.nextInt();
                    int[] grades = new int[answerStudentNofGrades];
                    System.out.println("Input the student's grades. Press enter for each grade");
                    for (int n = 0; n < grades.length; n++) {
                        grades[n] = create.nextInt();
                        System.out.println(grades[n]);
                    }
                    Student student = new Student(answerStudentName, answerStudentActive, grades);
                    studentsCreated[j] = student;
                    studentsCreated[j].setAnswerMultipleChoice();
                    teamsCreated[i].addStudent(student);
                }

                System.out.println("Students in team " + answerTeamName + "\n" +
                        "Located in: " + answerTeamRoom);
                System.out.println("------------------");
                for (int r = 0; r < answerTeamNoOfStudents; r++) {
                    System.out.println("Name" + "                                       " + studentsCreated[r].getName());
                    System.out.println("Average grade: " + "                            " + studentsCreated[r].getAverageGrade());
                    System.out.println("Correst answers in multiple choice test: " + "  " + studentsCreated[r].correctAnswers(teamsCreated[i].getCorrect()));
                    System.out.println("---------------------------------------------------------");
                }
            }
        } else {
            System.out.println("The program is closing...");
        }


    }
}
