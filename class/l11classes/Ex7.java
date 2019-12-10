package l11classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
        System.out.println(intersect(list1,list2));

    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3 = new ArrayList<>();
        for (Integer in : list1 ) {
            if (list2.contains(in)){
                list3.add(in);
            }
        }
        return list3;
    }
}
