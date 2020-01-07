package l13files;

import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        try {
            readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//            //e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() throws FileNotFoundException {
        File data = new File("data.txt");

        Scanner fileScanner = new Scanner(data);

//        for (int i = 0; i < 8; i++) {
        while (fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
    }
}
