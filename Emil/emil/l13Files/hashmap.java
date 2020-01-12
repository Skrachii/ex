package emil.l13Files;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,String> PhoneBook = new LinkedHashMap<>(); // Създаване на HashMap
            PhoneBook.put("Pesho" , "1111111111"); // put - Добавяне на неща ;
            PhoneBook.put("Gosho" , "2222222222");
            PhoneBook.put("Sasho" , "3333333333");
            // Начин за обхождане на всички Ключове;

        for (String name: PhoneBook.keySet()) { // foreach loop ---> PhoneBook.KeySet --> Всички Ключове;
            System.out.printf("%s: %s\n",name , PhoneBook.get(name)); // PhoneBook.get(name)); ---> Връщане на стойността
            // на телефона;

            // HashMap връща всички ключове в случаен ред , в този случай :
            // Pesho: 1111111111 ; // Sasho: 3333333333 ; // Gosho: 2222222222
            // Има разновидност на Hashmap , който принти в точен ред LinkedHasMap<>();
            // В повечето случай не е важно как ще принтим ключовете ;
        }
    }
}
