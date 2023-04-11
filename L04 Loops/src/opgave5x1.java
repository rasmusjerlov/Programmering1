import java.util.Scanner;
import java.util.Random;

public class opgave5x1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int max = 0;
        int min = 0;
        int negCount = 0;
        int posCount = 0;
        int num = 0;
        double total = 0;
        boolean zero = false;
        System.out.println("Enter an integer. Zero to stop: ");
        while (!zero) {
            num = input.nextInt();
            if (num == 0) zero = true;
            else if (num > 0) {
                posCount++;
                if (num > max) {
                    max = num;
                }
                total += num;
            } else {
                negCount++;
                if (num < min) {
                    min = num;
                }
                total += num;
            }
        }
        if (total != 0) {
            double average = total / (posCount + negCount);
            System.out.println("The number of positives is " + posCount);
            System.out.println("The number of negatives is " + negCount);
            System.out.println("The sum is " + total);
            System.out.println("The average of " + total + " is " + average);
            System.out.println("The highest number is: " + max);
            System.out.println("The lowest number is: " + min);
        } else {
            System.out.println("No numbers are entered except 0");
        }
    }
}