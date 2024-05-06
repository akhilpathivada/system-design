/**
 * author: akhilpathivada
 * time: 05/05/24 19:34
 */
package bridge;

public class SMSNotificationSender implements NotificationSender {

    @Override
    public void sendNotification(String message) {
        System.out.println("sending sms : " + message);
    }
}
