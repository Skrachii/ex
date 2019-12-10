package l10algotirhms;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(pow(3,4));
    }
    public static int pow (int n, int m){
        int reasult;
        if (m==0){
            reasult = 1;
        }
        else {
            reasult = n* pow(n,m-1);
        }
            return reasult;
    }
}
