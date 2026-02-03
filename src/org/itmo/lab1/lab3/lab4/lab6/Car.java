package org.itmo.lab1.lab3.lab4.lab6;

public class Car {

    public int weight;

    public String model;

    public char color;

    public float speed;

    public void outPut() {

        System.out.println("Вес " + model + " составляет " + weight + "кг.");

        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car(int w, String m, char c, float s) {

        weight = w;

        model = m;

        color = c;

        speed = s;
    }

    public Car() {}
}


class Truck extends Car {

    public int numberOfWheels;

    public double maxWeight;


    public Truck(int w, String m, char c, float s, int wheels, double maxW) {

        super(w, m, c, s);

        numberOfWheels = wheels;

        maxWeight = maxW;
    }


    public void newWheels(int newWheels) {

        numberOfWheels = newWheels;

        System.out.println("Новое количество колес: " + numberOfWheels);
    }
}