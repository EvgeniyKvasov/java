package org.itmo.lab1.lab2;

import java.util.Scanner;

public class Сalculator {
    public static double addition(double a, double b) {
        return (a+b);
    }

    public static double division(double c, double d) {
        return (c/d);
    }

    public static double multiplicatition(double e, double f) {
        return (e*f);
    }

    public static double substraction(double g, double h) {
        return (g-h);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double sum = addition(a, b);

        System.out.println("Сумма двух чисел:" + sum);

        double c = scanner.nextDouble();

        double d = scanner.nextDouble();

        double div = division(c, d);

        System.out.println("Деление двух чисел:" + div);

        double e = scanner.nextDouble();

        double f = scanner.nextDouble();

        double mul = multiplicatition(e, f);

        System.out.println("Умножение двух чисел:" + mul);

        double g = scanner.nextDouble();

        double h = scanner.nextDouble();

        double sub = substraction(g, h);

        System.out.println("Вычитание двух чисел:" + sub);
    }
}

