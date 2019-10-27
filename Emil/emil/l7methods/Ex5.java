package emil.l7methods;

public class Ex5 {

    public static void main(String[] args) {
        printLine(10);
        printLine(20);
        printLine(5);
        printLine(30);
    }

    public static void printLine(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
        System.out.println(); // Защо слагаме sout?
    }
}
