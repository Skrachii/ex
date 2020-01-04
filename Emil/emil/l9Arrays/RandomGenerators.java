package emil.l9Arrays;

import java.util.Random;

public class RandomGenerators {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100 ; i++) {
            double g = 1 + random.nextInt(6);
            // double g = 100 * random.nextDouble();  ---> [0.0,1)
            // System.out.Print(" %.2f\n", g);
            // Пример от 50-100 числа да генерира:
            //// double g = 50.0 + 50 * random.nextDouble();  ---> [50,100)
            //   System.out.Print(" %.2f\n", g);
            System.out.println(g);

        }
    }
}
