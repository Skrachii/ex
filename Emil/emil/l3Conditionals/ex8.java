package emil.l3Conditionals;

public class ex8 {
    public static void main(String[] args) {
        int a1 = 8;

        int a2 = 7;

        int a3 = 6;


        if (a1 >= a2 && a2 >= a3) {

            System.out.println(a1);

            if (a2 >= a3) {

                System.out.println(a2);

                System.out.println(a3);

            } else {

                System.out.println(a3);

                System.out.println(a2);

            }

        } else if (a2 >= a1 && a2 >= a3) {

            System.out.println(a2);

            if (a1 >= a3) {

                System.out.println(a1);

                System.out.println(a3);

            }
        }
    }
}