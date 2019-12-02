package l11classes.ex1;

public class Student {

    private static int count = 0;

    private String name;
    private int age;
    private double gpa;
    private String fn;
    private Status status;

    public Student(String name ){
        this.name = name;
        count++;   // the same as count = count + 1;  count += 1;
        fn = "FN" + count;
        status = Status.Freshman;
        if( status == Status.Freshman ){

        }
    }

    public Student(){
        this("Unnamed");
    }

    public Student(String name, int age, double gpa){
        this(name);
        this.age = age;
        this.gpa = gpa;
    }

    public String getFn() {
        return fn;
    }

    public static int getCount() {
        return count;
    }

    public String toString(){
        return String.format("Student: fn=%s, name = %s, age = %d, gpa = %.2f", fn, name, age, gpa);
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

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
