package HackerRank;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            int a = scanner.nextInt();
            System.out.printf("%-5s %03d %n",s,a);
        }
    }
}
