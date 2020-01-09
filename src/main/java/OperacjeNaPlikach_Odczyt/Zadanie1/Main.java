package OperacjeNaPlikach_Odczyt.Zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\1 Software Developer\\Workspace\\SDA-Homework_2\\Paczka Swiateczna\\output_1.txt");
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        if (!line.equalsIgnoreCase("Hello World!")) {
            System.out.println("File does not contain expected content");
        } else {
            System.out.println("File exist and contain expected content");
        }

    }
}
