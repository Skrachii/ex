package Test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = randomArray(100,-1000,1000);
        System.out.print(minimalOdd(arr) + " ");
        System.out.println(largestEven(arr));


    }
    public static int largestEven(int[] array){
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if ( array[i]>maxEven && array[i]%2==0 ){
                maxEven=array[i];
                }
        }
        return maxEven;
    }
    public static int minimalOdd(int[] array){
                int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if ( array[i]<minOdd && array[i]%2==1 ){
                minOdd=array[i];
            }

        }
        return minOdd;
    }
    public static int[] randomArray(int size, int min, int max) {
        Random random = new Random();
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = min + random.nextInt(max - min + 1);
        }
        return result;
    }
}
