package org.itmo.lab1.lab3.lab4.lab5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1.");

        String text1 = "Ищу самое длинное слово в этом тексте";

        System.out.println("Текст: " + text1);

        String longest = findLongestWord(text1);

        System.out.println("Самое длинное слово: " + longest + ".");

        System.out.println("Задача 2.");

        String word = scanner.next();

        boolean result = isPalindrom(word);

        System.out.println("Результат: " + result);

        System.out.println("Задача 3.");

        String sentence = "Это слово бяка и еще бяка плохое";

        String censored = isBaka(sentence);

        System.out.println("Текст: " + sentence);

        System.out.println("Результат: " + censored);

        System.out.println("Задача 4.");

        String text2 = "яблоко очень вкусный и полезный фрукт, одно яблоко способно утолить голод ";

        String substring = "яблоко";

        int count = subString(text2, substring);

        System.out.println("Текст: " + text2);

        System.out.println("Подстрока: " + substring);

        System.out.println("Результат: количество вхождений слова " + substring + " - " + count);

        System.out.println("Задача 5.");

        String text = "This is a test string";

        System.out.println("Исходная строка: " + text);

        System.out.println("Результат: слова в обратном порядке - " + reverseWords(text));

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

    public static String isBaka(String text) {

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

    public static int subString(String text, String substring) {

        int count = 0;

        for (int i = 0; i <= text.length() - substring.length(); i++) {

            boolean match = true;


            for (int j = 0; j < substring.length(); j++) {

                if (text.charAt(i + j) != substring.charAt(j)) {

                    match = false;

                    break;
                }
            }

            if (match) {

                count++;
            }
        }

        return count;
    }

    public static String reverseWords(String text) {

        String result = "";

        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);


            if (currentChar != ' ') {

                currentWord = currentChar + currentWord;
            }

            if (currentChar == ' ' || i == text.length() - 1) {

                result += currentWord;

                currentWord = "";


                if (currentChar == ' ' && i != text.length() - 1) {

                    result += " ";
                }
            }
        }

        return result;
    }
}
