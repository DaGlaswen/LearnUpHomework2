import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ContactsBook {

    HashMap<String, Contact> contactsMap = new HashMap();

    public void add(Contact contact) {
        contactsMap.put(contact.getPhoneNumber(), contact);
    }

    public Contact getByPhone(String phone) {
        for (String phoneInBook : contactsMap.keySet()) {
            if (phoneInBook == phone) {
                return contactsMap.get(phoneInBook);
            }
        }
        return null;
    }

    public void removeByPhone(String phone) {
        for (String phoneInBook : contactsMap.keySet()) {
            if (phoneInBook == phone) {
                contactsMap.remove(phoneInBook);
            }
        }
    }

    public ArrayList<Contact> getSortedContacts() {
        ArrayList<Contact> contacts = new ArrayList<>(contactsMap.values());
        Collections.sort(contacts);
        return contacts; // sorted
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{contactsBook: {\n");
        for (String phone : contactsMap.keySet()) {
            result.append("\t" + phone + ": " + contactsMap.get(phone).toString() + "\n");
        }
        result.append("\t}\n");
        result.append("}");
        return String.valueOf(result);
    }
}

