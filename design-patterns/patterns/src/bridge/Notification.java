/**
 * author: akhilpathivada
 * time: 05/05/24 19:29
 */
package bridge;

public abstract class Notification {

    NotificationSender notificationSender;

    public Notification(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    abstract void sendNotification();
}
