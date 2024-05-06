/**
 * author: akhilpathivada
 * time: 06/05/24 09:15
 */
package service;


import notification.*;

public class NotificationService {

    // NotificationDomain: contains details about type, user details, target details and more ...
    public boolean sendNotification(NotificationDomain notificationDomain) {

        Notification notification;
        MessageAttribute messageAttribute;

        switch (notificationDomain.getNotificationType()) {

            case NotificationType.EMAIL:
                notification = new EmailNotification(new Message("...."));
                // some details
                messageAttribute = new MessageAttribute("", 123);
                break;
            case NotificationType.SMS:
                notification = new SMSNotification(new Message("...."));
        }
        notification.sendNotification(messageAttribute);
    }
}
