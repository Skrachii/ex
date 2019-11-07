package l9arrays;

import java.util.Arrays;

public class Demo_1 {
    public static void main(String[] args) {
        int[][] m = {
                {1,2,3},   // m[0]
                {4,5,6}
        };
        System.out.println(Arrays.toString(m));
        System.out.println(m[0]);
        System.out.println(Arrays.toString(m[0]));
        System.out.println(m[1]);
        System.out.println(Arrays.toString(m[1]));
        System.out.println(Arrays.deepToString(m));
    }
}
