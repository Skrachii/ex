package emil.l7methods;

public class Ex13 {
    public static void main(String[] args) {
        int width = 30;
        int height = 12;

        printLine("#", width);
        System.out.println();
        printLine("-", width);
        System.out.println();
        printBody(width, height);
        printLine("-", width);
        System.out.println();
        printLine("#", width);
        System.out.println();
    }
    public static void printBody(int width, int height) {
        for (int i = 0; i < height; i++) {
            printLine("|", 1);
            printLine(" ", width - 2);
            printLine("|", 1);
            System.out.println();
        }
    }
        public static void printLine(String el, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(el);
        }
    }
}