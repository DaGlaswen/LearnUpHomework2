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
        System.out.println(contactsBook);
        Contact someGuy = contactsBook.getByPhone("+79334536655");
        System.out.println(someGuy);
        contactsBook.removeByPhone(someGuy.getPhoneNumber());
        System.out.println(contactsBook);
        ArrayList<Contact> sortedContacts = contactsBook.getSortedContacts();
        System.out.println(sortedContacts);
        // Головинов Данил
    }
}
