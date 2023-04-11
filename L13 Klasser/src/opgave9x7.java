import java.util.Date;
import java.util.Scanner;
public class opgave9x7 {
    public static void main(String[] args) {
        Scanner wd = new Scanner(System.in);
        Account account = new Account(0, 0, 1.2);
        Account specAccount = new Account(1, 500, 10);
        System.out.println(specAccount);
        System.out.println("Do you wish to withdraw press 1 \nDo you wish to deposit press 2");
        int n = wd.nextInt();
        if (n == 1) {
            System.out.println("Enter the amount you wish to withdraw.");
            int with = wd.nextInt();
            System.out.println("Balance after withdrawal is: " + specAccount.withdraw(with));
        } else if (n == 2) {
            System.out.println("Enter the amount you wish to deposit.");
            int dep = wd.nextInt();
            System.out.println("Balance after deposit is: " + specAccount.deposit(dep));
        }
        Date transaction = new Date();
        System.out.println("Latest transaction happened at: " + transaction);


    }
}
