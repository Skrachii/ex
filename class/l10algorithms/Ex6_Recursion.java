package l10algorithms;

public class Ex6_Recursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(search(6, arr));
    }

    public static int search(int value, int[] array) {
        return search(value, array, 0);
    }

    public static int search(int value, int[] array, int idx) {

        if(array[idx] == value ) {
            return idx;
        }
        else if(idx == array.length - 1){
            return -1;
        }
        else{
            return search(value, array, ++idx);
        }
    }
}