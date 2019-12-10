package l11classes;

import java.util.ArrayList;

// Illustrates use of Integer wrapper class
public class Demo_1 {
    public static void main(String[] args) {

        Integer i1 = new Integer(1);

        Integer i2 = 2;

        Integer i3 = Integer.parseInt("3");

        Integer i4 = Integer.parseInt("101010", 2);

        ArrayList<Integer> ial = new ArrayList<>();
        ial.add(i1);
        ial.add(i2);
        ial.add(i3);
        ial.add(i4);

        System.out.println(ial);
    }
}
