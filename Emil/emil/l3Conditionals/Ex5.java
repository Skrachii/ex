package emil.l3Conditionals;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DayNum = Integer.parseInt(scanner.nextLine());

        if ( DayNum == 1 ) {
            System.out.println("Понеделник");
        }
            else if ( DayNum == 2) {
                System.out.println("Вторник");
            }
            else if ( DayNum == 3) {
                System.out.println("Сряда");
            }
            else if ( DayNum == 4) {
                System.out.println("Четвъртък");
            }
            else if ( DayNum == 5) {
                System.out.println("Петък");
            }
            else if ( DayNum == 6) {
                System.out.println("Събота");
            }
            else if ( DayNum == 7) {
                System.out.println("Неделя");
            }
         }
    }


