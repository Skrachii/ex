package l11classes.ex1;

import java.io.Serializable;

class Student{

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
    }

    public Student(){
        this("Unnamed");
    }


    public Student(String name, int age, double gpa){
        this(name);
        this.age = age;
        this.gpa = gpa;
    }

    public boolean progress(){
        boolean result = true;
        switch (status){
            case Freshman:
                status = Status.Sophomore;
                break;
            case Sophomore:
                status = Status.Junior;
                break;
            case Junior:
                status = Status.Senior;
                break;
            case Senior:
                status = Status.BS;
                break;
            case BS:
                result = false;
        }
        return result;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFn() {
        return fn;
    }

    public static int getCount() {
        return count;
    }

    public String toString(){
        return String.format("Student: fn=%s, name = %s, age = %d, gpa = %.2f , status=%s",
                fn, name, age, gpa , status);
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
