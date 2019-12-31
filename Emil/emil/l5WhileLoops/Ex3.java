package emil.l5WhileLoops;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = 1;

        while (grade < 2 || grade > 6) {

            System.out.print(" Въведете оценка: "); grade = Integer.parseInt(scanner.nextLine());

            switch (grade) {

                case 2:
                    System.out.println("Poor!");
                    break;

                case 3:
                    System.out.println("Average!");
                    break;

                case 4:
                    System.out.println("Good!");
                    break;

                case 5:
                    System.out.println("Very Good!");
                    break;

                case 6:
                    System.out.println("Excellent!");
                    break;
                }

                if (grade < 2)
                    System.out.println("Invalid input.The number is less than 2 , try Again... ");


                else if (grade >6)
                    System.out.println("Invalid input.The number is bigger than 6 , Try Again... ");
            }

        }

}



