package l7methods;
/**
 * A program that draws two boxes
 */
public class Ex1 {

    public static void main(String[] args) {
        printBox();
        System.out.println();
        printBox();
    }

    public static void printBox(){
        printLine();
        printBody();
        printLine();
    }

    public static void printLine(){
        System.out.println("+------------+");
    }

    public static void printBody(){
        System.out.println("|            |");
        System.out.println("|            |");
    }

}