package L11classes.BankAccount;

//import ivan.l11.Ex5.BankAccount;

public class Demo {
    public static void main(String[] args) {
        BankAcc bankAccStefan=new BankAcc("Stefan");
        BankAcc bankAccIvan=new BankAcc("Ivan");
        System.out.println(bankAccStefan.getId());
      //  System.out.println(bankAccStefan);
        bankAccStefan.deposit(20);
    //    System.out.println(bankAccStefan);
//        bankAccStefan.withdraw(60.0);
//        bankAccStefan.withdraw(20.0);
//        bankAccStefan.withdraw(5.0);
//        bankAccStefan.withdraw(3.0);
//        bankAccStefan.applyMonthlyFees();
        bankAccIvan.deposit(100);
        bankAccIvan.transfer(2, bankAccStefan);
        System.out.println(bankAccIvan);
        System.out.println(bankAccStefan);


        Bank superBankBG=new Bank("Super BankBG");
        superBankBG.addAccount("Ivan");
        superBankBG.addAccount("Emo");
        superBankBG.addAccount("Stefan");
        //System.out.println(superBankBG.;

    }
}
