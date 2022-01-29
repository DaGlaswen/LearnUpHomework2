import java.util.ArrayList;
import java.util.stream.Collectors;

public class ContactsBook {

    ArrayList<Contact> contactsArray = new ArrayList<>();

    public void add(Contact contact) {
        contactsArray.add(contact);
    }

    public Contact getByPhone(String phone) {
        for (Contact contact : contactsArray) {
            if (contact.getPhoneNumber() == phone) {
                return contact;
            }
        }
        return null;
    }

    public void removeByPhone(String phone) {
        for (int i = 0; i < contactsArray.size(); i++) {
            if (contactsArray.get(i).getPhoneNumber() == phone) {
                contactsArray.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        // Взято с StackOverflow
        return contactsArray.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
