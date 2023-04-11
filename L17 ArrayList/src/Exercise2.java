package ex2student;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    /**
     * Tests all the methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);

        System.out.println("Total is: " + sum(ints));
        System.out.println("Minimum is: " + minimum(ints));
        System.out.println("Maximum is: " + maximum(ints));
        System.out.println("Average is: " + average(ints));
        System.out.println("Amount of 0's is: " + zeroes(ints));
        System.out.println("Amount of evens is: " + evens(ints));



        // Test of sum() method: correct sum is 61.

        // Test of minimum() method: correct minimum is -16.

        // Test of maximum() method: correct maximum is 45.

        // Test of average() method: correct average is 7.625.

        // Test of zeroes() method: correct number of zeroes is 2.

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
    }

    // sum made with for statement

    public static int sum(ArrayList<Integer> ints) {
        int sum = 0;
        for (int n : ints) {
            sum = sum + n;
        }
        return sum;
    }
    public static int minimum(ArrayList<Integer> ints) {
        int min = Integer.MAX_VALUE;
        for (Integer n : ints) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
    public static int maximum(ArrayList<Integer> ints) {
        int max = Integer.MIN_VALUE;
        for (Integer n : ints) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
    public static double average(ArrayList<Integer> ints) {
        double average = 0;
        double sum = 0;
        for (Integer d : ints) {
            sum = sum + d;
        }
        average = sum / ints.size();
        return average;
    }
    public static int zeroes(ArrayList<Integer> ints) {
        int amount = 0;
        for (Integer n : ints) {
            if (n == 0) {
                amount++;
            }
        }
        return amount;
    }
    public static ArrayList<Integer> evens(ArrayList<Integer> ints) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for (Integer n : ints) {
            if (n % 2 == 0) {
                evens.add(n);
            }
        }
        return evens;
    }

    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }
}
