package l13files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> input =
                new ArrayList<>(Arrays.asList(1,2,3,4,3,2,3,3));
        System.out.println(maxOccurrences(input));
    }

    public static int maxOccurrences(ArrayList<Integer> list){
        HashMap<Integer , Integer> tally = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            Integer counter = tally.get(value);
            if (counter == null) {
                tally.put(value, 1);
            } else {
                counter++;
                tally.put(value, counter);
            }
        }
        Integer higher = 0;
        Integer key = 0;
        for ( int i : tally.keySet() ) {
            if (tally.get(i) > higher ){
                higher = tally.get(i);
                key = i;
            }
        }
        System.out.println(tally);
        return key;
    }
}
