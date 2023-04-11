package twodice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    private static int rollCount = 0;
    private static int sum = 0;
    private static double average = 0;
    private static int max = 0;
    private static int setCount = 0;
    private static int[] occCount = new int [6];

    public static void main(String[] args) {
        System.out.println("Welcome to the game of RollOneDie");
        printRules();
        System.out.println();

        playOneDie();

        System.out.println();
        System.out.println("Thank you for playing RollTwoDice");

    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollOneDie:");
        System.out.println("The player throws one die as long as he/she wants.");
        System.out.println("=====================================================");
    }

    private static void playOneDie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll? ('no' stops) ");
        String answer = scanner.nextLine();
        while (!answer.equals("no")) {
            int[] face = rollTwoDice();
            System.out.println("Eyes: " + Arrays.toString(face));
            System.out.println();

            updateStatistics(face);

            System.out.print("Roll? ('no' stops) ");
            answer = scanner.nextLine();
        }

        printStatistics();
        scanner.close();
    }

    private static int[] rollTwoDice() {
        int[] dice = new int [2];
        dice[0] = (int) (Math.random() * 6 + 1);
        dice[1] = (int) (Math.random() * 6 + 1);
        return dice;
    }

    private static void updateStatistics(int[] face) {
        rollCount++;
        sum += face[0] + face[1];
        average = sum / rollCount;
        if(face[0] + face[1] > max) {
            max = face[0] + face[1];
        }
        if(face[0] == face[1]) {
            setCount++;
        }
        for (int i = 0; i < occCount.length; i++) {
            if (i == face[0] - 1 || i == face[1] - 1) {
                occCount[i]++;
            }
        }
//        if(face[0] == 1 || face[1] == 1) {
//            occCount[0]++;
//        }
//        if(face[0] == 2 || face[1] == 2) {
//            occCount[1]++;
//        }
//        if(face[0] == 3 || face[1] == 3) {
//            occCount[2]++;
//        }
//        if(face[0] == 4 || face[1] == 4) {
//            occCount[3]++;
//        }
//        if(face[0] == 5 || face[1] == 5) {
//            occCount[4]++;
//        }
//        if(face[0] == 6 || face[1] == 6) {
//            occCount[5]++;
//        }
    }
//    private static int sum(int[] a) {
//        sum = sum + a[0] + a[1];
//        return sum;
//    }

    private static int[] occurrences(int[] face) {
        int occCount = 0;
        int[] occ = new int[6];

        return occ;
    }


    private static void printStatistics() {
        System.out.println("\nResults:");
        System.out.println("-------");
        System.out.println("Roll count:     " + rollCount);
        System.out.println("Sum:            " + sum);
        System.out.println("Average:        " + average);
        System.out.println("Best roll:      " + max);
        System.out.println("Number of sets: " + setCount);
        System.out.println("Amount of 1's: " + occCount[0]);
        System.out.println("Amount of 2's: " + occCount[1]);
        System.out.println("Amount of 3's: " + occCount[2]);
        System.out.println("Amount of 4's: " + occCount[3]);
        System.out.println("Amount of 5's: " + occCount[4]);
        System.out.println("Amount of 6's: " + occCount[5]);
    }
}
