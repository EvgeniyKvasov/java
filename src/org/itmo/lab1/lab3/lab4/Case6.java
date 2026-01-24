package org.itmo.lab1.lab3.lab4;

import java.util.Arrays;

import java.util.Random;

public class Case6 {
    public static void main(String[] args) {

        int[] myArray = new int[7];

        int toFind1 = 1;

        int toFind2 = 3;

        boolean result = false;

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(myArray));

        for (int i : myArray) {
            if (i == toFind1 || i == toFind2) {
                result = true;
                break;
            }
        }

        System.out.println(result);
    }
}