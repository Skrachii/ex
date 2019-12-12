package l12inheritance;

import l12inheritance.ex1.Person;
import l12inheritance.ex1.Student;

public class Demo_1 {
    public static void main(String[] args) {
        Student pesho = new Student("Pesho", "Peshev", 3.2);

        Person p = pesho; // can assign reference of Student to Person
        System.out.println(p.personalDetails());

        System.out.println(((Student) p).getGrade());
    }
}
