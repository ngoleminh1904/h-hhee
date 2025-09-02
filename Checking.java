package BankAccount;

public class Checking extends BankAccount {
    public Checking(String owner,double balance) {
        super(owner, balance);
    }
    public Checking(String owner, long number, double balance) {
        super(number,owner,balance);
    }
    public String toString() {
        return String.format("%-15s%s", "Checking",super.toString());
        // return "Checking" + super.toString();
    }
}
