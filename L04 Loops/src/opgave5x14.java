import java.util.Scanner;

public class opgave5x14 {
    public static String greatestCommonDivisor(int n1, int n2) {
        int d = 0;

        for(int i = 1; i <= n1 && i <= n2; i++ ) {
            if ((n1 % i == 0) && n2 % i == 0) {
                d = i;
            }
        }
        System.out.println("GCD is " + d);

        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 integers with a positive value");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        greatestCommonDivisor(n1, n2);



    }
}

