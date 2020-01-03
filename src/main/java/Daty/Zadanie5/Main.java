package Daty.Zadanie5;
/*
Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
Masz X lat, Y miesięcy, Z dni. (użyj Period)
Masz XYZ sekund. (użyj Duration) */

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        countAge(getDateOfBirth());

    }

    private static LocalDate getDateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter your date of birth in format: dd-MM-yyyy");
        String userDate = scanner.nextLine();
        if (!userDate.matches("\\d{2}-\\d{2}-\\d{4}")) {
            System.out.println("Wrong date format, please try again: dd-MM-yyyy");
            userDate = scanner.nextLine();
        }
        return LocalDate.parse(userDate, formatter);
    }

    private static void countAge(LocalDate dateOfBirth) {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months, "
                + period.getDays() + " days old.");

        Duration duration = Duration.between(dateOfBirth.atStartOfDay(), LocalDate.now().atStartOfDay());
        System.out.println("You are " + duration.getSeconds() + " seconds old.");
    }
}