package emil.l5WhileLoops;

import java.util.Random;
import java.util.Scanner;

// Да се напише програма, която симулира хвърлянето на два зара, докато сумата им стане равна на 12 (дюшеш).
public class Ex6 {

    public static void main(String[] args) {
        Random random = new Random();
        int diceone = 0;
        int dicetwo = 0;
        int sum = 0;
        int i = 0;

            while ( sum != 12) {
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
