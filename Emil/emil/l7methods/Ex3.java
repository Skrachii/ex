package emil.l7methods;
//1-This is mess1.
//2-This is mess2.
//3-This is mess1.
//4-Done with mess2.
//5-Dome with main.

public class Ex3 {

    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }

    public static void message1() {
        System.out.println("This is message1.");
    }

    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message2.");
    }
}

