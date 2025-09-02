package BankAccount;

public class Savings extends BankAccount {
    private double YearlyInterestRate;
    public Savings( String owner, double balance, double yInterestRate) {
        super(owner, balance);
        YearlyInterestRate = yInterestRate;
    }
    public Savings(long number, String owner, double balance, double yInterestRate) {
        super(number, owner, balance);
        YearlyInterestRate = yInterestRate;
    }
    public double getYearlyInterest() {
        return YearlyInterestRate;
    }
    public double applyMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = ((YearlyInterestRate/12)/100)*getBalance();
        deposit(monthlyInterest);
        return monthlyInterest;
    }
    public void setYearlyInterest(double y) {
        this.YearlyInterestRate = y;
    }
    public String toString() {
        return String.format("%-15s%s", "Saving", super.toString()) + String.format("\t%-10.2f", YearlyInterestRate);
    }
    
}
