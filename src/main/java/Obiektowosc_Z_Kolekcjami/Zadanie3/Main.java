package Obiektowosc_Z_Kolekcjami.Zadanie3;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, Notification> notificationMap = new HashMap<>();
        DispatchRoom dispatchRoom = new DispatchRoom(notificationMap);

        dispatchRoom.addNotification("Car accident on highway", NotificationType.ACCIDENT, LocalDateTime.of(2020, 1, 7, 13, 30));
        dispatchRoom.addNotification("Fire in the school", NotificationType.FIRE_BRIGADE, LocalDateTime.of(2020, 1, 7, 14, 1));
        dispatchRoom.addNotification("Bank robbery", NotificationType.POLICE, LocalDateTime.of(2020, 1, 7, 13, 15));
        dispatchRoom.addNotification("Broken arm on after bike fall", NotificationType.AMBULANCE, LocalDateTime.of(2020, 1, 7, 14, 8));
        dispatchRoom.addNotification("Act of vandalism", NotificationType.OTHER_NOTIFICATION, LocalDateTime.of(2020, 1, 7, 14, 11));

        commandLineSupport(dispatchRoom);

    }

    private static void commandLineSupport(DispatchRoom dispatchRoom) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number of command: \n1 - Add notification \n2 - Print 3 most recent notifications \n3 - Print current type notifications");
        String userCommand;
        do {
            userCommand = scanner.nextLine().trim();
        } while (!userCommand.equals("1") && !userCommand.equals("2") && !userCommand.equals("3"));
        if (userCommand.equals("1")) {
            System.out.println("Enter notifications content:");
            String content = scanner.nextLine();
            System.out.println("Enter number of notification type:\n1 - AMBULANCE \n2 - POLICE \n3 - FIRE_BRIGADE \n4 - ACCIDENT \n5 - OTHER_NOTIFICATION");
            String userType;
            do {
                userType = scanner.nextLine().trim();
            } while (!userType.equals("1") && !userType.equals("2") && !userType.equals("3") && !userType.equals("4") && !userType.equals("5"));
            NotificationType userNoteType;
            switch (userType) {
                case "1":
                    userNoteType = NotificationType.AMBULANCE;
                    break;
                case "2":
                    userNoteType = NotificationType.POLICE;
                    break;
                case "3":
                    userNoteType = NotificationType.FIRE_BRIGADE;
                    break;
                case "4":
                    userNoteType = NotificationType.ACCIDENT;
                    break;
                default:
                    userNoteType = NotificationType.OTHER_NOTIFICATION;
                    break;
            }
            dispatchRoom.addNotification(content, userNoteType, LocalDateTime.now());
        } else if (userCommand.equals("2")) {
            System.out.println(dispatchRoom.mostRecentNotifications(3));
        } else {
            System.out.println("Enter number of notification type:\n1 - AMBULANCE \n2 - POLICE \n3 - FIRE_BRIGADE \n4 - ACCIDENT \n5 - OTHER_NOTIFICATION");
            String userType;
            do {
                userType = scanner.nextLine().trim();
            } while (!userType.equals("1") && !userType.equals("2") && !userType.equals("3") && !userType.equals("4") && !userType.equals("5"));
            NotificationType userNoteType;
            switch (userType) {
                case "1":
                    userNoteType = NotificationType.AMBULANCE;
                    break;
                case "2":
                    userNoteType = NotificationType.POLICE;
                    break;
                case "3":
                    userNoteType = NotificationType.FIRE_BRIGADE;
                    break;
                case "4":
                    userNoteType = NotificationType.ACCIDENT;
                    break;
                default:
                    userNoteType = NotificationType.OTHER_NOTIFICATION;
                    break;
            }
            System.out.println(dispatchRoom.oneTypeNotifications(userNoteType));
        }
    }
}