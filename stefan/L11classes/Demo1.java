package L11classes;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Number of sudents: " + Student.getCount());
        Student unnamed= new Student("Unnamed",12,5.9);
        Student john = new Student("John",23,2.2);
        Student jane = new Student("Jane", 15,5.2);
        john.progress();
        john.progress();
        jane.progress();
        jane.progress();
        jane.progress();
        unnamed.progress();
        System.out.println(john);
        System.out.println(jane);
        System.out.println(unnamed);
        generatesStudentsArray();
        System.out.println("Number of sudents: " + Student.getCount());

    }
    public static void generatesStudentsArray(){
        Student[] students=new Student[5];
        students[0]= new Student("Tomi");
        students[1]= new Student("Alex", 12,2.6);
        students[2]= new Student("Alex");
        students[3]= new Student("Alex");
        students[4]= new Student("Alex");
        System.out.println(Arrays.toString(students));
    }
}
