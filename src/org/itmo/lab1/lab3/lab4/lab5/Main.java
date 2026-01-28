package org.itmo.lab1.lab3.lab4.lab5;

public class Main {

    public static void main(String[] args){

        System.out.println("Задача 1.");

        System.out.println("Ищу самое длинное слово в этом тексте.");

        String text = "Ищу самое длинное слово в этом тексте";

        String longest = findLongestWord(text);

        System.out.println("Самое длинное слово: " + longest + ".");
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
}
