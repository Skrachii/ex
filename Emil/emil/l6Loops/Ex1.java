package emil.l6Loops;
//1.Напишете програма, която чете от конзолата поредица от цели числа и отпечатва най-малкото и най-голямото от тях.
import java.util.Scanner;

public class Ex1 {

    public static final String SENTINEL = "S";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usrInput;                     //usrInput String veriable
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        do {
            System.out.print("Enter a number: (S to end.):  ");
            usrInput = scanner.nextLine();

            if (!SENTINEL.equalsIgnoreCase(usrInput)) {
                int number = Integer.parseInt(usrInput);

             if (number > max){
                 max = number;
                }
                if (number < min){
                    min = number;
               }
         //      max = Math.max(max, number);
           //    min = Math.min(min, number);
             //   max = (number > max) ? number : max;

            //    min = (number < min) ? number : min;
            }
        } while (!SENTINEL.equalsIgnoreCase(usrInput)); // Провери дали е s или S , докато Не е вярно! ---> !SENTINEL - да не е равно
        System.out.printf("The min number entered was: %d and the max number entered was: %d", min, max);
    }
}

