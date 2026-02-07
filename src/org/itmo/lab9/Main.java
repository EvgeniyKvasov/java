package org.itmo.lab9;

import java.io.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

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
    }
}