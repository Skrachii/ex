package l11classes;

public class Student {
    private String name;
    int age;
    double gpa;

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public Student(String name){
        this.name = name;
        count++;
    }

    public Student(String name, int age, double gpa){
        this(name);
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, GPA: %.2f",
                              name, age, gpa);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
