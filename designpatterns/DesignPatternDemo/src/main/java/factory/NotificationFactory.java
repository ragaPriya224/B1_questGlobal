package main.java.factory;

/**
 * Factory Class
 * @author MEGHNA
 *
 */
public class NotificationFactory {
	
	/**
	 * Factory Method
	 * @param notificationType
	 * @return
	 */
	public Notification createNotification(String notificationType)
    {
        if (notificationType == null || notificationType.isEmpty())
            return null;
        switch (notificationType) {
        case "SMS":
            return new SMSNotification();
        case "EMAIL":
            return new EmailNotification();
        case "PUSH":
            return new PushNotification();
        default:
            throw new IllegalArgumentException("Unknown Notification Type "+notificationType);
        }
    }
}
