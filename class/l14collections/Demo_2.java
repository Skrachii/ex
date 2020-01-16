package l14collections;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Demo_2 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        Person pesho = new Person("1111", "Pesho");
        Person pesho2 = new Person("1111", "Pesho");

        System.out.println(pesho.hashCode());
        System.out.println(pesho2.hashCode());

        set.add(pesho);
        set.add(new Person("2222", "Gosho"));
        set.add(new Person("3333", "Tosho"));
        set.add(new Person("4444", "Sasho"));

        System.out.println(set);

        set.remove(pesho2);
        System.out.println(set);

    }
}

class Person{
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}