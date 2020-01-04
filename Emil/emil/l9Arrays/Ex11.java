package emil.l9Arrays;
//Наапишете метод-->public static int[] randomArray(int size, int min, int max) ,който създава и връща масив с даден
//  размер, изпълнен със случайни цели числа в даденият интервал [min, max].
//Генериране на сучайни числа.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    // public static Scanner scanner = new Scanner(System.in); // При дефиниране на скенер извън Main метода , всички
    // други методи ще го виждат!
    public static void main(String[] args) {
        int[] arr = randomArray(50, 10, 20); // Размер --> Минимум --> Максимум
        System.out.println(Arrays.toString(arr));  // Принтене на новия масив.
    }

    public static int[] randomArray(int size, int min, int max){ // Инициализираме размер , минимум и максимум.
        Random random = new Random(); // Генериране на числата
        int[] result = new int[size]; //

        for (int i = 0; i < size; i++) { // Цикъла обикаля индекса i.
            result[i] = min + random.nextInt(max-min +1); // Присвояваме i
        }
        // populate with random numbers
        return result; // връшаме резултата от цикъла.

    }
}
