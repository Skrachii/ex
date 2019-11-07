package l9arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        int[] arr = randomArray(100, 10, 20);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] randomArray(int size, int min, int max){
        Random random = new Random();
       int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = min + random.nextInt(max-min+1);
        }
        // populate with random numbers
        return result;
    }
}
