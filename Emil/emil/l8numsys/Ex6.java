package emil.l8numsys;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int base = Integer.parseInt(scanner.nextLine());



        int q = num;

        int result = 0;

        int multiplier= 1;

        while (q != 0 ){

            int lastDigit = q%10;

            result = result + lastDigit*multiplier;

            multiplier = multiplier * base;

            q = q / 10;

            //System.out.println(q);

        }

        System.out.println(num + "(" + base + ") = " + result + "(10)");

        System.out.println(Integer.toString(result, base));

    }
}
