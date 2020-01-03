package l9Arrays;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        swap(arr,1 , 2) ;
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    }
}