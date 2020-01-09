package OperacjeNaPlikach_Odczyt.Zadanie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\1 Software Developer\\Workspace\\SDA-Homework_2\\Paczka Swiateczna\\output_2.txt");
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
        System.out.println(line.trim());

    }
}
