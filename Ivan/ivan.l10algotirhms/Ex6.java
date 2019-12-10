package l10algotirhms;

import java.util.Arrays;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        //int[] arr = {5,4,3,2,1,0,9,7,8,10,1};
        int[] arr = randomArray(10_000_000, -1_000_000, 1_000_000);

        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();
        System.out.printf("Sorting time: %d\n", end - start);

        start = System.currentTimeMillis();
        System.out.printf("Search returned %d\n", search(100_000, arr));
        end = System.currentTimeMillis();
        System.out.printf("Our search time: %d\n", end - start);

        System.out.printf("Trying binary search...\n");
        start = System.currentTimeMillis();
        System.out.printf("Search returned %d\n", Arrays.binarySearch(arr, 100_000));
        end = System.currentTimeMillis();
        System.out.printf("Built in search time: %d", end - start);
    }

    public static int search(int value, int[] array){
        int valueIdx = -1;
        for (int i = 0; i < array.length; i++) {
            if(value == array[i]){
                valueIdx = i;
                break;
            }
        }
        return valueIdx;
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
