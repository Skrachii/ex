package l12inheritance.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Student student = new Student("Pesho", "Peshev", 2.51);
        System.out.println(student.personalDetails());
        Worker worker = new Worker("Gosho","Goshev" , 8 ,25);
        System.out.println(worker.personalDetails());
        Person p=new Worker("Ivan","Ivanov",24.0,50);



        System.out.println((Worker) p.getWorkHours);
    }

}
