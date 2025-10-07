package org.ulpgc.is1.model;

public class Company extends Contact {
    public String name;
    public String description;

    public Company(String telephone, String email, String name, String description, Address address) {
        super(telephone, email,address);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return "";
    }
}
