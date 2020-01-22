package l15more;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// lambda expression
public class Demo_1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("Pat", "Goshoo", "Todomircho", "Alexandar"));

        System.out.println(list);
//        Collections.sort(list, (s1, s2) -> s1.length() - s2.length()); // lambda expression

//        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length(); // lambda expression
//        Collections.sort(list, comp);

//        Collections.sort(list, Comparator.comparing(s -> s.length()));

        Collections.sort(list, Comparator.comparing(String::length));

        //        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
        System.out.println(list);


    }

}
//
//class LengthComp implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }
//}
