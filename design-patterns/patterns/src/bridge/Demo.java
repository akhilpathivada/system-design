/**
 * author: akhilpathivada
 * time: 05/05/24 19:27
 */
package bridge;

public class Demo {

    public static void main(String[] args) {
        Notification notification = new TextMessageNotification(new SMSNotificationSender());
        notification.sendNotification();

        notification = new VoiceMessageNotification(new EmailNotificationSender());
        notification.sendNotification();
    }
}
