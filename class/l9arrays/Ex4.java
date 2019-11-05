package l9arrays;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length/2; i++){
            swap(arr, i, arr.length - 1 - i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
