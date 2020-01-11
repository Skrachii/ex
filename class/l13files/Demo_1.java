package l13files;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo_1 {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("Ivan", "1111111111");
        phonebook.put("Stefan", "2222222222");
        phonebook.put("Emil", "3333333333");
        phonebook.put("Ivan", "44444444444");

        for ( String name : phonebook.keySet() ) {
            System.out.printf("%s : %s\n", name, phonebook.get(name));
        }
    }
}
