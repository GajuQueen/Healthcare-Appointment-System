package Interface;

public class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

     class EmailNotification implements NotificationService {
        @Override
        public void sendNotification(String message){
            System.out.println("Sending email Notification: " + message);
        }
    }

     class SMSNotification implements NotificationService {
        @Override
        public void sendNotification(String message){
            System.out.println("Sending sms Notification: " + message);
        }
    }


