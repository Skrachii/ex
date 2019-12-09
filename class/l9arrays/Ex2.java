package l9arrays;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr, 2,3 );
        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
       a[j] = temp;
    }
//    public static void swap(int a, int b){
//        System.out.printf("a = %d, b = %d\n", a, b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.printf("a = %d, b = %d\n", a, b);
//    }
}
