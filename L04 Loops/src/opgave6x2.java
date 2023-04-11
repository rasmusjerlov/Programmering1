import java.util.Scanner;

public class opgave6x2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Insert random number: ");
        int n = input.nextInt();
        System.out.println(sumDigit(n));

    }
    public static int sumDigit(int n) {
        int digit = 0;
        int sum = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }
}