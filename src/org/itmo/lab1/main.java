package org.itmo.lab1;

import java.util.Scanner;

public class main {

    //case1

    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        //case2

        int result1 = (46+10)*(10/3);
        System.out.println(result1);

        int result2 = (29)*(4)*(-15);
        System.out.println(result2);

        //case3
        int number = 10500;

        int result = (number/10)/10;
        System.out.println(result);

        //case4

        double a = 3.6;
        double b = 4.1;
        double c = 5.9;

        double result4 = a*b*c;

        System.out.println(result4);

        //case5
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        System.out.println(num1);

        int num2 = scanner.nextInt();
        System.out.println(num2);

        int num3 = scanner.nextInt();
        System.out.println(num3);

        //case6

        int d = scanner.nextInt();

        if (d % 2 != 0) {
            System.out.println("Нечетное");
        } else if (d > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}
