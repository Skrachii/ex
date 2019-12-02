package l11classes.ex1;


public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Number of students: " + Student.getCount());
        Student unnamed = new Student();
        Student john = new Student("John");
        john.setAge(23);
        john.setGpa(3.2);
        Student jane = new Student("Jane", 28, 4.0);
        System.out.println(john);
        System.out.println(jane);
        System.out.println(unnamed);
        System.out.println("Number of students: " + Student.getCount());
    }
}
