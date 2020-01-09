package OperacjeNaPlikach_Odczyt.Zadanie4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\1 Software Developer\\Workspace\\SDA-Homework_2\\Paczka Swiateczna\\output_form.txt");
        printFormFromFile(file);

    }

    private static void printFormFromFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
