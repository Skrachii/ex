package l10algorithms;

public class Ex1 {
    public static void main(String[] args) {
        printStars(40);
    }

    public static void printStars(int n) {
        if( n == 0 ) {
            System.out.println();
        }
        else {
            System.out.print("*");
            printStars(n - 1);
        }
    }
}
