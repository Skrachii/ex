package emil.l3Conditionals;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter first number :  "); int n = scanner.nextInt();
        System.out.print(" Please Enter second number :  "); int m = scanner.nextInt();

        if (n > 0) {
            System.out.println(" Числото " +  n  + " e положително!");
        } if ( m < 0){
            System.out.println(" Числото " + m + " e отрицателно!");
        } if (n == 0 || m == 0){
            System.out.println(" 0 е естествено число и не е цифра ! ");
        }

    }
}
