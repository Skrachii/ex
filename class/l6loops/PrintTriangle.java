package l6loops;
// Вложен цикъл !

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Колко символа искате да принтирате: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) { // Принтир 1 долар $ , това което искаме е на всеки нов ред да се принтира с 1+ $,
            // за това добавяме forj цикъла.
            for (int j = 0; j <= i; j++) { // J цикъла започва от 0 спира докато и нараства с всеки ред.
                System.out.print("$ "); // принтиране на долар
            }
            System.out.println();
        }
    }
}
