package lesson_33.code.lessoncode.practice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<>();

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)){
            contacts.add(contact);
            System.out.println("Contact " + contact.getName() + " added.");
         } else {
            System.out.println("Contact " + contact.getName() + " is already exist.");
        }
    }

    public void deleteContact(Contact contact) {
        if (contacts.contains(contact)){
            contacts.remove(contact);
            System.out.println("Contact " + contact.getName() + " deleted.");
        } else {
            System.out.println("Contact " + contact.getName() + " doesn't exist.");
        }
    }

    public void getAllContacts(){

        Comparator<Contact> comparatorContacts = new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        TreeSet<Contact> contactsSorted = new TreeSet<>(comparatorContacts);

        contactsSorted.addAll(contacts);

        System.out.println(contactsSorted);


    }

    public Contact getContactByName(String name){
        for (Contact contact : contacts){
            if (contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }


    public Contact getContactByPhone(String phoneNumber){
        for (Contact contact : contacts){
            if (contact.getPhoneNumber().equals(phoneNumber)){
                return contact;
            }
        }
        return null;
    }

}
