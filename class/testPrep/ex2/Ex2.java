package testPrep.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try {
            ArrayList<Person> list = new ArrayList<>();
            Scanner input = new Scanner(new File("class/testPrep/ex2/data.txt"));
            while (input.hasNextLine()){
                String line = input.nextLine();
                Scanner lineScanner = new Scanner(line);
                String id = lineScanner.next();
                String firstName = lineScanner.next();
                String lastName = lineScanner.next();
                Person p = new Person(id, firstName, lastName);
                list.add(p);
            }
            for ( Person p : list    ) {
                System.out.println(p);
            }
            //System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
