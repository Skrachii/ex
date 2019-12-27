package emil.l3Conditionals;

public class Ex7 {
    public static void main(String[] args) {
        int a1 = 5;

        int a2 = 6;

        int a3 = 7;


        if (a1 < a2) {

            int temp = a2;

            a2 = a1;

            a1 = temp;

        }

        if (a1 < a3) {

            int temp = a3;

            a3 = a1;

            a1 = temp;

        }

        if (a2 < a3) {

            int temp = a3;

            a3 = a2;

            a2 = temp;

        }

        System.out.println(a1 + " " + a2 + " " + a3);

    }
}


