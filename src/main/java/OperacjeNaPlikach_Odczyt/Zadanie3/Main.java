package OperacjeNaPlikach_Odczyt.Zadanie3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\1 Software Developer\\Workspace\\SDA-Homework_2\\Paczka Swiateczna\\output_3.txt");

        countWordsAndLines(file);

    }

    private static void countWordsAndLines(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line;
        int numberOfLines = 0;
        int numberOfWords = 0;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine().trim();
            String[] lines = line.split(" ");
            numberOfWords += lines.length;
            numberOfLines++;
        }

        System.out.println("Number of lines in file " + numberOfLines);
        System.out.println("Number of words in file " + numberOfWords);
     }
}
