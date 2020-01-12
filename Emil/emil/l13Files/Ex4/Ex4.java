package emil.l13Files.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        Contacts theContacts  = new Contacts(); // Създаване на обект от Контакти;
        System.out.println(" Това са всички абонати! ");
        try {
            theContacts.add("1234 567-890", "Pesho"); // Добавяме контанкт;
            theContacts.add("2345678901", "Sasho"); // Добавяме контанкт;
            theContacts.add("3456789012", "Gosho"); // Добавяме контанкт;
            theContacts.add("4567890123", "Gosho"); // Добавяме контанкт;
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(theContacts.getAllContacts());  // Принтене на добавените контакти;
        //System.out.println(" След изтриване на абонат: ");
        //theContacts.removeContact("123456789"); // Изтриване на номер;
        System.out.println(theContacts.getAllContacts()); // Принтене на контактите след изтриване на абонат;
       // System.out.println(" При повикване на име на абонат: ");
        //System.out.println(theContacts.getName("345678901")); // Метода getName --> Връща името , чрез
        // вписване на номера
       // System.out.println(" Извикване на номер на абонат: ");
       // System.out.println(theContacts.getPhone("gosho")); // Извикване на абонати с еднакви имена;
    }
}
