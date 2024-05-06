/**
 * author: akhilpathivada
 * time: 05/05/24 19:31
 */
package bridge;

public class TextMessageNotification extends Notification {

    public TextMessageNotification(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Text message :: ");
        notificationSender.sendNotification("This is a TEXT");
    }
}
