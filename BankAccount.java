package BankAccount;

public abstract class BankAccount {
    private long number;
    private String owner;
    protected double balance;
    private static long nextNumber = 1111111111;

    public BankAccount( String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.number = nextNumber;
        nextNumber++;
    }
    public BankAccount( long number, String owner, double balance) {
        this.number = nextNumber;
        nextNumber++;
        this.owner = owner;
        this.balance = balance;
    }
    public long getNumber() {
        return number;
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    public void setNumber(long n) {
        this.number = n;
    } 
    public void setOwner(String o) {
        this.owner = o;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance +=amount;
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && balance>= amount) {
            balance -=amount;
            return true;
        }
        return false;
    }
    public String toString() {
        String str =  String.format("\t%-10d\t%-30s\t$%-10.2f",number, owner, balance);
        return str;
    }
}
