import java.util.Scanner;

public class opgave3x23 {

    public static String coordinates(double x, double y){

        if (x > 5.0 || x < -5.0){
            return x + ", " + y + " is not a point in the rectangle.";
        }
        if (y > 2.5 || y < -2.5) {
            return x + ", " + y + " is not a point in the rectangle.";
        }

        if (x < 5.0 && x > -5.0) {
            if (y < 2.5 && y > -2.5) {
                return "{" + x + ", " + y + "}" + " is a point in the rectangle.";
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a x-coordinate: ");
        double x = input.nextDouble();
        System.out.println("Enter a y-coordinate: ");
        double y = input.nextDouble();

        System.out.println(coordinates(x, y));
    }
}
