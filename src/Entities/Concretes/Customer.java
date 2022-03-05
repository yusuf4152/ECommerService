package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Customer implements Entity{
    private final int id;
    private final String name;
    private final String lastName;
    private final String mail;
    private final String password;
    public Customer(int id, String name, String lastName, String mail, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }
}
