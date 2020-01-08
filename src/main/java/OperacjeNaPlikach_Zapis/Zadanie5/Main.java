package OperacjeNaPlikach_Zapis.Zadanie5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Form form1 = askQuestions();
        saveToFile(form1);

    }

    private static Form askQuestions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age");
        int age = scanner.nextInt();
        System.out.println("High");
        int high = scanner.nextInt();
        System.out.println("Sex");
        String empty = scanner.nextLine();
        String sex = scanner.nextLine();
        System.out.println("Earnings");
        int earnings = scanner.nextInt();
        System.out.println("Occupation");
        empty = scanner.nextLine();
        String occupation = scanner.nextLine();
        System.out.println("Citizenship");
        String citizenship = scanner.nextLine();
        return new Form(age, high, sex, earnings, occupation, citizenship);
    }

    private static void saveToFile(Form form) throws FileNotFoundException {
        File file = new File("output_form.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.append("Age: ").append(String.valueOf(form.getAge()));
        writer.append("\n");
        writer.append("High: ").append(String.valueOf(form.getHigh()));
        writer.append("\n");
        writer.append("Sex ").append(form.getSex());
        writer.append("\n");
        writer.append("Earnings ").append(String.valueOf(form.getEarnings()));
        writer.append("\n");
        writer.append("Occupation ").append(form.getOccupation());
        writer.append("\n");
        writer.append("Citizenship ").append(form.getCitizenship());
        writer.close();
    }
}
