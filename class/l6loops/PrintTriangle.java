package l6loops;

import java.util.Scanner;

/**
 * Print a triangle of dollar signs.
 */
public class PrintTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++){
            for( int j = 0; j <= i ; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
