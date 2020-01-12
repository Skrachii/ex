package emil.l13Files.Ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contacts {

    private HashMap<String,String> contacts; // String , String  ни трябва за тирета , празни пространства и др.

        public Contacts () { // Инициализацията се прави в Конструктор;
            contacts = new HashMap<>(); // Създаване на HashMap;
        }

        public void add(String phoneNumber , String name )
        throws InvalidPhoneNumberException{
            int count = 0;
            for (int i = 0; i < phoneNumber.length(); i++ ) { // Създаване на изключение за числата и символите.
                char c = phoneNumber.charAt(i);
                if ( c >= '0' && c <= '9' ) {
                    count++;
                }
                else if ( c != ' ' && c != '-'){
                    throw new InvalidPhoneNumberException(" Invalid symbol: " + c ); // Хвърляне на Изключението , ако
                    // символа е невалиден - различен от 0-9 , спейс и тире.
                }
            }
            if (count != 10 ) {
                throw new InvalidPhoneNumberException(" Wrong number of digits" + count + ": 10 expected.");
            }
            contacts.put(phoneNumber, name); // Добавяне на номера и името в HashMap;
        }

        public void removeContact(String phoneNumber){
            contacts.remove(phoneNumber); // Изтриване на абоната; при изтриване на ключа --> името и номера на абоната
            // се изтрива;
        }

        public String getAllContacts() { // Трябва да връща символен низ ,т.е трябва да е String;
            String result = ""; // Създаване на един стринг и след това го връщаме;
            for (String phoneNumber:contacts.keySet()) { // Обхождаме всички номера , като взимаме contacts.keySet()) и
                // връща всички номера;
                String name = contacts.get(phoneNumber); // Получаване името , чрез номера;
                result = result + name  + " : " + phoneNumber + "\n"; // След всяка итерация получаваме резултата ,
                // За всяко име и тел. номер ще има отделна линия --> \n ;
            }
            return  result; // Втъщаме разултата;
        }

        public String getName(String phoneNumber) { // Метод връщане на името;
            String name = contacts.get(phoneNumber);
            if ( name != null) {                    // Ако името не е равно на null
                return  name;                       // Връщане на името
            }
            else {
                return " Name not found for this number!";
            }
        }

        public ArrayList<String> getPhone(String name) {
            ArrayList<String> result = new ArrayList<>(); // Създаване на Arraylist<>();
            for (Map.Entry<String , String > entry : contacts.entrySet() ) { // На всяка итерация Entry получаваме getKey - номера и getValue
                // номера и getValue името.
            if ( name.equalsIgnoreCase(entry.getValue())) { // equalsIgnoreCase в случай на главна или малка буква.
                result.add(entry.getKey()); // Ако името е същото като стойността , тогава телефона го добавяме
                // към резултата
              }
             }
            return result;
        }
    }

