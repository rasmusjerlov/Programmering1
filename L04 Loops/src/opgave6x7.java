import java.util.Scanner;

public class opgave6x7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Insert investment amount in a double value: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Insert annual interest rate in a double value: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Insert length of loan in years: ");
        int years = input.nextInt();
        System.out.println(futureInvestmentValue(investmentAmount, annualInterestRate / 12, years));
//        System.out.println(futureInvestmentValue(1000, 0.0938069, 30));
//
    }
    public static double futureInvestmentValue (double investmentAmount, double monthlyInterestRate, int years) {
//        for (int i = 1; i <= years; i++) {
//            for (int j = 1; j <= 12; j++) {
//                investmentAmount = investmentAmount * (1 + monthlyInterestRate);
//            }
//            System.out.println(i + " " + investmentAmount);
//        }
        int i = 1;
        while (i <= years) {
            int j = 1;
            while (j <= 12) {
                investmentAmount = investmentAmount * (1 + monthlyInterestRate);
                j++;
            }
            System.out.println(i + ". " + investmentAmount);
            i++;
        }
        return investmentAmount;
    }
}
