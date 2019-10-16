package l6loops;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < num; i++ ){
            int currentNum = Integer.parseInt(scanner.nextLine());
            if( currentNum > maxNum )
                maxNum = currentNum;
        }

        System.out.println("Max number is " + maxNum);

    }
}
