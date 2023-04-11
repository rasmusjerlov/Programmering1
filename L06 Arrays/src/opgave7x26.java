import java.util.Arrays;
import java.util.Scanner;

public class opgave7x26 {
    boolean sorted;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of characters in array: ");
        int[] list = new int[input.nextInt()];
        isSorted(list);
    }

    public static boolean isSorted(int[] list) {
        Scanner input = new Scanner(System.in);
        boolean isSorted = false;
        int[] newArr = list;
        int num = 0;
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter an integer: ");
            newArr[i] = input.nextInt();
            if (newArr[i] > max) {
                max = newArr[i];
                isSorted = true;
                System.out.println("The array is sorted.");
            } else {
                isSorted = false;
                System.out.println("The array is not sorted.");
                break;
            }
        }
            return isSorted;
    }
}

