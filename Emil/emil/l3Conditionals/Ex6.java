package emil.l3Conditionals;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int DayNum = Integer.parseInt(scanner.nextLine());

        switch (DayNum) {
            case 1:
                System.out.println("Понеделник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Сряда");
                break;
            case 4:
                System.out.println("Четвъртък");
                break;
            case 5:
                System.out.println("Петък");
                break;
            case 6:
                System.out.println("Събота");
            case 7:
                System.out.println("Неделя");
                break;
            default:
                System.out.println("Not a valid day");


        }
    }
}
