package org.itmo.lab1.lab2;

import java.util.Scanner;

public class Сalculator {

    public static int addition(int a, int b) {
        return (a+b);
    }

    public static long addition(long a, long b) {
        return (a+b);
    }

    public static double addition(double a, double b) {
        return (a+b);
    }

    public static double division(int a, int b) {
        return (double)(a/b);
    }

    public static double division(long a, long b) {
        return (double)(a/b);
    }

    public static double division(double a, double b) {
        return (a/b);
    }

    public static int multiplicatition(int a, int b) {
        return (a*b);
    }

    public static long multiplicatition(long a, long b) {
        return (a*b);
    }

    public static double multiplicatition(double a, double b) {
        return (a*b);
    }

    public static int substraction(int a, int b) {
        return (a-b);
    }

    public static long substraction(long a, long b) {
        return (a-b);
    }

    public static double substraction(double a, double b) {
        return (a-b);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int aInt = scanner.nextInt();

        int bInt = scanner.nextInt();

        System.out.println("Сумма двух чисел int:" + addition(aInt, bInt));

        System.out.println("Деление двух чисел int:" + (double)division(aInt, bInt));

        System.out.println("Умножение двух чисел int:" + multiplicatition(aInt, bInt));

        System.out.println("Вычитание двух чисел int:" + substraction(aInt, bInt));

        long aLong = scanner.nextLong();

        long bLong = scanner.nextLong();

        System.out.println("Сумма двух чисел long:" + addition(aLong, bLong));

        System.out.println("Деление двух чисел long:" + (double)division(aLong, bLong));

        System.out.println("Умножение двух чисел long:" + multiplicatition(aLong, bLong));

        System.out.println("Вычитание двух чисел long:" + substraction(aLong, bLong));

        double aDouble = scanner.nextDouble();

        double bDouble = scanner.nextDouble();

        System.out.println("Сумма двух чисел double:" + addition(aDouble, bDouble));

        System.out.println("Деление двух чисел double:" + division(aDouble, bDouble));

        System.out.println("Умножение двух чисел double:" + multiplicatition(aDouble, bDouble));

        System.out.println("Вычитание двух чисел double:" + substraction(aDouble, bDouble));

    }
}

