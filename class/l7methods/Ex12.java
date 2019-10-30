package l7methods;

import javax.swing.*;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.print("Enter name ");
            String name = scanner.nextLine();
            printName(name);
        }

    }

    public static void printName(String name) {
        System.out.println("Hello " + name + "!");
    }
}
