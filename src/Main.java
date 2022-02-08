import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContactsBook contactsBook = new ContactsBook();
        Contact bob = new Contact("Bob", "+7-9121314366");
        Contact george = new Contact("George", "+7-9334536655");
        Contact mike = new Contact("Mike", "+7-9334536669");
        Contact sam = new Contact("Sam", "+1-5555551234");
        Contact viktor = new Contact("Viktor", "+2-3441556534");
        contactsBook.add(bob);
        contactsBook.add(george);
        contactsBook.add(mike);
        contactsBook.add(sam);
        contactsBook.add(viktor);

        System.out.println(contactsBook.getCountries());
        // Головинов Данил
    }
}
