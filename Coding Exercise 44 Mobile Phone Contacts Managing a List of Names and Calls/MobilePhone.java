import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber =  myNumber;
        this.myContacts =  new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        int index = findContact(newContact.getName());
        if (index == -1) {
            return myContacts.add(newContact);
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index == -1) {
            return false;
        }
        myContacts.set(index, newContact);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return findContact(contact);
            }
        }
        return -1;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    public Contact queryContact(String name) {
        return myContacts.get(findContact(name));
    }

    public void printContacts() {
        int count = 1;
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(count++ + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}

