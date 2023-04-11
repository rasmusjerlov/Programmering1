import java.util.Scanner;

public class opgave3x18 {

    public static String costOfShipping(double weight) {
        double first = 3.5;
        double second = 5.5;
        double third = 8.5;
        double fourth = 10.5;

        if (weight > 0 && weight <= 1) {
            return "Price of shipping " + weight + " pounds is" + first +  " dollars";
        } else if (weight > 1 && weight <= 3) {
            return "Price of shipping " + weight + " pounds is" + second +  " dollars";
        } else if (weight > 3 && weight <= 10) {
            return "Price of shipping " + weight + " pounds is" + third +  " dollars";
        } else if (weight > 10 && weight <= 20) {
            return "Price of shipping " + weight + " pounds is" + fourth +  " dollars";
        } else if (weight > 20){
            return "The package cannot be shipped due to overweight";
        }



        return null;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight of package in pounds: ");
        double weight = input.nextDouble();

        System.out.println(costOfShipping(weight));



    }
}
