package l10algorithms;

// Calculate Fibonachi numbers
public class Ex4 {
    public static final int N = 8;
    public static void main(String[] args) {
        for (int i = 1; i < N; i++) {
            System.out.printf("F(%d) = %d\n", i, fib(i));
            System.out.printf("Loop: F(%d) = %d\n", i, fibLoop(i));
        }
    }

    // f(1) = 1, f(2) = 1, f(3) = 2 ... f(n) = f(n-1) + f(n-2)
    public static int fib(int n){
        int fib = 0;
        if (n == 1){
            fib = 1;
        }
        else if( n == 2 ){
            fib = 1;
        }
        else {
            fib = fib(n - 1) + fib( n - 2 );
        }
        return fib;
    }

    public static int fibLoop(int n){
        int fibm1 = 1;
        int fibm2 = 1;
        int fib = 1;
        for (int i = 3; i <= n ; i++) {
            fib = fibm1 + fibm2;
            fibm2 = fibm1;
            fibm1 = fib;
        }
        return fib;
    }
}
