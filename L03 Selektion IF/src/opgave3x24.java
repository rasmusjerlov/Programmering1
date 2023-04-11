import java.util.Scanner;
import java.util.Random;

public class opgave3x24 {
    public static String chooseCard(String suit, int card) {
        String chosen = "";
        if (card == 1) {
            chosen = "Ace";
        } else if (card == 2) {
            chosen = "2";
        } else if (card == 3) {
            chosen = "3";
        } else if (card == 4) {
            chosen = "4";
        } else if (card == 5) {
            chosen = "5";
        } else if (card == 6) {
            chosen = "6";
        } else if (card == 7) {
            chosen = "7";
        } else if (card == 8) {
            chosen = "8";
        } else if (card == 9) {
            chosen = "9";
        } else if (card == 10) {
            chosen = "10";
        } else if (card == 11) {
            chosen = "Jack";
        } else if (card == 12) {
            chosen = "Queen";
        } else if (card == 13) {
            chosen = "King";
        }

        return "You got " + chosen + " of " + suit;
    }

    public static void main(String[] args) {
        Random random = new Random();
        String suit = "";
        int card = random.nextInt(13)+1;
        int suits = random.nextInt(4)+1;
        if(suits == 1) {
            suit = "Clubs";
        } else if (suits == 2) {
            suit = "Diamonds";
        } else if (suits == 3) {
            suit = "Spades";
        } else if (suits == 4) {
            suit = "Hearts";
        }

        System.out.println(chooseCard(suit, card));

    }
}
