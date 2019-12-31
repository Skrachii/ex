package emil.l13Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {

        File data = new File("data.txt");
        Scanner fileScanner = new Scanner(data);
        while (fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
    }
}
