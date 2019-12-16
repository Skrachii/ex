package l12inheritance.ex1;

public class Person implements Comparable<Person>{
    private String id;
    private String firstName;
    private String familyName;
    private static int counter;

    public Person(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
        counter++;
        id = "BG" + String.format("%06d", counter);
    }

    public String personalDetails (){
        return String.format("id: %s; Name: %s %s",id, firstName, familyName);
    }

    @Override
    public boolean equals(Object obj) {
        if( obj != null && obj instanceof Person ){
            Person other = (Person)obj;
            if(other.firstName.equals(firstName) &&
                    other.familyName.equals(familyName)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return personalDetails();
    }

    @Override
    public int compareTo(Person o) {
        int firstNameCompare = firstName.compareTo(o.firstName);
        if( firstNameCompare != 0 ) {
            return firstNameCompare;
        }
        else{
            return familyName.compareTo(o.familyName);
        }
    }
}


