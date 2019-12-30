package emil.l3Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

// Да се въведат 3 числа и да се отпечата дали са еднакви (yes / no)
public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter First number: ");  int  a = scanner.nextInt();
        System.out.print(" Enter Second number: "); int  b = scanner.nextInt();
        System.out.print(" Enter Third number: ");  int  c = scanner.nextInt();


        if ( a == b && a == c) {
            System.out.print( " The numbers are equal.");

        } else {
            System.out.println(" They are not equal! ");
        }
    }
}
