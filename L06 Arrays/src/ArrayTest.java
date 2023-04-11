import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
//        // Here I insert the values obtained from the assignment
        int[] values = {4, 6, 7, 2, 3};
        double [] doubleValues = {4.1, 6.5, 7.3, 2.7, 3.8};
        int [] a = {4, 6, 7, 2, 3};
        int [] b = {4, 6, 8, 2, 6};
        int [] a1 = {4, 6, 7, 2, 3};
        int [] b1 = {4, 6, 8};
        // Here I start printing out my answers to each exercise with titles to make it more enjoyable to look at
        // EXERCISE 2
        System.out.println("EXERCISE 2");
        System.out.println(Arrays.toString(a));
        System.out.println("The sum of the array is: " + sum(values));

        // EXERCISE 2.1
        System.out.println("EXERCISE 2.1");
        System.out.println(Arrays.toString(doubleValues));
        System.out.println("The sum of the array is: " + sumDoubles(doubleValues));
        // EXERCISE 3
        System.out.println("EXERCISE 3");
        System.out.println("The sum of the 2 arrays");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("is");
        System.out.println(Arrays.toString(sumArrays(a, b)));
        // EXERCISE 3.1
        System.out.println("EXERCISE 3.1");
        System.out.println("The sum of the two arrays: ");
        System.out.println(Arrays.toString(a1) + " + " + Arrays.toString(b1));
        System.out.println("with the second array missing the last to digits is: ");
        System.out.println(Arrays.toString(sumArraysLength(a1, b1)));
        // EXERCISE 4
        System.out.println("EXERCISE 4");
        System.out.println("Does the array have an uneven number in it?");
        System.out.println(hasUneven(b));
    }
    public static int sum (int[] t){
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }
    public static double sumDoubles (double[] t) {
        double sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }
    public static int[] sumArrays(int[] a, int[] b) {
        int[] result = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }
    public static int[] sumArraysLength(int[] a, int[] b) {
        int[] result = new int[Math.max(a.length, b.length)];
        int[] longestArray;
        int[] shortestArray;
        if (a.length > b.length) {
            longestArray = a;
            shortestArray = b;
        } else {
            longestArray = b;
            shortestArray = a;
        }
        for (int i = 0; i < shortestArray.length; i++) {
            result[i] = a[i] + b[i];
        }
        for (int j = shortestArray.length; j < longestArray.length ; j++) {
            result[j] = longestArray[j];
        }
        return result;


    }
    public static boolean hasUneven(int[] t) {
        boolean unEven = true;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 1) {
                unEven = true;
            } else {
                unEven = false;
            }
        }
        if (unEven = true) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }
        return unEven;
    }
}