package l12inheritance;

import l12inheritance.ex1.Person;
import l12inheritance.ex1.Student;
import l12inheritance.ex1.Worker;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person pesho = new Person("Pesho", "Peshev");
        people.add(pesho);
        people.add(new Student("Gosho", "Goshev",3.2));
        people.add(new Worker("Tosho","Toshev",12 , 10 ));

        for (Person p:people) {
            System.out.println(p.personalDetails());
            //the following is not very object oriented and polymorphic
//            if( p instanceof Student ){
//                System.out.println(((Student) p).getGrade());
//            }
//            if( p instanceof Worker ){
//                System.out.println(((Worker) p).getHourlyWage());
//            }
        }
        people.remove(new Person("Pesho", "Peshev"));
        System.out.println("After removing Pesho");
        for (Person p:people) {
            System.out.println(p.personalDetails());
        }
    }


}
