package emil.l4ForLoops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please Enter lower number: ");   int lower = Integer.parseInt(scanner.nextLine());
        System.out.print(" Please Enter higher number: ");  int higher = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = lower; i <= higher ; i++) {
            sum = sum + i;

        }
        System.out.println(" The sum is: " + sum);
    }
}
