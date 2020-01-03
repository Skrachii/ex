package l9Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = getNumberOfDays(scanner);
        int[] allTemp = readTemps(days, scanner);
        double average = getAverage(days, allTemp, scanner);
        int numHighDays = getHigherTempDays(allTemp, average);

        System.out.printf("Average temperature: %.2f", average);
        System.out.printf(" There were %d days higher than average.", numHighDays);
    }


    public static int getNumberOfDays(Scanner scanner) {
        System.out.print("Enter days:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getHigherTempDays(int[] temps, double average) {
        int counter = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static int[] readTemps(int n, Scanner scanner) {
        int[] temps = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Day %d's high temp: ", i + 1);
            temps[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(temps));
        return temps;
    }

    public static double getAverage(int n, int[] temps, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + temps[i];
        }
        //System.out.println(sum);
        return (double) sum / n;
    }
}
