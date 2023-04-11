import java.util.Scanner;

public class opgave7x30 {
    boolean con;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        isConsecutiveFour();
    }

    public static boolean isConsecutiveFour() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int[] values = new int[input.nextInt()];
        boolean con = false;
        int[] newArr = values;
        int num = 0;
        int prev = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter an integer: ");
            newArr[i] = input.nextInt();
                if (newArr[i] == prev) {
                    prev = newArr[i];
                    con = true;
                    System.out.println("The integers are in consecutive order.");
                } else {
                    con = false;
                    System.out.println("The integers are not in consecutive order.");
                }


            }
        return con;
    }
}
