package Recursia;

public class Ex1 {
    public static void main(String[] args) {
printStars(10);
    }

    public static void printStars(int n) {
        if (n == 0) {
            System.out.print("");
        } else {
            System.out.println("!");

            printStars(n - 1);
        }
    }
}
