package OperacjeNaPlikach_Zapis.Zadanie3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        createFile();

    }

    private static void createFile() throws FileNotFoundException {
        File file = new File("output_3.txt");
        PrintWriter printWriter = new PrintWriter(file);

        Scanner scanner = new Scanner(System.in);
        String userLine = "";

        while (!userLine.trim().equalsIgnoreCase("quit")) {
            System.out.println("Enter your text");
            userLine = scanner.nextLine();
            if (!userLine.trim().equalsIgnoreCase("quit")) {
                printWriter.append(userLine);
                printWriter.append("\n");
            }
        }

        printWriter.close();

    }
}