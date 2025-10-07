package org.ulpgc.is1.model;

import java.util.ArrayList;

public abstract class Contact {
    public Address adress;
    public String telephone;
    public String email;

    public Contact(String telephone, String email, String street,int number, int floor, String city) {
        this.telephone = telephone;
        this.email = email;
        setAddress(street, number, floor,city); //Lo asigna directamente al atributo que tenga this
    }
    public void setAddress( String street,int number, int floor, String city){
        this.adress = new Address(street, number, floor,city);
    }

    public abstract String getName(); //Fuerza a la clase hija a devolver aquello que tiene su geter, asi cada uno puede devolver en base aquello que representa

}