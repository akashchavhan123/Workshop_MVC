package workshopmvc;

import java.util.Scanner;

public class AddressBookController {
    static Scanner sc = new Scanner(System.in);
   static Person readPersonDataFromConsole(){
        Person p = new Person();
       System.out.println("Enter First Name");
        String fName = sc.next();
       System.out.println("Enter Last Name");
        String lName = sc.next();
        p.setfName(fName);
        p.setlName(lName);

       return p;
   }

    public static void main(String[] args) {
       AddressBookService addressBookService = new AddressBookService();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Add 2.Display");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    Person person = readPersonDataFromConsole();
                    AddressBookService.addPerson(person);
                    break;
                case 2:
                    AddressBookService.displayPerson();
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }
    }
}
