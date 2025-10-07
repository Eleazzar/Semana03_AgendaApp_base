package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public abstract class Contact {
    public String telephone;
    public String email;
    private ArrayList<Address> addresses; //Supuesta agregacion de address
    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }
    public void setAddress(String street, int number,int floor, String city){
        this.addresses = new Address (street,number, floor, city);
    }

    public abstract String getName(); //Fuerza a la clase hija a devolver aquello que tiene su geter, asi cada uno puede devolver en base aquello que representa

}
