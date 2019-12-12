package l12inheritance.ex1;

public class Student extends Person {

    private double grade;

    public Student(String firstName, String familyName, double grade){
        super(firstName, familyName);
        this.grade = grade;
    }

    @Override
    public String personalDetails() {
//        return super.personalDetails();
        return String.format("%s; grade %.2f",
                super.personalDetails(), grade);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
