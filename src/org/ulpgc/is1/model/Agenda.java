package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    public ArrayList<Contact> contacts;
    public ArrayList<Group> groups;
    public Agenda(ArrayList<Contact> contact, ArrayList<Group> group) {
        this.contacts = contact;
        this.groups = group;
    }
    //Usar
    public void addContact(Contact contact){
        Contact cont = new Contact(contact.telephone,contact.email,contact.adress);

    }

    public void addGroup(Group grupo){
        Group group = new Group(grupo.name);

    }


    public void addPerson(){

    }
    public void addCompany(){

    }
    public void addGroup(){

    }
    public void getContactList(){

    }
    public void getGroupList(){

    }
    public void addContact2Group(){

    }
}