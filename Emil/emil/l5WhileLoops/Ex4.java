package emil.l5WhileLoops;
// Да се напише програма, която приема числа от потребителя, докато той въведе -1.
// Тогава програмата отпечатва сумата на въведените числа.

//import javafx.scene.ImageCursor;
//import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Ex4 {

    public static final  int SENTINEL = -1; // SENTINEL е стойност , която  сигнализира , че процеса трябва да свърши!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Въведете число: "); int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while( n != SENTINEL) {
           sum += n; // можем и да заменим кода с този ---> sum = sum + n;
            System.out.print(" Въведете отново число: "); n = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(" Общата сума на числата, която въведохте е: " + sum );
    }
}
