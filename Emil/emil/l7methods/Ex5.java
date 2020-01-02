package emil.l7methods;

public class Ex5 {

    public static void main(String[] args) {
        printLine(2);
        printLine(4);
        printLine(6);
        printLine(8);
    }

    public static void printLine(int len) { // int len - инициализираме променливата (дължина--> в случая *)
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
        System.out.println(); // Слагаме System.out.println();, за нов ред след всеки цикъл.
    }
}
