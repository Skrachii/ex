package testPrep;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //switchExample();
        booleanExample();
        //ifExample();
        //intDivisionExample();
        //forExample();
        //doWhileExample();
        //passByValue();

//        String w = "world";
//        System.out.printf("I am one of the %d greatest coders in the %s", 5, w);
    }

    public static void doWhileExample() {
        do{
            System.out.println("Hello");
        }
        while (false);
    }

    public static void forExample() {
        for(int i = 5; i >= 0; ){
            System.out.println("Hello!");
        }
    }

    public static void intDivisionExample() {
        int a = 5;
        int b = 2;
        System.out.println((double) a/b);
    }

    public static void ifExample() {
//        int a = 1;
//        int b = 2;
//        if ( a > 1 ){
//            a = 0;
//            b = 0;
//        }
//        System.out.println(a + b);

        int a = 1;
        if( a >= 2 ){
            System.out.println("foo");
        }
        else if( a >= 1 ){
            System.out.println("bar");
        }
        else{
            System.out.println("foo bar");
        }
    }

    public static void booleanExample() {
        boolean a = true;
        boolean b = false;
        boolean c = a && (a || b);

        System.out.println(c);
    }

    public static void switchExample() {
        int a = 5;
        switch (a){
            case 1:
                a = 3;
            case 2:
                a = 4; break;
            default:
                a = 5;
        }

        System.out.println(a);
    }
    public static void passByValue(){
        int a = 5;
        int b = 6;
        swap(a,b);
        System.out.printf("%d, %d", a, b);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
