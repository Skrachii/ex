package testPrep;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        mystery1(4);
    }

    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }
}
