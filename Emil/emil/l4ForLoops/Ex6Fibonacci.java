package emil.l4ForLoops;

import java.util.Scanner;

public class Ex6Fibonacci {
    public static void main(String[] args) {
//        int a=0;
//        int b=0;
//        int fibonacci=1;
//        int n;
//        int c=0;
//
//
//        Scanner input1= new Scanner(System.in);
//        System.out.print("n=");
//        n=input1.nextInt();
//
//        System.out.print(0);
//        System.out.print(" "+1);
//        for(int i=3;i<=n;i++){
//
//            a=b;
//            b=fibonacci;
//            fibonacci = a+b;
//            System.out.print(" "+fibonacci);
//            c+=fibonacci;
//        }
//        System.out.println("");
//        System.out.println(c+1);
    Scanner s = new Scanner(System.in);
        System.out.print(" Please enter number: "); int n = Integer.parseInt(s.nextLine());

    int f0 = 1;
    int f1 = 1;

        for (int i = 0; i < n-1 ; i++) {
            int nF = f0 + f1;
            f0 = f1;
            f1 = nF;
        }
        System.out.println(f1);
    }
}

