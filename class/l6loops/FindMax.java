package l6loops;
// Да се намери най - голямото число.
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Колко числа ще вкарате? : ");int num = Integer.parseInt(scanner.nextLine()); // потребителя вкарва броя на числата.

        int maxNum = Integer.MIN_VALUE; // Преди да се започне да се вкарва , знаем че максималното число е -2 милиарда...
        for(int i = 0; i < num; i++ ){ // числата започват от 0 и да стигнат до num . можем и от 1 до <= num.
            System.out.print(" Вкарайте числото: ");int currentNum = Integer.parseInt(scanner.nextLine()); // currentNum се изпълнява и
            // създава клетка в паметта и запомня всяко следващо число.
            if( currentNum > maxNum ) // Ако currentNum e по голямо от maxNum
                maxNum = currentNum; // запомняме по голямото число.
        }

        System.out.println(" Най-голямото число е : " + maxNum );
    }
}
