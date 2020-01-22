package l15more;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo_3 {
    public static void main(String[] args) {
        try {
            File data = new File("class/l13files/alice30.txt");
            Scanner fileScanner = new Scanner(data);
            fileScanner.useDelimiter("[^\\p{Alpha}]+");

//            System.out.println(fileScanner.tokens().count());

            fileScanner.
                    tokens().
                    filter(s -> s.length() > 10).
                    limit(50).
                    forEach(System.out::println);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
