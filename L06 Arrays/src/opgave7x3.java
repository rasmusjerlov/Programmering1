import java.util.*;

public class opgave7x3 {
    public static void main(String[] args) {
        occurrence();
    }

    public static void occurrence() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
//
        System.out.println("Enter length of array: ");
        int n = input.nextInt();
//
//        }
        int[] num = new int[n];
        int[] count = new int[n];
        //Declare counter variable i
        //and temp variable that will
        //temporarily hold the value
        //at a certain index of num[] array
        int i, temp = 0;
        //Initialize num[] array with user input
        for (i = 0; i < num.length; i++) {
            num[i] = random.nextInt(49) + 1;
            //expected input will end when user enters zero

        }//end of for loop

        //value at a given index of num array
        //will be stored in temp variable
        //temp variable will act as an index value
        //for count array and keep track of number
        //of occurences of each number
        for (i = 0; i < num.length; i++) {
            temp = num[i];
            count[temp]++;
        }

        for (i = 1; i < count.length; i++) {

            if (count[i] > 0 && count[i] == 1) {
                System.out.println(i + " occurs " + count[i] + " time.");
            } else if (count[i] >= 2) {
                System.out.println(i + " occurs " + count[i] + " times.");
            }

        }

    }
}
