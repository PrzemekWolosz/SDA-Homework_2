package Wyjatki.Zadanie1;

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
        System.out.println(a/b);
        if(b < 0) {
            System.out.println("Number b is negative");
        }
    }
}