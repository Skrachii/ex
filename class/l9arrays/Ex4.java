package l9arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        randomArray(arr, 50, 100);


    }

    public static int randomArray(int[] size, int min, int max) {
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int d = random.nextInt();
            System.out.printf("%.2f", d);
            return d;

        }
        return min;
    }
}










