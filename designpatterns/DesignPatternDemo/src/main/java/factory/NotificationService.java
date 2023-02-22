package main.java.factory;

/**
 * Driver Class / Client Program
 * @author MEGHNA
 *
 */
public class NotificationService {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("PHONE");
        notification.notifyUser();

	}

}
