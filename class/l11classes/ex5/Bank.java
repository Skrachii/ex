package l11classes.ex5;

import java.util.ArrayList;

public class Bank {

    private String name;

    ArrayList<BankAccount> accounts;


    public Bank(String name){
        this.name = name;
        accounts = new ArrayList<BankAccount>();
    }

    public String addAccount(String owner){
        BankAccount account = new BankAccount(owner);
        accounts.add(account);
        return account.getId();
    }

    public boolean removeAccount(String id){
        BankAccount ba = getAccountForId(id);
        if( ba != null ) {
            accounts.remove(ba);
            return true;
        }
        else{
            return false;
        }
    }

    public String getAccountId(String owner){
        for( BankAccount ba : accounts){
            if( ba.getOwner().equals(owner)){
                return ba.getId();
            }
        }
        return null;
    }

    public String getAccountList(){
        String result = "";
        for (BankAccount ba:
             accounts) {
            result = result + ba.toString() + "\n";
        }
        return result;
    }

    public void deposit(double amount, String id){
        BankAccount ba = getAccountForId(id);
        ba.deposit(amount);
    }

    public boolean withdraw(double amount, String id){
        BankAccount ba = getAccountForId(id);
        return ba.withdraw(amount);
    }

    public boolean transfer( double amount, String fromId, String toId){
        BankAccount fromBA = getAccountForId(fromId);
        BankAccount toBA = getAccountForId(toId);
        return fromBA.transfer(amount,toBA);
    }

    public double getTotalBankBalance(){
        double total= 0;
        for (BankAccount ba : accounts) {
            total = total + ba.getBalance();
        }
        return total;
    }

    public double getAverageAccountBalance(){
        return getTotalBankBalance()/accounts.size();
    }

    public int getTotalNumberOfTransactions(){
        int trans=0;
        for (BankAccount ba: accounts) {
            trans+=ba.getNumTransactions();
        }
        return trans;
    }

    public void applyMonthlyFee(){
        for (BankAccount ba : accounts) {
            ba.applyMonthlyFees();
        }
    }



    private BankAccount getAccountForId(String id){
        BankAccount result = null;
        for( BankAccount ba : accounts){
            if( ba.getId().equals(id)){
                result = ba;
                break;
            }
        }
        return result;
    }
}
