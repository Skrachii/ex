package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = Array(5, 1, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] Array(int size, int min, int max) {
        Random random = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size ; i++) {
            result[i] = min + random.nextInt(max-min+1);
        }
        return result;
    }
    }




        // Scanner scanner = new Scanner(System.in);
 //       int numbers = GetNumbers(scanner);
 //       int[] numb = readNumb(numbers, scanner);
    //}

 //   public static int GetNumbers(Scanner scanner) {
  //      System.out.print("Enter numbers:");
    //    return Integer.parseInt(scanner.nextLine());
    //}

 //   public static int[] readNumb(int n, Scanner scanner) {
      //  int[] numbs = new int[n];
        //for (int i = 0; i < n; i++) ;
        //return numbs;
   // }
//}





