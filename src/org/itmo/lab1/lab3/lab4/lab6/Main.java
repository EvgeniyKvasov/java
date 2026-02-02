package org.itmo.lab1.lab3.lab4.lab6;

abstract class Human {

    String firstName;

    String lastName;

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public abstract void displayInfo();

    public Human(String firstName, String lastName) {

        this.firstName = firstName;

        this.lastName = lastName;
    }
}

public class Main {

    public static void main(String[] args) {


    }
}