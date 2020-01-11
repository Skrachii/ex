package l13files.ex4;

public class Ex4 {
    public static void main(String[] args) {
        Contacts theContacts = new Contacts();
        try {
            theContacts.addContact("111 111-1111", "Ivan");
            theContacts.addContact("222 222 2222", "Pesho");
            theContacts.addContact("3333333333", "Gosho");
            theContacts.addContact("4444444444", "Gosho");
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(theContacts.getAllContacts());
        theContacts.removeContact("111111111");
        System.out.println(theContacts.getAllContacts());
        System.out.println(theContacts.getName("333333333"));
        System.out.println(theContacts.getName("111111111"));
        System.out.println(theContacts.getPhone("Ivan"));
    }
}
