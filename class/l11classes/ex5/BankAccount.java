package l11classes.ex5;

public class BankAccount {
    private String id;
    private String owner;
    private double balance;
    private int numTransactions;
    private static int counter;

    public BankAccount(String owner){
        this.owner = owner;
        counter++;
        id = "SBBG" + String.format("%06d",counter);
    }
    public void deposit(double amount){
         balance = balance + amount;
         numTransactions++;
    }
    public boolean withdraw(double amount){
        boolean result = true;
        if (amount>balance){
            result = false;
        }
        else {
            balance = balance - amount;
            numTransactions++;
        }
        return result;
    }
    public void applyMonthlyFees(){
        balance = balance - 2.0;
        if (numTransactions > 3){
            balance = balance - 0.001 * balance;
        }
    }

    public boolean transfer(double amount, BankAccount other){
        boolean result = true;
        if( amount < balance ){
            other.deposit(amount);
            withdraw(amount);
        }
        else {
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                String.format(", balance=%.2f", balance) +
                ", numTransactions=" + numTransactions +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumTransactions() {
        return numTransactions;
    }
}
