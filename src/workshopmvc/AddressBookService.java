package workshopmvc;

public class AddressBookService {
   AddressBookRepository addressBookRepository = new AddressBookRepository();

    public static void addPerson(Person person) {
        AddressBookRepository.addPerson(person);
    }
    public static void displayPerson() {
        System.out.println("Person list is----->");
        AddressBookRepository.displayPerson();
    }
}
