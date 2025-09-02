package BankAccount;

public class Investment extends BankAccount {
    private String type;
    public Investment (String owner, double balance, String type) {
        super(owner, balance);
        this.type = type;
    }
    public Investment (long number, String owner, double balance, String type) {
        super(number,owner,balance);
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        if ( type.equals("Property") || type.equals("Growth") || type.equals("Shares") ) {
            this.type = type;
        }
    }
    public double getProfitOrLoss(double risk) {
        double changes;
        if (risk >= 0.5) {
            changes = getBalance()*0.05;
            balance +=changes;
        } else {
            changes = getBalance()*(0.02);
            changes = -changes;
            balance += changes;
        }
        return changes;
    }
    public String toString() {
        return String.format("%-15s%s", "Investment", super.toString()) + String.format("\t%-15s",type);
    }
}
