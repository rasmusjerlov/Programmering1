package su1;

public class Account {
    private int number;
    private int saldo = 0;
    private int amount;
    private String type;
    private String status = "Open";

    public Account(String type, int number, String status) {
        this.number = number;
        this.saldo = saldo;
        this.status = "Open";
        this.type = type;

    }

    public int insertAmount(int beløb) {
        if(this.status.equals("Open")) {
            saldo = saldo + beløb;
        }
        return saldo;
    }

    public String getStatus() {
        this.status = status;
        return status;
    }
    public String closeAccount() {
        status = "Closed";
        System.out.println("The account is now " + status);
        return status;
    }

    public String getType() {
        type = type;
        return type;
    }
    public int getSaldoD() {
        saldo = saldo + amount;
        return saldo;
    }
    public int getSaldoW() {
        saldo = saldo - amount;
        return saldo;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = number;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
