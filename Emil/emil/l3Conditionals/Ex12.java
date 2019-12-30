package emil.l3Conditionals;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter first number: "); int a = scanner.nextInt();
        System.out.print(" Please enter second number: "); int b = scanner.nextInt();

        if ( a > b ) {
            System.out.println(" The bigger number is :" + a);
        } else {
            System.out.println(" The bigger number is " + b);

        }

    }
}