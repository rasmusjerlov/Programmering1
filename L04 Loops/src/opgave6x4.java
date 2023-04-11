import java.util.Scanner;

public class opgave6x4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Insert an integer: ");
        int n = input.nextInt();
        reverse(n);

    }
    public static void reverse(int n){
        int reverseOrder = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverseOrder = reverseOrder * 10 + remainder;
            n = n / 10;
        }
        System.out.println("The reverse order of the given number is: " + reverseOrder);
    }
}
