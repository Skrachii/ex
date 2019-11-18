package l10algotirhms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int[] arr = randomArray(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())) ;
        int[] arr = randomArray(10_000_000, -1_000_000, 1_000_000);

        long start = System.currentTimeMillis();
        System.out.printf("Search returned %d\n", search(100_000, arr));
        long end = System.currentTimeMillis();
        System.out.printf("Our search time: %d\n", end - start);

        System.out.println();

        start = System.currentTimeMillis();
        Arrays.sort(arr);
        end = System.currentTimeMillis();
        System.out.printf("Sorting time: %d\n", end - start);

        System.out.println();

        start = System.currentTimeMillis();
        System.out.printf("Search returned %d\n", binarySearch(100_000, arr));
        //System.out.printf("Search returned %d\n" ,binarySearch(Integer.parseInt(scanner.nextLine()), arr));
        end = System.currentTimeMillis();
        System.out.printf("Built in search time: %d", end - start);
    }

    public static int binarySearch(int value, int[] array) {
        return binarySearch(value, array, 0, array.length - 1);
    }

    public static int binarySearch(int value, int[] array, int first, int last) {
        if (first > last) {
            return -1;
        }
        int mid = (first + last) / 2;
        if (array[mid] == value) {
            return mid;
        } else if (value < array[mid]) {
            return binarySearch(value, array, first, mid - 1);
        } else {
            return binarySearch(value, array, mid + 1, last);
        }
    }

    public static int[] randomArray(int size, int min, int max) {
        Random random = new Random();
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = min + random.nextInt(max - min + 1);
        }
        return result;
    }

    public static int search(int value, int[] array) {
        int valueIdx = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                valueIdx = i;
                break;
            }
        }
        return valueIdx;
    }
}







