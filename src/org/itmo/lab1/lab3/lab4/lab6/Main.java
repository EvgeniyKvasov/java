package org.itmo.lab1.lab3.lab4.lab6;


//case1-case2


interface BankOperations {

    String getBankName();

    void setBankName(String bankName);
}


interface Identifiable {

    String getId();

    void setId(String id);
}

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

class Client extends Human implements BankOperations, Identifiable {

    private String bankName;

    private String clientId;




    public Client(String firstName, String lastName, String bankName, String clientId) {

        super(firstName, lastName);

        this.bankName = bankName;

        this.clientId = clientId;

    }


    @Override

    public void displayInfo() {

        System.out.println("Имя: " + getFirstName());

        System.out.println("Фамилия: " + getLastName());

        System.out.println("Банк: " + bankName);

        System.out.println("ID клиента: " + clientId);

    }

    @Override

    public String getBankName() {

        return bankName;
    }

    @Override

    public void setBankName(String bankName) {

        this.bankName = bankName;
    }

    @Override

    public String getId() {

        return clientId;
    }

    @Override

    public void setId(String id) {

        this.clientId = id;
    }

}

class BankEmployee extends Human implements BankOperations, Identifiable {

    private String bankName;

    private String employeeId;


    public BankEmployee(String firstName, String lastName, String bankName, String employeeId) {

        super(firstName, lastName);

        this.bankName = bankName;

        this.employeeId = employeeId;

    }


    @Override

    public void displayInfo() {

        System.out.println("Имя: " + getFirstName());

        System.out.println("Фамилия: " + getLastName());

        System.out.println("Банк: " + bankName);

        System.out.println("ID сотрудника: " + employeeId);

    }

    @Override

    public String getBankName() {

        return bankName;
    }

    @Override

    public void setBankName(String bankName) {

        this.bankName = bankName;
    }


    @Override

    public String getId() {

        return employeeId;
    }

    @Override

    public void setId(String id) {

        this.employeeId = id;
    }

}

public class Main {

    public static void main(String[] args) {

        //case1-2 IO

        Client client = new Client("Иван", "Иванов", "Сбербанк", "1");

        BankEmployee employee = new BankEmployee("Анна", "Петрова", "Сбербанк", "1");

        System.out.println("Информация о клиенте:");
        client.displayInfo();

        System.out.println("Информация о сотруднике:");
        employee.displayInfo();

        System.out.println("Банк клиента: " + client.getBankName());

        client.setBankName("ВТБ");

        System.out.println("Новый банк клиента: " + client.getBankName());

        System.out.println("ID сотрудника: " + employee.getId());

        employee.setId("2");

        System.out.println("Новый ID сотрудника: " + employee.getId());

        System.out.println("Обновленная информация:");

        client.displayInfo();

        System.out.println();

        //case3 IO

        employee.displayInfo();

        Truck truck = new Truck(5000, "КАМАЗ", 'Б', 90.0f, 6, 15000.0);

        truck.outPut();

        truck.newWheels(8);
    }
}


