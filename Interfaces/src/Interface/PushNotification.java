package Interface;

public class PushNotification implements NotificationService {
    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    String deviceId;
     String priority;


    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
        System.out.println("Sending PUSH notification to device: " + deviceId);
        System.out.println("Priority: " + (priority != null ? priority : "No Priority Set"));
    }
    @Override
    public void setDefaultPriority(String priority) {
        this.priority = priority;
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



