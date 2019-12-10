package ivan.l11.Ex5;

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
        if (ba != null) {
            accounts.remove(ba);
            return true;
        }
        else {
            return false;
        }
    }

    public String getAccountId(String owner) {
        for (BankAccount ba : accounts) {
            if (ba.getOwner().equals(owner)) {
                return ba.getId();
            }
        }
        return null;
    }

    public String getAccountList(){
        String result = "";
        for (BankAccount ba: accounts) {
            result = result + ba.toString() + "\n";

        }
        return result;
    }

    public void deposit(double amount, String id){
        BankAccount ba = getAccountForId(id);
        ba.deposit(amount);
    }

    private BankAccount getAccountForId(String id){
        BankAccount result = null;
        for(BankAccount ba : accounts){
            if (ba.getId().equals(id)){
                result = ba;
                break;
            }
        }
        return result;
    }
}
