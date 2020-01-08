package OperacjeNaPlikach_Zapis.Zadanie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        createFile(enterLine());

    }

    private static String enterLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        return scanner.nextLine();
    }

    private static void createFile(String userLine) throws FileNotFoundException {
        File file = new File("output_2.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.append(userLine);
        printWriter.close();
    }
}
