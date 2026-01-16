package org.itmo.lab1.lab2;

import java.util.Scanner;

public class calculator {
    public static double addition(double a, double b) {
        return (a+b);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double sum = addition(a, b);

        System.out.println("Сумма двух чисел:" + sum);
    }
}
