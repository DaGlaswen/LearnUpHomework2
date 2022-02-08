import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

    public void searchBy(Predicate<Contact> criterion) {
        List<Contact> sortedListOfContacts = getSortedContacts();
        for (Contact contact : sortedListOfContacts) {
            if (criterion.test(contact)) System.out.println(contact);
        }
    }

    public void searchBy(String pattern) {
        searchBy(contact -> contact.getName().matches(pattern.replace("*", ".*")));
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


    public Set<Integer> getCountries() {
        return contactsMap.keySet().stream().map(phone -> {
            StringBuilder countryCode = new StringBuilder();
            for (int i = 1; i < phone.length(); i++) {
                if (phone.charAt(i) != '-') {
                    countryCode.append(phone.charAt(i));
                } else {
                    break;
                }
            }
            return Integer.valueOf(String.valueOf(countryCode));
        }).collect(Collectors.toSet());
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

