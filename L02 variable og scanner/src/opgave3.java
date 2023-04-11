import java.util.Scanner;

public class opgave3 {
    public static void main(String[] args){
        //Opgave 2.6
        int number = 0;
        int digit = 0;
        int sum = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("Indtast et tal mellem 1-1000: ");
        number = input.nextInt();
        while (number>0){
            //her finder man tallets sidste ciffer
            digit = number % 10;
            //her adderer man digit til sum
            sum = sum + digit;
            //her fjerner man det sidste ciffer fra tallet
            number = number / 10;
        }
        System.out.println("Sum af tallets cifre er: " + sum);
    }
}