package HackerRank;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        String myString=scanner.next();
        int myInt=scanner.nextInt();
        int myInt2=scanner.nextInt();
        int myInt3=scanner.nextInt();
        scanner.close();
//        System.out.println("My String is "+ myString);
        System.out.println("My first number is "+ myInt);
        System.out.println("My second number is "+ myInt2);
        System.out.println("My third number is "+ myInt3);
    }
}
