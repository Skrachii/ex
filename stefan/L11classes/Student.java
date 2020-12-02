package L11classes;

public class Student {
    private static int count=0;
    private String name;
    private int age;
    private double gpa;
    private Status status;
    private String FN;

    public Student(String name) {
        this.name = name;
    }
//
//    public Student() {
//         this();
//    }

    public Student(String name, int age, double gpa) {
       count++;
       FN="FN"+count;
        this.name=name;
        this.age = age;
        this.gpa = gpa;
        status= Status.Freshman;
    }


    public boolean progress(){
        boolean result=true;
        switch (status){
            case Freshman:
                status=Status.Sophomore;
                break;
            case Sophomore:
                status=Status.Junior;
                break;
            case Junior:
                status=Status.Senior;
                break;
            case Senior:
                status=Status.BS;
                break;
            case BS:
                result=false;
        }
        return result;
    }

    public String toString() {
        return String.format("Student:FN=%s name=%s, age=%d, gpa=%.2f, status=%s ",
                FN, name, age, gpa, status);
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public String getFN(){
        return FN;
    }
    public static int getCount(){
        return count;
    }
}
