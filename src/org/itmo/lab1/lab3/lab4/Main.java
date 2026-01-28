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

        for (int i = 0; i < myArray1.length; i++) {

            myArray1[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(myArray1));

        boolean result3 = case5(myArray1);

        System.out.println("Результат: " + result3);

        System.out.println("Задача 6.");

        int[] myArray2 = new int[7];

        for (int i = 0; i < myArray2.length; i++) {

            myArray2[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(myArray2));

        boolean result4 = case6(myArray2);

        System.out.println("Результат: " + result4);

        System.out.println("Задача 7.");

        int[] myArray3 = new int[7];

        for (int i = 0; i < myArray3.length; i++) {

            myArray3[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(myArray3));

        boolean result5 = case7(myArray3);

        System.out.println("Результат: " + result5);

        if (result5) {

            System.out.println("OK");
        } else {

            System.out.println("Please, try again");
        }

        System.out.println("Задача 8.");

        int[] myArray4 = case8(scanner);

        System.out.println("Результат: " + Arrays.toString(myArray4));

        System.out.println("Задача 9.");

        int[] myArray5 = new int[7];

        for (int i = 0; i < myArray5.length; i++) {

            myArray5[i] = random.nextInt(10);
        }

        case9(myArray5);

        System.out.println("Задача 10.");

        int[] myArray6 = new int[6];

        for (int i = 0; i < myArray6.length; i++) {

            myArray6[i] = random.nextInt(5);
        }

        System.out.println("Массив: " + Arrays.toString(myArray6));

        System.out.println("Уникальные элементы:");

        case10(myArray6);

    }

    public static void case1(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i % 2 != 0) {

                System.out.println(i);
            }
        }
    }

    public static void case2(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i % 3 == 0) {

                System.out.println("Делится на 3: " + i);
            }

            if (i % 5 == 0) {

                System.out.println("Делится на 5: " + i);
            }

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
    }

    public static boolean case3(int a, int b, int c) {

        return c == a + b;
    }

    public static boolean case4(int a, int b, int c) {

        return (a < b && b < c);
    }

    public static boolean case5(int[] array) {

        return (array[0] == 3 || array[array.length - 1] == 3);
    }

    public static boolean case6(int[] array) {

        for (int i : array) {

            if (i == 1 || i == 3) {

                return true;
            }
        }

        return false;
    }

    public static boolean case7(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {

                return false;
            }
        }

        return true;
    }

    public static int[] case8(Scanner scanner) {

        System.out.println("Введите длину массива:");

        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Длинна массива: " + array.length);

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] case9(int[] array) {

        System.out.println("Исходный массив: " + Arrays.toString(array));

        int temp = array[0];

        array[0] = array[6];

        array[6] = temp;

        System.out.println("Преобразованный массив: " + Arrays.toString(array));

        return array;
    }

    public static void case10(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            boolean result = true;

            for (int j = 0; j < array.length - 1; j++) {

                if (array[i] == array[j] && i != j) {

                    result = false;

                    break;
                }
            }

            if (result) {

                System.out.println(array[i]);
            }
        }
    }
}


