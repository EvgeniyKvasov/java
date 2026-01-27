package org.itmo.lab1.lab3.lab4;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1.");
        case1();

        System.out.println("Задача 2.");
        case2();

        System.out.println("Задачав 3.");
        case3(scanner);

        System.out.println("Задача 4.");
        case4(scanner);

        System.out.println("Задача 5.");
        case5();

        System.out.println("Задача 6.");
        case6();

    }


    public static void  case1() {

        for (int i = 1; i <= 99; i++) {

            if (i % 2 != 0) {

                System.out.println(i);
            }
        }
    }


    public static void  case2() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("Делится на 3 и 5: " + i);
            }

            else if (i % 3 == 0) {

                System.out.println("Делится на 3: " + i);
            }
            else if (i % 5 == 0) {

                System.out.println("Делится на 5: " + i);
            }
        }
    }


    public static void  case3(Scanner scanner) {

        System.out.println("Введите 3 числа:");

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        boolean result = (a + b == c);

        System.out.println("Результат: " + result);
    }


    public static void  case4(Scanner scanner) {

        System.out.println("Введите 3 числа:");

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        boolean result = (a < b && b < c);

        System.out.println("Результат: " + result);
    }


    public static void  case5() {

        int[] myArray = new int[7];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(10);
        }


        System.out.println("Массив: " + Arrays.toString(myArray));

        boolean result = (myArray[0] == 3) || (myArray[myArray.length - 1] == 3);

        System.out.println("Результат: " + result);
    }


    public static void  case6() {

        int[] myArray = new int[7];

        int toFind1 = 1;

        int toFind2 = 3;

        boolean result = false;

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(20);
        }

        System.out.println("Массив: " + Arrays.toString(myArray));

        for (int i : myArray) {

            if (i == toFind1 || i == toFind2) {

                result = true;

                break;
            }
        }

        System.out.println("Результат: " + result);
    }
}