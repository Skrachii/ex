package l12inheritance;

import l12inheritance.ex1.Person;
import l12inheritance.ex1.Student;
import l12inheritance.ex1.Worker;

import java.util.ArrayList;
import java.util.Collections;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Comparable> listForSorting = new ArrayList<>();
        Person pesho = new Person("Pesho", "Peshev");
        Person gosho = new Student("Gosho", "Goshev",3.2);
        listForSorting.add(pesho);
        listForSorting.add(gosho);
        listForSorting.add(new Worker("Tosho","Toshev",12 , 10 ));
        listForSorting.add(new Worker("Tosho","Goshev",12 , 10 ));
        listForSorting.add(new Worker("Sasho","Toshev",12 , 10 ));
        listForSorting.add(new Worker("Misho","Toshev",12 , 10 ));
        Collections.sort(listForSorting);
        System.out.println(listForSorting);
        System.out.println(pesho.compareTo(gosho));
    }
}
