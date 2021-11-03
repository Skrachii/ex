package HackerRank;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for (int i = 0; i <t ; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                a+=b;
                if (j > 0)
                    System.out.print(" ");
                System.out.print(a);
                b = b * 2;
            }
            System.out.println("");
        }
        scan.close();
        }
    }

