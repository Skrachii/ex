package l11classes.Ex5;

public class Ex5 {
    public static void main(String[] args) {
//        BankAccount accountIvan = new BankAccount("Ivan");
//        accountIvan.deposit(0.1);
//        accountIvan.deposit(100.0);
//        accountIvan.withdraw(7.0);
//        accountIvan.applyMonthlyFee();
//        BankAccount accountGosho = new BankAccount("Gosho");
//        accountIvan.transfer(5, accountGosho);
//        System.out.println(accountGosho);
//        System.out.println(accountIvan);

        Bank superBankBG = new Bank("Super Bank BG");
        String idIvan = superBankBG.addAccount("Ivan");
        String idGosho = superBankBG.addAccount("Gosho");
        String idPesho = superBankBG.addAccount("Pesho");
        String idSasho = superBankBG.addAccount("Sasho");
        superBankBG.deposit(1, idIvan);
        superBankBG.deposit(1, idGosho);
        superBankBG.deposit(1, idPesho);
        superBankBG.deposit(1, idSasho);
        System.out.println(superBankBG.getAccountList());

    }
}
