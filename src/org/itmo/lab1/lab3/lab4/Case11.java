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

        System.out.println(Arrays.toString(left));

        System.out.println(Arrays.toString(right));
    }
}
