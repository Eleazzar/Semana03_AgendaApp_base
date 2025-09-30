package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class Group {
    public final String name;
    private ArrayList<Contact> contacts;
    public Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<Contact>();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void removeContact(Contact contact){
        contacts.remove(contact);
    }
}