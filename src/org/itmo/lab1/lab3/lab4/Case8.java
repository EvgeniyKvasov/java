package org.itmo.lab1.lab3.lab4;

import java.util.Scanner;

import java.util.Arrays;

public class Case8 {

    public static void main(String[] args){

        System.out.println("Введите длину массива:");

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] myArray = new int[length];

        System.out.println("Длинна массива: " + myArray.length);

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < length; i++){

            myArray[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива: " + Arrays.toString(myArray));
    }
}
