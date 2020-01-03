package emil.l7Methods;

public class Ex9 {
    public static void main(String[] args) {
        double bubble = 867.5309;
        double x = 10.01;
        printer( x, 8);
        printer(x, bubble);
        System.out.println("The value from main is: " + bubble);
        int z = 5;
        System.out.println("z = " + z);

    }

    public static void printer(double  x, double  y) {
        System.out.println("x = " +  x + " and y = " + y);

    }
}
