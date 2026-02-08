package org.itmo.lab9;

import java.io.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //case1

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            String line;

            List<String> lines = new ArrayList<>();

            while ((line = reader.readLine()) != null) {

                lines.add(line);
            }

            System.out.println("Содержимое файла input.txt:");

            for (String contentLine : lines) {

                System.out.println(contentLine);
            }

            System.out.println("Всего строк: " + lines.size());

        } catch (IOException e) {

            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        //case2

        String text = "Hello World!";

        try {

            writeToFile("output.txt", text);

            System.out.println("Строка " + text + " успешно записана в файл!");

        } catch (IOException e) {

            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    //case2

    public static void writeToFile(String filename, String content) throws IOException {

        try (FileWriter writer = new FileWriter(filename)) {

            writer.write(content);
        }
    }
}