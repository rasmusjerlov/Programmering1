import java.util.Scanner;

public class opgave6x6 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n = input.nextInt();
        displayPattern(n);

    }

    public static void displayPattern(int n) {
        int j = 1;
        int i = 1;
        int y = n;
        while (j <= y) {
            j++;
            i = 1;
            System.out.println();
            while (i < j) {
                System.out.print(i);
                i++;

            }
        }
    }
}
