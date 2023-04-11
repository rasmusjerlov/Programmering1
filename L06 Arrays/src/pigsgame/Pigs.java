package pigsgame;
import java.util.Arrays;
import java.util.Scanner;

public class Pigs {
    private static int[] players = new int[2];
    private static int score = 0;
    private static int[] rollCount = new int[2];
    private static int[] turnCount = new int[2];
    private static double[] avg = new double[2];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the final score limit: ");
        score = input.nextInt();
        twoPlayers();
        updateStatistics();
    }

    private static void twoPlayers() {
        while (players[0] <= score && players[1] <= score) {
            for (int i = 0; i < players.length; ) {
                Scanner input = new Scanner(System.in);
                int tempPoint = 0;
                int[] face = new int[2];
                System.out.println("---------------");
                turnCount[i]++;
                System.out.println("Player " + (i + 1) + "'s turn:");
                System.out.println("Roll? ('no' stops) ");
                String answer = input.nextLine();
                rollCount[i]++;
                while (!answer.equals("no") || face[0] + face[1] == 2) {
                    face = rollDice();
                    tempPoint += face[0] + face[1];
                    System.out.println("Your roll is: " + Arrays.toString(face));
                    if (players[i] + tempPoint >= score) {
                        System.out.println("Player " + (i + 1) + " won with the score " + (players[i] + tempPoint) + " . Congratulations!");
                        updateStatistics();
                        System.exit(0);
                    }
                    if (face[0] + face[1] == 2) {
                        tempPoint = 0;
                        break;
                    }
                    System.out.println("Your temporary sum is " + tempPoint);
                    System.out.println("Your score is " + players[i]);
                    System.out.println();
                    System.out.println("Roll? ('no' stops) ");
                    answer = input.nextLine();
                    rollCount[i]++;
                }
                players[i] += tempPoint;
                i++;
            }
        }
    }

    private static void updateStatistics() {
        avg[0] = rollCount[0] / (double) turnCount[0];
        avg[1] = rollCount[1] / (double) turnCount[1];
        System.out.println("The average of Player 1's rolls per turn is " + avg[0]);
        System.out.println("The average of Player 2's rolls per turn is " + avg[1]);

    }

    private static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

    private static int[] rollDice() {
        int[] dice = new int[2];

        dice[0] = (int) (Math.random() * 6 + 1);
        dice[1] = (int) (Math.random() * 6 + 1);

        return dice;
    }
}
