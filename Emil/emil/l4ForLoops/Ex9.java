package emil.l4ForLoops;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter number: ");
        int height = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");

            }
            System.out.println(i);
        }
    }
}
