package Daty.Zadanie2;
/*	Napisz aplikację, która wyświetli datę (wpisaną ze scannera) sprzed 10 dni
    i datę za dziesięć dni. Wskazówka: skorzystaj z metody plusDays() na obiekcie LocalDate. */

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printDate();
    }

    private static void printDate() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type date in format: yyyy-MM-dd");
        String userDate = scanner.nextLine();
        if (!userDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("Wrong format, please try again: yyyy-MM-dd");
            userDate = scanner.nextLine();
        }

        LocalDate localDate = LocalDate.parse(userDate);

        System.out.println("Date " + localDate + " plus 10 days: " + localDate.plusDays(10));
        System.out.println("Date " + localDate + " minus 10 days: " + localDate.minusDays(10));

    }
}