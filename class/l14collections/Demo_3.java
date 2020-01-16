package l14collections;

import java.util.HashSet;

public class Demo_3 {
    public static void main(String[] args) {
        String pesho = "Pesho";
        String pesho2 = "Pe" + "sho";
        System.out.println(pesho.hashCode());
        System.out.println(pesho2.hashCode());

        HashSet<String> set = new HashSet<>();
        set.add(pesho);
        System.out.println(set);
        set.remove(pesho2);
        System.out.println(set);
    }
}
