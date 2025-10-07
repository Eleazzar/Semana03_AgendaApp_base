package org.ulpgc.is1.model;

public class Person extends Contact {
    public String firstName;
    public String lastName;

    public Person(String telephone, String email, String firstName, String lastName, String street,int number, int floor, String city) {
        super(telephone, email, street,number,floor,city);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override //Obliga a print esto cuando se le llama al metodo
    public String getName() {
        return "";
    }
}
