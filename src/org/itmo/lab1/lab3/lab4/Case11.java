import java.util.Arrays;

import java.util.Random;

public class Case11 {
    public static void main(String[] args) {

        int[] myArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(myArray));

        int center = myArray.length / 2;

        int[] left = new int[center];

        int[] right = new int[myArray.length - center];


        for (int i = 0; i < myArray.length; i++) {
            if (i < center) {
                left[i] = myArray[i];
            } else {
                right[i - center] = myArray[i];
            }

        }

       // System.out.println(Arrays.toString(left));

       // System.out.println(Arrays.toString(right));

        sortirovkaLeft(left);

       // System.out.println(Arrays.toString(left));

        sortirovkaRight(right);

      //  System.out.println(Arrays.toString(right));

    }



    public static void sortirovkaLeft(int[] left) {

        for (int i = 0; i < left.length-1; i++) {

            for (int j = 0; j < left.length-i-1; j++) {

                if (left[j] > left[j + 1]) {
                    // Обмен элементов
                    int temp = left[j];
                    left[j] = left[j + 1];
                    left[j + 1] = temp;
                }
            }
        }
    }

    public static void sortirovkaRight(int[] right) {

        for (int i = 0; i < right.length-1; i++) {

            for (int j = 0; j < right.length-i-1; j++) {

                if (right[j] > right[j + 1]) {
                    // Обмен элементов
                    int temp = right[j];
                    right[j] = right[j + 1];
                    right[j + 1] = temp;
                }
            }
        }
    }
}
