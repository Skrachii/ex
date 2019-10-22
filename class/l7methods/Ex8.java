package l7methods;
/**
 * Illustrates parameter pass by value - changes to a parameter
 * variable inside the method are not visible outside the method.
 */
public class Ex8 {

    public static void main(String[] args) {
        int x = 5;
        modifier(x);
        System.out.println("x in the end of main is " + x);
    }

    public static void modifier(int x){
        x = 2 * x;
        System.out.println("x inside modifier is " + x);
    }

}
