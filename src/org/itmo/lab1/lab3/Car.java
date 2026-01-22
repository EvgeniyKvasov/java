package org.itmo.lab1.lab3;

public class Car {

    private String color;

    private String name;

    private double weight;

    public void printInfo(){
        System.out.println(color);
        System.out.println(name);
        System.out.println(weight);
    }

    Car(){}

    Car(String color){
        this.color = color;
    }

    Car(String color, double weight){
        this.color = color;
        this.weight = weight;
    }
}

class Main {
    public static void main(String[] args){

        Car car1 = new Car("Черный");

        Car car2 = new Car("Серебристый", 2400);

        Car car3 = new Car();

        car1.printInfo();

        car2.printInfo();

        car3.printInfo();
    }
}

