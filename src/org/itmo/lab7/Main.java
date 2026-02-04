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
}

public class Main {

    public static void main(String[] args) {

        Airplane airplane = new Airplane();

        Airplane.Wing wing = airplane.new Wing(500);

        wing.showWeight();
    }
}