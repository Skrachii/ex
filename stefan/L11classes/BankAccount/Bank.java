package L11classes.BankAccount;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<BankAcc> accounts;

    public Bank(String ime) {
        this.name = ime;
        accounts = new ArrayList<BankAcc>();
    }

    public void addAccount(String owner) {
        BankAcc account = new BankAcc(owner);
        accounts.add(account);
        account.getId();
    }

    public boolean removeAccount(String id) {
        BankAcc ba = getAccForId(id);
        if (ba != null) {
            accounts.remove(ba);
            return true;
        } else {
            return false;
        }
    }

    public String getAccountId(String owner) {
        for (BankAcc ba : accounts) {
            if (ba.getOwner().equals(owner)) {
                return ba.getId();
            }
        }
        return null;
    }

    public String GetAccountList() {
        return accounts.toString();
    }

    private BankAcc getAccForId(String id) {
        BankAcc result = null;
        for (BankAcc ba : accounts) {
            if (ba.getId().equals(id)) {
                result = ba;
                break;
            }
        }
        return result;
    }
}
