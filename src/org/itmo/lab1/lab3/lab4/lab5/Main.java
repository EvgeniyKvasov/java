package org.itmo.lab1.lab3.lab4.lab5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1.");

        System.out.println("Ищу самое длинное слово в этом тексте.");

        String text = "Ищу самое длинное слово в этом тексте";

        String longest = findLongestWord(text);

        System.out.println("Самое длинное слово: " + longest + ".");

        System.out.println("Задача 2.");

        String word = scanner.next();

        boolean result = isPalindrom(word);

        System.out.println("Результат: " + result);
    }

    public static String findLongestWord(String text) {

        String[] words = text.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {

                longest = word;
            }
        }

        return longest;
    }

    public static boolean isPalindrom(String word) {

        int left = 0;

        int right = word.length() - 1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {

                return false;
            }

            left++;

            right--;
        }

        return true;
    }
}
