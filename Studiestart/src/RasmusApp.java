import java.util.Scanner;
public class RasmusApp {
    public static void main(String[] args) {
        double salaryAbove50 = 0.1;
        double salaryBelow35 = 0.05;
        double salaryElse = 0.08;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.next();
        System.out.println("Input salary: ");
        int salary = scanner.nextInt();
        System.out.println("Input age: ");
        int age = scanner.nextInt();
        if (age < 35) {
            System.out.println(name + " your new salary is: " + (salary * (1 + salaryBelow35)));
        } else if (age >= 50) {
            System.out.println(name + " your new salary is: " + (salary * (1 + salaryAbove50)));
        } else {
            System.out.println(name + " your new salary is: " + (salary *(1 + salaryElse)));
        }
    }
}
