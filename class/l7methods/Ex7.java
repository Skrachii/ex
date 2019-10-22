package l7methods;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        printBox(width, height);
    }

    public static void printBox(int w, int h){
        printLine(w);
        printBody(h, w);
        printLine(w);
    }

    public static void printBody(int height, int width) {
        for (int i = 0; i <height-2 ; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void printLine(int len){
        for (int i = 0; i < len ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
