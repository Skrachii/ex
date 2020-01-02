package emil.l7methods;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Въведете ширина: "); int width = Integer.parseInt(scanner.nextLine());
        System.out.print(" Въведете дължина: "); int height = Integer.parseInt(scanner.nextLine());
        PrintBox(width,height);
    }
        public static void PrintBox(int w , int h) {
        PrintLane(w); // Линия от горе
        PrintBody(h,w);
        PrintLane(w); // Линия от долу
    }
        public static void PrintBody(int height,int width) {
        for (int i = 0; i < height-2; i++) { // Всяка итерация чертае ред
            System.out.print("*");
                for (int j = 0; j < width - 2 ; j++) { // Този луп чертае спейсовете
                    System.out.print(" "); // принти спейсовете между тях.
            }
                System.out.println("*");
        }
    }
        public static void PrintLane(int len) {
            for (int i = 0; i < len; i++) {
             System.out.print("*");
        }
            System.out.println();
    }
}
