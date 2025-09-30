package org.ulpgc.is1.model;

public abstract class Contact {
    public String telephone;
    public String email;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public abstract String getName(); //Fuerza a la clase hija a devolver aquello que tiene su geter, asi cada uno puede devolver en base aquello que representa

}