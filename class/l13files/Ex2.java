package l13files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            File data= new File("data.txt");
            Scanner input = new Scanner (data);
            int counter = 0;
            float sum = 0;
            while(input.hasNextLine()){
                String line = input.nextLine();
                lines.add(line);
                Scanner lineScanner = new Scanner(line);
                lineScanner.next();
                lineScanner.next();
                int t = lineScanner.nextInt();
                sum = sum + t;
                counter++;
            }
            float average = sum/counter;
            System.out.printf("Average temperature: %.2f\n", average);
            System.out.println("Days higher than average: ");
            for (String line : lines ) {
                Scanner lineScanner = new Scanner(line);
                String day = lineScanner.next();
                String date = lineScanner.next();
                int t = lineScanner.nextInt();
                if( t > average ){
                    System.out.printf("%s %s\n", day, date);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;

        }
    }
}
