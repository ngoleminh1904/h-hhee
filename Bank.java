package BankAccount;

public class Bank {
    private BankAccount[] accounts;
    private int count;

    public Bank() {
        accounts = new BankAccount[50];
        count = 0;
    }

    public int size() {
        return count;
    }

    public void add(BankAccount ba) {
        accounts[count] = ba;
        count++;
    }

    public BankAccount find(long number) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getNumber() == number) {
                return accounts[i];
            }
        }
        return null;
    }

    public String toString() {

        // String str =  String.format("%-10d\t%-30s\t$%-10.2f",number, owner, balance);
        String printOut = String.format("%-15s\t%-15s\t%-30s\t%-15s\t%-15s\n",
                "Type", "Number", "Owner", "Balance", "Interest/Type");
        for ( int i = 0; i < count; i++) {
            printOut+= accounts[i].toString()+ "\n";
        }
        return printOut;
    }
    public BankAccount remove(long number) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getNumber() == number) {
                BankAccount removeAccount = accounts[i];
                for (int k = i; k< count-1; k++) {
                    accounts[k] = accounts[k+1];
                }
                accounts[count-1] = null;
                count--;
                return removeAccount;
            }
        }
        return null;
    }
    public void sort() {
        for (int i=0; i<count;i++) {
            BankAccount currentValue = accounts[i];
            int j = i;
            while (j>0 && currentValue.getBalance() < accounts[j-1].getBalance()) {
                accounts[j] = accounts[j-1];
                j--;
            }
            accounts[j] = currentValue;
        }
    }
    
}
