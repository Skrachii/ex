package l11classes.ex5;

public class Ex5 {
    public static void main(String[] args) {
//        BankAccount accountIvan = new BankAccount("Ivan");
//        accountIvan.deposit(10.0);
//        accountIvan.deposit(5.0);
//        accountIvan.withdraw(1.0);
//        accountIvan.deposit(100.0);
//        accountIvan.applyMonthlyFees();
//        BankAccount accountGosho = new BankAccount("Gosho");
//        accountIvan.transfer(5, accountGosho);
//        System.out.println(accountGosho);
//        System.out.println(accountIvan);

        Bank superBankBG = new Bank( "Super Bank BG");
        String idIvan = superBankBG.addAccount("Ivan");
        String idPesho = superBankBG.addAccount("Pesho");
        String idGosho = superBankBG.addAccount("Gosho");
        String idSasho = superBankBG.addAccount("Sasho");
        superBankBG.deposit(100, idIvan);
        superBankBG.deposit(20, idPesho);
        superBankBG.deposit(50, idGosho);
        superBankBG.deposit(80, idSasho);
        System.out.println(superBankBG.getAccountList());
    }
}
