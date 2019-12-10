package l10algotirhms;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int n) {
        int result;
        if (n == 0) {
            result = 1;
        }
        else{
            result = n * factorial(n - 1);
        }

        return result;
    }
}
