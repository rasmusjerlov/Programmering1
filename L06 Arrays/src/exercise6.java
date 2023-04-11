import java.util.Arrays;

public class exercise6 {
    public static void main(String[] args) {
        int[] t = {4, 16, 8, 10, 12, 19};
        System.out.println(secondHighest(t));
        swapLastAndFirst(t);

    }

    public static void swapLastAndFirst(int[] t) {
        int temp = 0;
        temp = t[t.length - 1]; // Stores the value at the last index at
        t[t.length - 1] = t[t.length - t.length];
        t[t.length - t.length] = temp;

        System.out.println(t[0] + " & " + t[t.length - 1]);
    }

    public static void changeZeros(int[] t) {

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                t[i] = 0; // if t[i] % 2 == 0, sets the value and index i equal to 0
            }
        }
    }

    public static int secondHighest(int[] t) {
        int sH = 0;
        Arrays.sort(t); // Sort the array
        System.out.println(Arrays.toString(t)); // Shows the sorted array
        sH = t[t.length - 2]; // t[t.length - 2] because the array starts at 0.
        System.out.println("The second highest value in the array is: ");
        return sH;

    }

}
