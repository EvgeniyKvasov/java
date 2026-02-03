package org.itmo.lab1.lab3.lab4.lab6;


//case1-case2
abstract class Human {

    private String firstName;

    private String lastName;

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

class Client extends Human {

    private String bankName;


    public Client(String firstName, String lastName, String bankName) {

        super(firstName, lastName);

        this.bankName = bankName;

    }


    @Override

    public void displayInfo() {

        System.out.println("Имя: " + getFirstName());

        System.out.println("Фамилия: " + getLastName());

        System.out.println("Банк: " + bankName);

    }


    public String getBankName() {

        return bankName;
    }

}

class BankEmployee extends Human {

    private String bankName;



    public BankEmployee(String firstName, String lastName, String bankName) {

        super(firstName, lastName);

        this.bankName = bankName;

    }


    @Override

    public void displayInfo() {

        System.out.println("Имя: " + getFirstName());

        System.out.println("Фамилия: " + getLastName());

        System.out.println("Банк: " + bankName);

    }


    public String getBankName() {

        return bankName;
    }

}

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck(5000, "КАМАЗ", 'Б', 90.0f, 6, 15000.0);

        truck.outPut();

        truck.newWheels(8);
    }
}


