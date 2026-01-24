package org.itmo.lab1.lab3.lab4;

import java.util.Arrays;

import java.util.Random;

public class Case5 {
    public static void main(String[] args) {

        int[] myArray = new int[7];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(myArray));

        boolean result = (myArray[0] == 3) || (myArray[6] == 3);

        System.out.println(result);
    }
}
