package emil.l9Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print(" Please Enter number of days: "); int n = Integer.parseInt(scanner.nextLine());
            int[] allTemp = new int[n];

            int sum = 0;
            for (int i = 0; i < n ; i++) {
                System.out.printf(" Day %d's high temp: ",i + 1); // Printf - format String %d.
                allTemp[i] = Integer.parseInt(scanner.nextLine()); // Чете следвашата темп. ,която вкарвка потребителя.
                sum = sum + allTemp[i]; // Всяка нова сума се записва в sum.
            }
            double average = (double)sum / n;
        System.out.println(Arrays.toString(allTemp)); // Принти ни клетката с елементите.
        System.out.println(" Average Temperature is : " + average);
    }
}
