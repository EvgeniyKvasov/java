package org.itmo.lab9;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //case1

        System.out.println("Задача 1.");

        try {

            String[] lines = readFile("input.txt");

            if (lines != null) {

                System.out.println("Содержимое файла:");

                for (int i = 0; i < lines.length; i++) {

                    System.out.println((i + 1) + ": " + lines[i]);
                }

                System.out.println("Всего строк: " + lines.length);
            }

        } catch (IOException io) {

            System.out.println("Файл input.txt не найден" + io.getMessage());
        }


        //case2

        System.out.println("Задача 2.");

        String text = "Hello World!";

        try {
            writeToFile("output.txt", text);

            System.out.println("Строка " + text + " успешно записана в файл!");

        } catch (IOException io) {

            System.out.println("Файл output.txt не найден" + io.getMessage());
        }


        //case3

        System.out.println("Задача 3.");

        try {
            mergeFiles("input.txt", "output.txt", "new.txt");

            System.out.println("Файлы input.txt и output.txt успешно склеены в new.txt");

        } catch (IOException io) {

            System.out.println("Файлы input.txt и output.txt не найдены" + io.getMessage());
        }

        //case4

        System.out.println("Задача 4.");

        try {

            System.out.println("Исходное содержимое:");

            String[] original = readFile("change_1.txt");

            for (String line : original) {

                System.out.println(line);
            }


            replaceNonAlphanumeric("change_1.txt", "change_2.txt");

            System.out.println("Результат после замены:");

            String[] result = readFile("change_2.txt");

            for (String line : result) {

                System.out.println(line);
            }

        } catch (IOException io) {

            System.out.println("Файлы не найдены!" + io.getMessage());
        }
    }

    //case1

    public static String[] readFile(String filename) throws IOException {

        String[] tempArray = new String[100];

        int count = 0;

        FileReader fr = null;

        BufferedReader br = null;

        try {

            fr = new FileReader(filename);

            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                if (count >= tempArray.length) {

                    String[] newArray = new String[tempArray.length * 2];

                    for (int i = 0; i < tempArray.length; i++) {

                        newArray[i] = tempArray[i];
                    }

                    tempArray = newArray;
                }

                tempArray[count] = line;

                count++;
            }


            String[] result = new String[count];

            for (int i = 0; i < count; i++) {

                result[i] = tempArray[i];
            }

            return result;

        } finally {

            if (br != null) {

                br.close();
            }

            if (fr != null) {

                fr.close();
            }
        }
    }

    //case2

    public static void writeToFile(String filename, String content) throws IOException {

        FileWriter fw = null;

        try {

            fw = new FileWriter(filename);

            fw.write(content);

        } finally {

            if (fw != null) {

                fw.close();
            }
        }
    }

    //case3

    public static void mergeFiles(String file1, String file2, String outputFile) throws IOException {

        String[] lines1 = readFile(file1);

        if (lines1 == null) {

            lines1 = new String[0];
        }

        String[] lines2 = readFile(file2);

        if (lines2 == null) {

            lines2 = new String[0];
        }

        StringBuilder mergedContent = new StringBuilder();

        for (int i = 0; i < lines1.length; i++) {

            mergedContent.append(lines1[i]);

            if (i < lines1.length - 1) {

                mergedContent.append("\n");
            }
        }

        for (int i = 0; i < lines2.length; i++) {

            mergedContent.append(lines2[i]);

            if (i < lines2.length - 1) {

                mergedContent.append("\n");
            }
        }

        writeToFile(outputFile, mergedContent.toString());
    }

    //case4


    public static void replaceNonAlphanumeric(String inputFile, String outputFile) throws IOException {

        FileReader fr = null;

        BufferedReader br = null;

        FileWriter fw = null;

        try {
            fr = new FileReader(inputFile);

            br = new BufferedReader(fr);

            fw = new FileWriter(outputFile);

            String line;

            while ((line = br.readLine()) != null) {

                String result = "";

                for (int i = 0; i < line.length(); i++) {

                    char c = line.charAt(i);


                    if (Character.isLetterOrDigit(c)) {
                        result += c;
                    } else {
                        result += '$';
                    }
                }

                fw.write(result);

                fw.write("\n");
            }

        } finally {

            try {

                if (fw != null) fw.close();

                if (br != null) br.close();

                if (fr != null) fr.close();

            } catch (IOException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}