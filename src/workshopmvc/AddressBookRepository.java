package workshopmvc;

import java.util.ArrayList;

public class AddressBookRepository {
    static ArrayList<Person> personList = new ArrayList<>();
    public static void addPerson(Person person) {
        personList.add(person);
    }
    public static void displayPerson() {
        for (Person p:personList) {
            System.out.println(p.getfName());
            System.out.println(p.getlName());
        }
    }
}
