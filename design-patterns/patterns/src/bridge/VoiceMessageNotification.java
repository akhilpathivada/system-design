/**
 * author: akhilpathivada
 * time: 05/05/24 19:33
 */
package bridge;

public class VoiceMessageNotification extends Notification {

    public VoiceMessageNotification(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Voice message :: ");
        notificationSender.sendNotification("This is a VOICE");
    }
}
