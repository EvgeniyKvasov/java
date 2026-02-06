package org.itmo.lab7;

class Airplane {

    class Wing {

        private int weight;

        public void showWeight() {

            System.out.println("Вес крыла: " + weight + " кг");
        }

        public Wing(int weight) {

            this.weight = weight;
        }
    }

    public Wing createLeftWing(int weight) {

        return new Wing(weight);
    }

    public Wing createRightWing(int weight) {

        return new Wing(weight);
    }
}

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane();

        Airplane.Wing leftWing = airplane.createLeftWing(500);

        Airplane.Wing rightWing = airplane.createRightWing(550);

        leftWing.showWeight();

        rightWing.showWeight();
    }
}