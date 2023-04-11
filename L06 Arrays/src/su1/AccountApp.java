package su1;
import jdk.jshell.Snippet;

import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to deposit money press 1. " + " \nIf you want to withdraw money press 2." + "\nIf you want to close the account press 3.");
        int dow = scanner.nextInt();
        if (dow == 1) {
            deposit();
        } else if (dow == 2){
            withdraw();
        }
        if (dow == 3) {
            closeAccount();
        }

    }
    public static void deposit() {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account ("Savings", 1, "Open");
        System.out.println("Account: " + account.getNumber());
        System.out.println("Status: " + account.getStatus());
        System.out.println("Account type: " + account.getType());
        System.out.println("Current amount: " + account.getAmount());
        System.out.println("Insert amount you wish to deposit: ");
        int n = scanner.nextInt();
        account.setAmount(n);
        //TODO
        System.out.println("You deposit: " + account.getAmount());
        System.out.println("New balance is: " + account.getSaldoD());
    }
    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account ("Savings", 1, "Open");
        System.out.println("Account: " + account.getNumber());
        System.out.println("Status: " + account.getStatus());
        System.out.println("Account type: " + account.getType());
        System.out.println("Current amount: " + account.getAmount());
        System.out.println("Insert amount you wish to withdraw: ");
        int n = scanner.nextInt();
        account.setAmount(n);
        //TODO
        System.out.println("You withdrew: " + account.getAmount());
        System.out.println("New balance is: " + account.getSaldoW());
    }
    public static void closeAccount() {
        Account account = new Account ("Savings", 1, "Open");
        account.closeAccount();
    }

}
