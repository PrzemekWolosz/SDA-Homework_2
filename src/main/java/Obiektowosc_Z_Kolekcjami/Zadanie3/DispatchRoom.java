package Obiektowosc_Z_Kolekcjami.Zadanie3;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DispatchRoom {

    Map<String, Notification> notificationMap = new HashMap<>();

    public DispatchRoom(Map<String, Notification> notificationMap) {
        this.notificationMap = notificationMap;
    }

    public void addNotification(String content, NotificationType type, LocalDateTime time) {
        Notification notification = new Notification(type, content, time);
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        notificationMap.put(uuidString, notification);
    }

    public List<Notification> mostRecentNotifications(int number) {
        List<Notification> mostRecentNotifications = new ArrayList<>(notificationMap.values());
        mostRecentNotifications.sort(new Comparator<Notification>() {
            @Override
            public int compare(Notification notification, Notification t1) {
                return notification.getNotificationTime().compareTo(t1.getNotificationTime());
            }
        });
        do {
            mostRecentNotifications.remove(mostRecentNotifications.size() - 1);
        } while (mostRecentNotifications.size() > number);
        return mostRecentNotifications;
    }

    public List<Notification> oneTypeNotifications(NotificationType notificationType) {

        List<Notification> notifications = new ArrayList<>(notificationMap.values());

        return notifications.stream()
                .filter((n) -> n.getNotificationType().equals(notificationType))
                .collect(Collectors.toList());
    }


    @Override
    public String toString() {
        return "DispatchRoom{" +
                "notificationMap=\n" + notificationMap +
                '}';
    }
}
