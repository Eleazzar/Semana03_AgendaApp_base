package org.ulpgc.is1.model;
import java.util.ArrayList;

public abstract class Contact {
    public final Address adress;
    public String telephone;
    public String email;

    public Contact(String telephone, String email, Address adress) {
        this.telephone = telephone;
        this.email = email;
        this.adress = adress; //Como el diagrama dice que unicamente puede haber una 1 pues es un atributo de NO lista
    }
    public void addAddress(Address address){
        adress.add(address);
    }

    public abstract String getName(); //Fuerza a la clase hija a devolver aquello que tiene su geter, asi cada uno puede devolver en base aquello que representa

}
