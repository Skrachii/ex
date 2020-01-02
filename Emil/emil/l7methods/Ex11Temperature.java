package emil.l7methods;

public class Ex11Temperature {
    public static void main(String[] args) {
        double tempf = 98.6;
        System.out.println("Body temp in C is: " + ftoc(tempf));
    }

    // converts Fahrenheit temperatures to Celsius
    public static double ftoc(double tempf) {
       double tempc = (tempf - 32) * 5 / 9;
        return tempc; // Получаване на стойността и я връша на ftoc(tempf)


    }
}
