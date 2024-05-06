/**
 * author: akhilpathivada
 * time: 05/05/24 19:35
 */
package bridge;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void sendNotification(String message) {
        System.out.println("sending email : " + message);
    }
}
