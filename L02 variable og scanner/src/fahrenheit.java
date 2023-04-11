import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        //ask user for input
        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit   = input.nextDouble();

        //convert fahrenheit to celsius
        double celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius");

    }
}
