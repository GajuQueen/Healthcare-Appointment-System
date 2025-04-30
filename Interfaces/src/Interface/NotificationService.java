package Interface;

public interface NotificationService {
    void sendNotification(String message);
    default void setDefaultPriority(String priority) {

    }
}
