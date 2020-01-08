package OperacjeNaPlikach_Zapis.Zadanie4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("output_4.txt");
        createFile(enterLine(), file);

        System.out.println("Does exists? " + file.exists());
        System.out.println("Is directory? " + file.isDirectory());
        System.out.println("Is file? " + file.isFile());
        System.out.println("Total space: " + file.getTotalSpace());
        System.out.println("Last modified" + file.lastModified());
        System.out.println("Can read? " + file.canRead());
        System.out.println("Can write? " + file.canWrite());

    }

    private static String enterLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        return scanner.nextLine();
    }

    private static void createFile(String userLine, File file) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.append(userLine);
        printWriter.close();
    }
}