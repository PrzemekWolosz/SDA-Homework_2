package OperacjeNaPlikach_Zapis.Zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        writeToFile();
    }

    private static void writeToFile() throws FileNotFoundException {
        File file = new File("output_1.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.append("Hello World!");
        printWriter.close();
    }
}
