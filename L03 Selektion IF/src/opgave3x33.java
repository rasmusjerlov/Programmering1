import java.util.Scanner;


public class opgave3x33 {

    public static String compareCosts(double weight, double price, double weight2, double price2) {

        if (weight / price == weight2 / price2) {
            return "The price is the same for both packages";
        }

        if (weight / price < weight2 / price2) {
            return "The first package has a better price";
        } else {
            return "The second package has a better price";
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight of the first package: ");
        double weight  = input.nextDouble();
        System.out.println("Enter price of the first package: ");
        double price = input.nextDouble();
        System.out.println("Enter weight of the second package: ");
        double weight2 = input.nextDouble();
        System.out.println("Enter price of the second package: ");
        double price2 = input.nextDouble();

        System.out.println(compareCosts(weight, price, weight2, price2));


    }
}
