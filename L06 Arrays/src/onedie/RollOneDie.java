package onedie;

import java.util.Scanner;

public class RollOneDie {
    private static int rollCount = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of RollOneDie");
        printRules();
        System.out.println();

        playOneDie();

        System.out.println();
        System.out.println("Thank you for playing RollOneDie");
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
            int face = rollDie();
            System.out.println("Eyes: " + face);
            System.out.println();

            updateStatistics(face);

            System.out.print("Roll? ('no' stops) ");
            answer = scanner.nextLine();
        }

        printStatistics();
        scanner.close();
    }

    private static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

    private static void updateStatistics(int face) {
        rollCount++;
    }

    private static void printStatistics() {
        System.out.println("\nResults:");
        System.out.println("-------");
        System.out.printf("%17s %4d\n", "Roll count:", rollCount);
    }
}
