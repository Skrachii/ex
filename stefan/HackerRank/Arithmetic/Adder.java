package HackerRank.Arithmetic;

public class Adder extends Arithmetic {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is " + a.getClass().getSuperclass().getName());
        System.out.println(a.add(5,6));
    }
}
