package l11classes.ex1;


import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Number of students: " + Student.getCount());
        Student unnamed;
        unnamed = new Student();
        Student john = new Student("John");
        john.setAge(23);
        john.setGpa(3.2);
        Student jane = new Student("Jane", 28, 4.0 );
        System.out.println(john);
        System.out.println(jane);
        System.out.println(unnamed);
        generateStudentArray();
        System.out.println("Number of students: " + Student.getCount());
    }

    public static void generateStudentArray(){
        Student[] students = new Student[5];
        students[0] = new Student("Johny", 15, 4.0);
        students[1] = new Student("traicho",7, 4.3);
        students[2] = new Student("asen");
        students[3] = new Student("kiro");
        students[4] = new Student("ivan");
        System.out.println(Arrays.toString(students));

    }
}
