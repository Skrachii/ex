package L1;

public class IsNoRemainder {
    public static void main(String[] args) {
        double Num1 = 20.00;
        double Num2 = 80.00;
        double result = (Num1 + Num2) * 100;
        System.out.println("My numbers total is " + result);
        double remainder = result % 40.00;
        System.out.println("The remainder of the result is " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);
        if (isNoRemainder != true) {
            System.out.println("Got some remainder");
        }
        System.out.println("This " +
                "is " +
                "a test");
    }
}


