package org.itmo.lab9;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //case1

        System.out.println("Задача 1.");

        String[] lines = readFile("input.txt");

        if (lines != null) {

            System.out.println("Содержимое файла:");

            for (int i = 0; i < lines.length; i++) {

                System.out.println((i + 1) + ": " + lines[i]);
            }

            System.out.println("Всего строк: " + lines.length);
        }

        //case2

        System.out.println("Задача 2.");

        String text = "Hello World!";

        writeToFile("output.txt", text);

        System.out.println("Строка " + text + " успешно записана в файл!");

        //case3

        System.out.println("Задача 3.");

        mergeFiles("input.txt", "output.txt", "new.txt");

        System.out.println("Файлы input.txt и output.txt успешно склеены в new.txt");

        //case4

        System.out.println("Задача 4.");

        System.out.println("Исходное содержимое:");

        String[] original = readFile("change_1.txt");

        if (original != null) {

            for (String line : original) {

                System.out.println(line);
            }
        }

        replaceNonAlphanumeric("change_1.txt", "change_2.txt");

        System.out.println("Результат после замены:");

        String[] result = readFile("change_2.txt");

        if (result != null) {

            for (String line : result) {

                System.out.println(line);
            }
        }
    }

    //case1

    public static String[] readFile(String filename) {

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

        } catch (IOException e) {

            System.out.println("Файл " + filename + " не найден: " + e.getMessage());

            return null;

        } finally {

            try {

                if (br != null) {

                    br.close();
                }

                if (fr != null) {

                    fr.close();
                }

            } catch (IOException e) {

                System.out.println("Ошибка при закрытии файла " + filename + ": " + e.getMessage());
            }
        }
    }

    //case2

    public static void writeToFile(String filename, String content) {

        FileWriter fw = null;

        try {

            fw = new FileWriter(filename);

            fw.write(content);

        } catch (IOException e) {

            System.out.println("Ошибка при записи в файл " + filename + ": " + e.getMessage());

        } finally {

            try {

                if (fw != null) {

                    fw.close();
                }

            } catch (IOException e) {

                System.out.println("Ошибка при закрытии файла " + filename + ": " + e.getMessage());
            }
        }
    }

    //case3
    public static void mergeFiles(String file1, String file2, String outputFile) {

        try {

            String[] lines1 = readFile(file1);

            String[] lines2 = readFile(file2);

            if (lines1 == null) {

                lines1 = new String[0];
            }

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

            if (lines1.length > 0 && lines2.length > 0) {

                mergedContent.append("\n");
            }

            for (int i = 0; i < lines2.length; i++) {

                mergedContent.append(lines2[i]);

                if (i < lines2.length - 1) {

                    mergedContent.append("\n");
                }
            }

            writeToFile(outputFile, mergedContent.toString());

        } catch (Exception e) {

            System.out.println("Ошибка при склеивании файлов: " + e.getMessage());
        }
    }

    //case4

    public static void replaceNonAlphanumeric(String inputFile, String outputFile) {

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

        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());

        } finally {

            try {

                if (fw != null) fw.close();

                if (br != null) br.close();

                if (fr != null) fr.close();

            } catch (IOException e) {

                System.out.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
}