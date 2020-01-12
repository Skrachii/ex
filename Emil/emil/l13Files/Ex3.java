package emil.l13Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try {
            File data = new File ("class/l13files/data.txt");
            Scanner scanner = new Scanner(data);
            String firstLine = scanner.nextLine();
            Scanner firstLineScanner = new Scanner(firstLine);
            String firstDay = firstLineScanner.next();
            String firstDate = firstLineScanner.next();
            int firstTemp = firstLineScanner.nextInt();
            while (scanner.hasNextLine()){
                String secondLine = scanner.nextLine();
                Scanner secondLineScanner = new Scanner(secondLine);
                String secondDay = secondLineScanner.next();
                String secondDate = secondLineScanner.next();
                int secondTemp = secondLineScanner.nextInt();
                System.out.printf("From %s %s to %s %s change %d\n",
                        firstDay, firstDate, secondDay, secondDate, secondTemp - firstTemp);
                firstDay = secondDay;
                firstDate = secondDate;
                firstTemp = secondTemp;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
