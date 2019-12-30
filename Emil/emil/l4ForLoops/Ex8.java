package emil.l4ForLoops;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please Enter numbers of stars: ");
        int height = Integer.parseInt(scanner.nextLine());
        char star = '*';

        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(star);

            }
            System.out.println();
        }
    }
}
