package l10algotirhms;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        isPalindrome("java");
        //Scanner scanner = new Scanner(System.in);
        //isPalindrome(scanner.nextLine());
    }

    public static boolean isPalindrome(String s) {
        int firstLetter = 0;
        int lastLetter = s.length() - 1;
        boolean isPal = true;
        for (int i = 0; i < lastLetter; i++) {
            firstLetter = i;

            String startLetter = s.substring(firstLetter, firstLetter + 1);
            String endLetter = s.substring(lastLetter, lastLetter + 1);

            if (startLetter.equals(endLetter) == false) {
                isPal = false;
            }
        }
        if (isPal == true) {
            System.out.println(s + " -> " + true);
        } else {
            System.out.println(s + " -> " + false);
        }

        return Boolean.parseBoolean(s);
    }
}

