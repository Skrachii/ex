package emil.l4ForLoops;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {

            if (i % 10 != 0 && i % 4 != 0) {
                    System.out.println(i);
                }

        }
    }
}


