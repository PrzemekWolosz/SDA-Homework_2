package Wyjatki.Zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        divide();
    }

    private static void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();

        if (b != 0) {
            System.out.println(a / b);
        } else {
            throw new CholeroExeption("Pamiętaj cholero, by nie dzielić przez zero!");
        }
    }
}

