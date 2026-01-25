import java.util.Arrays;

import java.util.Random;

public class Case10 {
    public static void main(String[] args){

        int[] myArray = new int[6];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(5);
        }

        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++){

            boolean result = true;

            for (int j = 0; j < myArray.length; j++){

                if (myArray[i] == myArray[j] && i != j){

                    result = false;

                    break;
                }
            }

            if (result) System.out.println(myArray[i]);

        }


    }
}
