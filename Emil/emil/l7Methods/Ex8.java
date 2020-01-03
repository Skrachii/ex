package emil.l7Methods;

public class Ex8 {
    public static void main(String[] args) {
        int x = 5;
        modifier(x);
        System.out.println("x in the end of main is " + x);
    }

    public static void modifier(int x){ // Pass by value - копиране на стойността в modifier(x).
        x = 2 * x;
        System.out.println("x inside modifier is " + x);
    }

}

