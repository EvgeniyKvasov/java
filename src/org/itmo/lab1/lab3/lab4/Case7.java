package org.itmo.lab1.lab3.lab4;

import java.util.Arrays;

import java.util.Random;

public class Case7 {
    public static void main(String[] args) {

        int[] myArray = new int[7];

        Random random = new Random();

        boolean result = false;

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {

            if(myArray[i] < myArray[i+1]){

                result = true;

                break;
            }

            if(result){

                System.out.println("OK");
            }

            else{

                System.out.println("Please, try again");
            }
        }

    }
}
