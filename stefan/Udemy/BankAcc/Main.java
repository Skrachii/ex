package Udemy.BankAcc;

public class Main {
    public static void main(String[] args) {
        Bank Customer1=new Bank("5",11,"Stefan","myemail@ymail.com",123);
       //    Customer1.setCustomerName("Stefan");
        System.out.println("Customer Name: "+ Customer1.getCustomerName());
       // Customer1.setBalance(100);
        System.out.println("Available balance " + Customer1.getBalance());
        Customer1.deposit(20);
        Customer1.withdrawal(19);
        Customer1.withdrawal(102 );
    }
}
