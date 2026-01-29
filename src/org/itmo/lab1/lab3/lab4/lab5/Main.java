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

        System.out.println("Задача 3.");

        String sentence = "Это слово бяка и еще бяка плохое";

        String censored = Baka(sentence);

        System.out.println(sentence);

        System.out.println("Результат: " + censored);
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

    public static boolean isPalindrom(String text) {

        int left = 0;

        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {

                return false;
            }

            left++;

            right--;
        }

        return true;
    }

    public static String Baka(String text) {

        String target = "бяка";

        String replacement = "[вырезано цензурой]";

        String result = "";

        int i = 0;

        while (i < text.length()) {

            if (i <= text.length() - 4) {

                if (text.charAt(i) == 'б' &&

                        text.charAt(i + 1) == 'я' &&

                        text.charAt(i + 2) == 'к' &&

                        text.charAt(i + 3) == 'а') {

                    result += replacement;

                    i += 4;

                } else {

                    result += text.charAt(i);

                    i++;
                }

            } else {

                result += text.charAt(i);

                i++;
            }
        }

        return result;
    }
}
