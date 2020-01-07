package Obiektowosc_Z_Kolekcjami.Zadanie3;

import java.time.LocalDateTime;

public class Notification {

    private NotificationType notificationType;
    private String notificationContent;
    private LocalDateTime notificationTime;

    public Notification(NotificationType notificationType, String notificationContent, LocalDateTime notificationTime) {
        this.notificationType = notificationType;
        this.notificationContent = notificationContent;
        this.notificationTime = notificationTime;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public LocalDateTime getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public void setNotificationTime(LocalDateTime notificationTime) {
        this.notificationTime = notificationTime;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationType=" + notificationType +
                ", notificationContent='" + notificationContent + '\'' +
                ", notificationTime=" + notificationTime +
                "}\n";
    }
}
