package org.itmo.lab1.lab3.lab4;

import java.util.Arrays;

import java.util.Random;

public class Case9 {
    public static void main(String[] args){

        int[] myArray = new int[7];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(10);
        }

        System.out.println("Массив 1: " + Arrays.toString(myArray));

        int temp = myArray[0];

        myArray[0] = myArray[6];

        myArray[6] = temp;

        System.out.println("Массив 2: " + Arrays.toString(myArray));

    }
}
