package org.itmo.lab7;

//удалены лишние файлы из ветки лаб7

public class Main {

    class Airplane {

        class Wing {

            private int weight;

            public Wing(int weight) {

                this.weight = weight;
            }

            public void showWeight() {

                System.out.println("Вес крыла: " + weight + " кг");
            }
        }

        public Wing createWing(int weight) {

            return new Wing(weight);
        }
    }

    public static void main(String[] args) {

        Main main = new Main();

        Airplane airplane = main.new Airplane();

        Airplane.Wing leftWing = airplane.createWing(500);

        Airplane.Wing rightWing = airplane.createWing(550);

        leftWing.showWeight();

        rightWing.showWeight();
    }
}