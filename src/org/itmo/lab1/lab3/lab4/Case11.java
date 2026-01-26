import java.util.Arrays;

import java.util.Random;

public class Case11 {
    public static void main(String[] args) {

        int[] myArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(20);
        }

        System.out.println("Исходный массив: " + Arrays.toString(myArray));

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

        System.out.println("Левая часть массива: " + Arrays.toString(left));

        System.out.println("Правая часть массива: " + Arrays.toString(right));

        sortirovkaLeft(left);

        System.out.println("Отсортированная левая часть: " + Arrays.toString(left));

        sortirovkaRight(right);

        System.out.println("Отсортированная правая часть: " + Arrays.toString(right));

        int[] result = mergeArrays(left, right);

        System.out.println("Отсортированный склеенный массив: " + Arrays.toString(result));

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

    public static int[] mergeArrays(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
}
