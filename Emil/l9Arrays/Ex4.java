package l9Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(arr));
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
