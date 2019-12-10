package l10algotirhms;

public class Ex1 {
    public static void main(String[] args) {
        printStars(25);

    }

    public static int printStars(int n) {
        int reasult = n;
        if (n == 0) {
            System.out.println();
        } else {
            System.out.print("*");
            printStars(n - 1);
        }
        return reasult;
    }
}


