package emil.l5WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        System.out.println(" Здравейте , това е DiceGame!");
        System.out.println(" Комбинацията от зарове бива : 1-1 --> Еци , 2-2 --> Дьорджухар , 3-3 --> Дюсе , 4-4 --> Дюбара," +
                " 5-5 --> Дюбеш и 6-6 --> ДЮШЕШ");
        Scanner scanner = new Scanner(System.in);
        int start;
        System.out.print(" За да започнете играта , въведете /Start/ ---> : ");  start = Integer.parseInt(scanner.nextLine());

        Random random = new Random();
        int diceone = 0;
        int dicetwo = 0;
        int sum = 0;
        int i = 0;

        if ( start == start)
        while ( sum != 12 ) {
            diceone = 1 + random.nextInt(6);
            dicetwo = 1 + random.nextInt(6);
            sum = diceone + dicetwo;
            System.out.printf(" %d + %d = %d" , diceone,diceone,sum); // %d\n - Принти на нов ред!
            //System.out.println(diceone + " + " + dicetwo + " = " + sum);
            System.out.println();
            i++;

        }
        System.out.println(" Дюшеш " + " След " + i + " Опита!");

    }
}
