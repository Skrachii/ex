package emil.l3Conditionals;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Please enter two numbers (on separate lines).");
        int first = input.nextInt();
        int second = input.nextInt();
        if (first == second) {
            System.out.println("These two numbers are equal.");
        } else {
            if (first > second) {
                System.out.println("Two first number is greater.");
            } else {
                System.out.println("The second number is greater");
            }
        }
    }
}
