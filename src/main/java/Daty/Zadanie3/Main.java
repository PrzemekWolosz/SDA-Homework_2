package Daty.Zadanie3;

import java.time.LocalDate;
import java.time.Period;

/*
Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
Wskazówka: skorzystaj z klasy Period:  Period period = Period.between(data_start, data_stop);
 */
public class Main {
    public static void main(String[] args) {

        printPeriodBetweenDates();

    }

    private static void printPeriodBetweenDates() {
        Period period = Period.between(LocalDate.of(2000, 1, 1), LocalDate.of(2001, 5, 11));
        System.out.println("years: " + period.getYears() + ", months: " + period.getMonths() + ", days: " + period.getDays());
    }
}