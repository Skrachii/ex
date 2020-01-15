package l13files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex6 {

    private static HashMap<String, Integer> counters = new HashMap<>();

    public static void main(String[] args) {
        try {
            createCounters();
            //System.out.println(counters);
            printFrequentWords();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printFrequentWords(){
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(counters.entrySet());
        Collections.sort(entries, Map.Entry.comparingByValue());
        for( int i = 0; i < 50; i++ ){
            Map.Entry entry = entries.get(entries.size() - i - 1);
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void createCounters() throws FileNotFoundException {
        File data = new File ("class/l13files/alice30.txt");
        Scanner fileScanner = new Scanner(data);
        fileScanner.useDelimiter("[^\\p{Alpha}]+");
        while (fileScanner.hasNext()){
            String word = fileScanner.next();
            word = word.toLowerCase();
            counters.putIfAbsent(word, 0);
            int counter = counters.get(word);
            counters.put(word, ++counter);
        }
    }
}
