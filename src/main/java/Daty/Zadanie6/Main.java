package Daty.Zadanie6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        approximateDateOfDeath(getDateOfBirth());
        Date end = new Date();
        int wastedTime = (int) ((end.getTime() - start.getTime()) / 1000);
        System.out.println("You have wasted " + wastedTime + " seconds of Your life for checking your date of death :)");
    }

    private static void approximateDateOfDeath(LocalDate dateOfBirth) {
        LocalDate dateOfDeath = dateOfBirth.plusYears(100);
        LocalDate dateOfDeathAfterFirstAnswer = genderCheck(dateOfDeath);
        LocalDate dateOfDeathAfterSecondAnswer = smokerCheck(dateOfDeathAfterFirstAnswer);
        LocalDate dateOfDeathAfterThirdAnswer = stressFulLifeCheck(dateOfDeathAfterSecondAnswer, dateOfBirth);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        System.out.println("Your approximate date of death is: " + dateOfDeathAfterThirdAnswer.format(formatter));
    }

    private static LocalDate getDateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter your date of birth in format: dd-MM-yyyy");
        String userDate = scanner.nextLine();
        while (!userDate.matches("\\d{2}-\\d{2}-\\d{4}")) {
            System.out.println("Wrong date format, please try again: dd-MM-yyyy");
            userDate = scanner.nextLine();
        }
        return LocalDate.parse(userDate, formatter);
    }

    private static LocalDate genderCheck(LocalDate dateOfDeath) {
        Scanner scanner = new Scanner(System.in);
        String gender;
        do {
            System.out.println("Are you female or male?");
            gender = scanner.nextLine().toLowerCase().trim();
        } while (!gender.matches("male|female"));
        if (gender.equals("male")) {
            return dateOfDeath.minusYears(10);
        } else {
            return dateOfDeath;
        }
    }

    private static LocalDate smokerCheck(LocalDate dateOfDeath) {
        Scanner scanner = new Scanner(System.in);
        String smoker;
        do {
            System.out.println("Do You smoke? Type yes or no");
            smoker = scanner.nextLine().toLowerCase().trim();
        } while (!smoker.matches("yes|no"));
        if (smoker.equals("yes")) {
            return dateOfDeath.minusYears(9).minusMonths(3);
        } else {
            return dateOfDeath;
        }
    }

    private static LocalDate stressFulLifeCheck(LocalDate dateOfDeath, LocalDate dateOfBirth) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        String stress;
        do {
            System.out.println("Do you have a stressful life?");
            stress = scanner.nextLine().toLowerCase().trim();
        } while (!stress.matches("yes|no"));
        if (stress.equals("yes")) {
            if (randomNumber < 10) {
                return dateOfBirth.plusYears(60);
            } else {
                return dateOfDeath;
            }
        } else {
            return dateOfDeath;
        }
    }
}
