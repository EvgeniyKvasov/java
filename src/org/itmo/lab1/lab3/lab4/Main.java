package org.itmo.lab1.lab3.lab4;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Задача 1.");

        case1(1, 99);

        System.out.println("Задача 2.");

        case2(1, 100);

        System.out.println("Задача 3.");

        System.out.println("Введите 3 числа:");

        int a1 = scanner.nextInt();

        int b1 = scanner.nextInt();

        int c1 = scanner.nextInt();

        boolean result1 = case3(a1, b1, c1);

        System.out.println("Результат: " + result1);

        System.out.println("Задача 4.");

        System.out.println("Введите 3 числа:");

        int a2 = scanner.nextInt();

        int b2 = scanner.nextInt();

        int c2 = scanner.nextInt();

        boolean result2 = case4(a2, b2, c2);

        System.out.println("Результат: " + result2);

        System.out.println("Задача 5.");

        int[] myArray1 = new int[7];

        for (int i = 0; i < myArray1.length; i++){

            myArray1[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(myArray1));

        boolean result3 = case5(myArray1);

        System.out.println("Рездультат: " + result3);

        System.out.println("Задача 6.");

        int[] myArray2 = new int[7];

        for (int i = 0; i < myArray2.length; i++){

            myArray2[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(myArray2));

        boolean result4 = case6(myArray2);

        System.out.println("Рездультат: " + result4);

    }

    public static void case1(int start, int end){

        for (int i = start; i <= end; i++){

            if (i % 2 != 0){

                System.out.println(i);
            }
        }
    }

    public static void case2(int start, int end){

        for (int i = start; i <= end; i++){

            if (i % 3 == 0){

                System.out.println("Делится на 3: " + i);
            }

            if (i % 5 == 0){

                System.out.println("Делится на 5: " + i);
            }

            if (i % 3 == 0 && i % 5 == 0){

                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
    }

    public static boolean case3(int a, int b, int c){

        return c == a + b;
    }

    public static boolean case4(int a, int b, int c){

        return (a < b && b < c);
    }

    public static boolean case5(int[] array){

        return (array[0] ==3 || array[array.length-1] == 3);
    }

    public static boolean case6(int[] array){

        for (int i: array){

            if (i == 1 || i == 3){

                return true;
            }
        }

        return false;
    }
}


