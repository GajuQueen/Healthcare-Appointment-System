package Interface;

public class Main {
    public static void main(String[] args) {
       NotificationService notification = new PushNotification("yoo");
       notification.sendNotification("Hello World");

       NotificationService email = new EmailNotification();
       email.sendNotification("gajuq@gmail.com");

       NotificationService sms = new SMSNotification();
       sms.sendNotification("Hello you");

        PushNotification push = new PushNotification("Device12345");
        push.setDefaultPriority("High");
        push.sendNotification("You have a new message!");
    }
}