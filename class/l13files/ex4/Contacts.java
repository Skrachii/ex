package l13files.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contacts {

    private HashMap<String, String> contacts;

    public Contacts(){
        contacts = new HashMap<>();
    }

    public void addContact(String phoneNumber, String name)
    throws InvalidPhoneNumberException{
        int count = 0;
        for (int i = 0; i < phoneNumber.length(); i++ ) {
            char c = phoneNumber.charAt(i);
            if( c >= '0' && c <= '9'){
                count++;
            }
            else if( c != ' ' && c != '-'){
                throw new InvalidPhoneNumberException("Invalid symbol: " + c);
            }
        }
        if( count != 10 ){
            throw new InvalidPhoneNumberException("Wrong number of digits: " +
                    count + "; 10 expected." );
        }
        contacts.put(phoneNumber, name);
    }

    public void removeContact(String phoneNumber){
        contacts.remove(phoneNumber);
    }

    public String getAllContacts(){
        String result = "";
        for ( String phoneNumber : contacts.keySet()) {
            String name = contacts.get(phoneNumber);
            result = result + name + " : " + phoneNumber + "\n";
        }
        return result;
    }

    public String getName( String phoneNumber ){
        String name = contacts.get(phoneNumber);
        if( name != null ) {
            return name;
        }
        else{
            return "Name not found for " + phoneNumber;
        }
    }

    public ArrayList<String> getPhone(String name ){
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : contacts.entrySet() ) {
            if( name.equalsIgnoreCase(entry.getValue())){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
