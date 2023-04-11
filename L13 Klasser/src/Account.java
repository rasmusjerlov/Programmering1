import java.lang.reflect.AnnotatedArrayType;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private double monthlyInterestRate;
    private static int nextId;
    Date created = new Date();


    public Account(int id, int balance, double annualInterestRate) {
        this.id = id;
        nextId++;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.monthlyInterestRate = getMonthlyInterestRate();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate() {
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getMonthlyInterestRate() {
        this.monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }

    public double withdraw(double wAmount) {
        this.balance = balance - wAmount;
        return balance;
    }
    public double deposit(double dAmount) {
        this.balance = balance + dAmount;
        return balance;
    }
    @Override
    public String toString() {
        return "New account id is: " + id +
                "\nBalance is: " + balance +
                "\nCreated: " + created +
                "\nAnnual interst rate is:" + getAnnualInterestRate() + " %" +
                "\nMonthly interest rate is: " + getMonthlyInterestRate() + " %";
    }

}
