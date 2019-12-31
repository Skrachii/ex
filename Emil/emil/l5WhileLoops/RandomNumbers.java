package emil.l5WhileLoops;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 10 ; i++) {
            System.out.println(1 + random.nextInt(10)); // random.nextInt генерира от 0 до 6 , за да избегнем 0 ,
            // добавяме 1  + random.nextInt.
        }
    }
}
