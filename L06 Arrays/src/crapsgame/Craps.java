package crapsgame;
import java.util.Scanner;
public class Craps {
    private static int point = 0;

    public static void main(String[] args) {
        playCraps();
        rollForPoint(point);
    }

    private static void playCraps() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to roll you Come Out Roll: ");
        scanner.nextLine();
        int[] face = rollDice();
        point = face[0] + face[1];
        if (point == 2 || point == 3 || point == 12) {
            System.out.println("Your roll is " + point);
            System.out.println("You lose");
            System.exit(point);
        } else if (point == 7 || point == 11) {
            System.out.println("your roll is " + point);
            System.out.println("Congratulations! You win.");
            System.exit(point);
        } else {
            System.out.println("your roll is " + point);
//            rollForPoint(point);
        }
    }

    private static boolean rollForPoint(int point) {
        Scanner scanner = new Scanner(System.in);
        boolean isPoint = false;
        int tempSum = 0;
        while (tempSum != point) {
            System.out.println("Press Enter to roll the dice");
            scanner.nextLine();
            rollDice();
            int[] face = rollDice();
            tempSum = face[0] + face[1];
            System.out.println("your roll is " + tempSum);
            if (tempSum == point) {
                isPoint = true;
                System.out.println("Congratulations! You win.");
                break;
            }
            if (tempSum == 7) {
                System.out.println("You loose");
                break;
            }
        }
        return isPoint;
    }

    private static int[] rollDice() {
        int[] dice = new int[2];

        dice[0] = (int) (Math.random() * 6 + 1);
        dice[1] = (int) (Math.random() * 6 + 1);

        return dice;
    }

}
