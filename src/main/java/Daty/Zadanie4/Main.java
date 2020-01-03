package Daty.Zadanie4;
/*
Pobierz od użytkownika dwie daty. Jedna w formacie: yyyy::MM::dd oraz druga w formacie: MM::yyyy::dd
Wypisz wynik różnicy dat w formacie:
Minęło: X lat, Y miesięcy, Z dni.
Do wypisania dni/lat/miesięcy z Period, wykorzystaj jego gettery  */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printPeriodBetweenDates(getFirstDate(), getSecondDate());

    }

    private static LocalDate getFirstDate() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        System.out.println("Please type the date in format: yyyy::MM::dd");
        String date1 = scanner.nextLine();
        if (!date1.matches("\\d{4}::\\d{2}::\\d{2}")) {
            System.out.println("Wrong date format, please try again: yyyy::MM::dd");
            date1 = scanner.nextLine();
        }
        return LocalDate.parse(date1, formatter);

    }

    private static LocalDate getSecondDate() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM::yyyy::dd");
        System.out.println("Please type the date in format: MM::yyyy::dd");
        String date2 = scanner.nextLine();
        if (!date2.matches("\\d{2}::\\d{4}::\\d{2}")) {
            System.out.println("Wrong date format, please try again: MM::yyyy::dd");
            date2 = scanner.nextLine();
        }
        return LocalDate.parse(date2, formatter);
    }

    private static void printPeriodBetweenDates(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days, have passed.");
    }
}
