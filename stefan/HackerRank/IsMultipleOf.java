package HackerRank;

import java.util.Scanner;

public class IsMultipleOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("FizzBuzz");
        }
        else{
            System.out.println(a);
        }
    }
}
