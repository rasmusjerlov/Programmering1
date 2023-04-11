import java.util.Random;
import java.util.Scanner;

public class opgave7x5 {
    public static void main(String[] args) {
        evenAndOdd();
    }

    public static void evenAndOdd() {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int negCount = 0;
        int posCount = 0;
        int num = 0;
        double total = 0;
        boolean zero = false;
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter next number in array: ");
            arr[i] = input.nextInt();

        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                posCount++;
            } else {
                negCount++;
            }

        }
        System.out.println("The number of positives is " + posCount);
        System.out.println("The number of negatives is " + negCount);
    }


}


