package l10algotirhms;

import java.util.Arrays;
import java.util.Random;

public class Ex7_Loop {
    public static void main(String[] args) {
        int[] arr = randomArray(10_000_000,-1_000_000,1_000_000 );

        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();
        System.out.printf("Sorting time: %d\n", end - start);

        System.out.println();

        start = System.currentTimeMillis();
        System.out.printf("Search returned %d\n" ,binarySearch(500_000, arr));
        end = System.currentTimeMillis();
        System.out.printf("Built in search time: %d", end - start);

        System.out.println();

    }

    public static int binarySearch(int value, int[] array) {
        int start = 0;
        int end = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            int mid = end / 2;
            if (array[i] == value) {
                return i;
            }
            if (value < array[mid]) {
                end = mid - 1;
            }
            else if (value > array[mid]) {
                start = mid + 1;
            }
            }
        return -1;
    }
    public static int[] randomArray(int size, int min, int max){
        Random random = new Random();
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = min + random.nextInt(max-min+1);
        }
        return result;
    }
}





