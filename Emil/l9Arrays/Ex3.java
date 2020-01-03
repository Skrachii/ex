package l9Arrays;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 6, 7, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reverse copy: " + Arrays.toString(reverseCopy(arr)));

    }

    public static int[] reverseCopy(int[] a )  { // Взимаме целия масив {5, 6, 6, 7, 3};
        int[] rCopy = new int[a.length]; // Нов масив , който е {0, 0 , 0 , 0 , 0};
        for (int i = 0; i < a.length; i++) { // i = 0 , i=1 , i=2 , i=3 , i=4 ; след всяко завъртанен а цикъла ,
            // новия масив се пълни отзад напред {0,0,0,0,5} ,т.е когато свърши цикъла новия масив ще  е {3,7,6,6,5}.
            rCopy[rCopy.length - 1 - i] = a[i]; // За формулта пример : за 2 елемент Length3 = Length - 1 - (Length - 3)
            // = Length - 1 - Length + 3 = 2 ; Масива  = L -1  - a ; rCopy.length - 1 (е L - 1 ) и от него вадим i
            // което е равно на a[i] , Когато i e 0 ( l - 1 ) , това ще е първия елемент от новия масив , и така до края
            // на масива.
        }
        return rCopy; // Запазваме стойността на масива и я подаваме на reverseCopy(arr)).
    }
}