package emil.l5WhileLoops;
// Генериране на случайни числа:
//Как да генерираме случайно число между 0 и 7 включително?
//Как да генерираме случайно число между 5 и 10 включително?
//Как да генерираме четно случайно число между 4 и 12 включително?


import java.util.Random;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Random random = new Random();
        int min = 0; // 5 , 4; ----> Работи!
        int max = 10; // 12 , 7 ; ----> Работи!

        for (int i = 0; i < 15 ; i++)
            System.out.println(min + random.nextInt(max - min + 1)); // + 1 е за да вкл. 10.
        {

        }
    }


}
