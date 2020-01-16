package l14collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo_4 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        Person pesho = new Person("1111", "Pesho");

        set.add(new Person("1111", "Pesho"));
        set.add(new Person("2222", "Gosho"));
        set.add(new Person("3333", "Tosho"));
        set.add(new Person("4444", "Sasho"));

        System.out.println(set);

// Does not work. ConcurrentModificationException
//        for (Person p : set) {
//            if(pesho.equals(p)){
//                set.remove(p);
//            }
//        }

        // Need to use iterator if removal is needed.
        for(Iterator<Person> it = set.iterator(); it.hasNext(); ){
            Person p = it.next();
            if(pesho.equals(p)){
                it.remove();
            }
        }

        System.out.println(set);

    }
}
