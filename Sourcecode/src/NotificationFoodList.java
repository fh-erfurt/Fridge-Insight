import java.util.LinkedList;

/**
 * the class NotificationFoodList is used to create a new list for the notifications</br>
 * in which each list will contain multiple notifications</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see NotificationFood
 */
public class NotificationFoodList {
    private LinkedList<NotificationFood> Notifications; // the linked list will hold all the created notifications for food

    /**
     * the constructor for the class NotificationFoodList, where a new list will be initialised
     */
    public NotificationFoodList() {
        this.Notifications = new LinkedList<>();
    }

    /**
     * get the list containing all the notifications
     *
     * @return list of type NotificationFood
     */
    public LinkedList<NotificationFood> getNotifications() {
        return Notifications;
    }

    /**
     * set a certain list of notifications with notifications
     *
     * @param notifications
     */
    public void setNotifications(LinkedList<NotificationFood> notifications) {
        this.Notifications = notifications;
    }

    /**
     * add a certain notification to an already existing list
     *
     * @param notificationFood the received notification
     */
    void addNotificationToList(NotificationFood notificationFood) {
        this.Notifications.addLast(notificationFood);
    }

    /**
     * remove a certain notification
     *
     * @param notificationFood the notification to be deleted
     */
    void deleteNotificationFromList(NotificationFood notificationFood) {
        if (getNotificationFromList(notificationFood) != null) {
            this.Notifications.remove(notificationFood);
        }
    }

    /**
     * update an already existing notification
     *
     * @param notificationFood    the notification to be updated
     * @param newDateOfExpiration the new date of the purchase
     * @param newMinimumQuantity  the new minimum quantity
     * @param newSelectedFood     the new selected food
     */
    public void updateNotificationInList(NotificationFood notificationFood, String newDateOfExpiration, int newMinimumQuantity, Food newSelectedFood) {
        if (getNotificationFromList(notificationFood) != null) {
            if (notificationFood.getMinimumQuantity() != newMinimumQuantity) {
                notificationFood.setMinimumQuantity(newMinimumQuantity);
            }
            if (!notificationFood.getDateOfExpiration().equals(newDateOfExpiration)) {
                notificationFood.setDateOfExpiration(newDateOfExpiration);
            }
            if (notificationFood.getSelectedFood() != newSelectedFood) {
                notificationFood.setSelectedFood(newSelectedFood);
            }
        }
    }

    /**
     * extract a certain notification from the list
     *
     * @param notificationFood the notification to be extracted.
     * @return the extracted notification, in case the notification is not found null will be returned.
     */
    public NotificationFood getNotificationFromList(NotificationFood notificationFood) {
        NotificationFood reference = notificationFood;
        if (this.Notifications.size() > 0) {
            for (NotificationFood notification : this.Notifications) {
                if (reference == notification) {
                    break;
                } else {
                    reference = null;
                }
            }
        } else {
            reference = null;
        }

        return reference;
    }

}
