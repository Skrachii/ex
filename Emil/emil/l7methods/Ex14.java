package emil.l7methods;

public class Ex14 {
    public static void main(String[] args) {
        System.out.print("The hypotenuse of a triangle with legs 5 and 6 is ");
        System.out.println(hypotenuse(5, 6));

        System.out.print("60 degrees Fahrenheit is equal to ");
        System.out.print(fToC(60));
        System.out.println(" Celsius");

        System.out.print("2 to the power of 10 is ");
        System.out.println(power2(10 ));
    }

    public static double hypotenuse(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        return c;
    }

    public static double fToC(double degreesF) {
        // note form:  return expression
        return 5.0 / 9.0 * (degreesF - 32);
    }

    public static int power2(int p){ // Метод , който смята степените на 2ката т.е, 2 на 10 което е 1024
        // without casting (int) we get error
        return (int) Math.pow(2, p); // Кастване в integer.
    }
}
