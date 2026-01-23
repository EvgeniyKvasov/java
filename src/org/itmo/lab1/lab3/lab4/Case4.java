package org.itmo.lab1.lab3.lab4;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа:");

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        boolean result = (a < b && b < c);

        System.out.println("Результат: " + result);
    }
}
