package Interface;

public class Main {
    public static void main(String[] args) {
       NotificationService notification = new PushNotification();
       notification.sendNotification("Hello World");

       NotificationService email = new EmailNotification();
       email.sendNotification("Hello World");

       NotificationService sms = new SMSNotification();
       sms.sendNotification("Hello World");


    }
}