/**
 * author: akhilpathivada
 * time: 06/05/24 09:16
 */
package notification;

public interface Notification {

    NotificationStatus sendNotification(MessageAttribute messageAttribute);
}
