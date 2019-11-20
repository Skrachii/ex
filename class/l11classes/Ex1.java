package l11classes;

public class Ex1 {
    public static void main(String[] args) {

        Student john = new Student("John");
        Student jane = new Student("Jane", 21, 4.2);
        System.out.println(Student.getCount());  // prints 2

        System.out.println(john);
    }
}
