package Daty.Zadanie1;
/*      Stwórz aplikację która w pętli przyjmuje polecenie:
        - wpisanie ‘date’ wypisuje obecny LocalDate
        - wpisanie ‘time’ wypisuje obecny LocalTime
        - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
        (W wybranym przez Ciebie formacie)
        Jeśli użytkownik wpisze 'quit' to zakoncz program.
*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printTimeOtDate();

    }

    private static void printTimeOtDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your command [date, time, datetime, quit].");
        String command;
        do {
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("date")) {
                System.out.println(LocalDate.now());
            } else if (command.equalsIgnoreCase("time")) {
                System.out.println(LocalTime.now());
            } else if (command.equalsIgnoreCase("datetime")) {
                System.out.println(LocalDateTime.now());
            } else {
                if (!command.equalsIgnoreCase("quit")) {
                    System.out.println("wrong command, try again");
                }
            }
        } while (!command.equalsIgnoreCase("quit"));
    }
}