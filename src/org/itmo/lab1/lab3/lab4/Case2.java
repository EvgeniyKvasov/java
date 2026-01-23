package org.itmo.lab1.lab3.lab4;

public class Case2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {

                System.out.println("Делится на 3:" + " " + i + " ");
            }

            if (i % 5 == 0) {

                System.out.println("Делится на 5:" + " " + i + " ");
            }

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("Делится на 3 и 5:" + " " + i + " ");
            }
        }
    }
}
