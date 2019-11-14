package testPrep;

public class Test {
    public static void main(String[] args) {
        //switchExample();
        //booleanExample();
        //ifExample();
        //intDivisionExample();

        for(int i = 5; i > 0; i -= 2){
            System.out.println("Hello!");
        }
    }

    public static void intDivisionExample() {
        int a = 5;
        int b = 2;
        System.out.println((double) a/b);
    }

    public static void ifExample() {
        int a = 1;
        int b = 2;
        if ( a > 1 ){
            a = 0;
            b = 0;
        }
        System.out.println(a + b);
    }

    public static void booleanExample() {
        boolean a = true;
        boolean b = false;
        boolean c = (a && b) || (a && b);

        System.out.println(c);
    }

    public static void switchExample() {
        int a = 2;
        switch (a){
            case 1:
                a = 3; break;
            case 2:
                a = 4;
            default:
                a = 5;
        }

        System.out.println(a);
    }
}
