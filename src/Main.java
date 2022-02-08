import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContactsBook contactsBook = new ContactsBook();
        Contact bob = new Contact("Bob", "+79121314366");
        Contact george = new Contact("George", "+79334536655");
        Contact mike = new Contact("Mike", "+79334536669");
        contactsBook.add(bob);
        contactsBook.add(george);
        contactsBook.add(mike);
        contactsBook.searchBy(contact -> contact.getName().toLowerCase().contains("bo"));
        contactsBook.searchBy("G*e");

        // Головинов Данил
    }
}
