package emil.l4ForLoops;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter height: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println(" Please Enter width: ");
        int width = Integer.parseInt(scanner.nextLine());
        char star = '*';

        for (int j = 1; j <= width; j++ ) {
            for (int i = 1; i <= height; i++ ) {
                System.out.print(star);

            }
            System.out.println(); // Трябва ни нова линия за да изпринтим следващият ред за нова линия ( Символ ).
        }
    }
}
