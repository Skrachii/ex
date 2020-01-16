package l14collections;

import java.util.*;

// illustrate use of TreeSet to order things
public class Demo_1 {
    public static void main(String[] args) {

        // uses natural alphabetical order
        Set<String> set = new TreeSet<>();

        set.add("cat");
        set.add("elephant");
        set.add("lion");
        set.add("sheep");

        System.out.println(set);

        Set<String> set2 = new TreeSet<>(new LengthComaprator());
        set2.addAll(set);

        System.out.println(set2);
    }
}

class LengthComaprator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
//        if(o1.length() < o2.length()){
//            return -1;
//        }
//        else if(o1.length() > o2.length()){
//            return 1;
//        }
//        else{
//            return 0;
//        }
        return o1.length() - o2.length();
    }
}