package emil.l3Conditionals;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter number: ");  int num = Integer.parseInt(scanner.nextLine());

        while (num < 1 || num > 100) ;
        {
            System.out.println(" Invalid number! ");
            System.out.print(" Try Again: "); num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(" The number is " + num);

    }
}
