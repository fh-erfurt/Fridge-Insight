package Food;

import Food.Food;

/**
 * the class Food.NotificationFood is used to create a new notification for a certain food</br>
 * in which the class Food.Food is called to associate each notification with a certain food</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Food
 */
public class NotificationFood {
    private int minimumQuantity; // this variable designate the minimum quantity allowed
    private Food selectedFood; // this variable designate the selected food
    private String dateOfExpiration; // this variable designate the date when the purchase should be made.

    /**
     * the constructor of the class Food.NotificationFood, where all the variables are set to null.</br>
     */
    public NotificationFood() {
        this.selectedFood = new Food();
        this.minimumQuantity = 0;
        this.dateOfExpiration = null;
    }

    /**
     * the overloaded constructor of the class Food.NotificationFood, where each variabel is set to a certain value</br>
     *
     * @param minimumQuantity  the minimum quantity allowed
     * @param selectedFood     the selected food
     * @param dateOfExpiration the date when the purchase should be made.
     */
    public NotificationFood(int minimumQuantity, Food selectedFood, String dateOfExpiration) {
        this.minimumQuantity = minimumQuantity;
        this.selectedFood = selectedFood;
        this.dateOfExpiration = dateOfExpiration;
    }

    /**
     * get the selected food value
     *
     * @return the value of the selected food
     */
    public Food getSelectedFood() {
        return selectedFood;
    }

    /**
     * get the minimum'Quantity value
     *
     * @return the value of the minimum quantity
     */
    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * set the minimum quantity of the food to certain value
     *
     * @param minimumQuantity the received value of the minimun quantity
     */
    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    /**
     * set the selected food to a certain value
     *
     * @param selectedFood the received value of the selected food
     */
    public void setSelectedFood(Food selectedFood) {
        this.selectedFood = selectedFood;
    }

    /**
     * get the date of the purchase value
     *
     * @return the value of the date  of the purchase
     */
    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    /**
     * set the date of the purchase to a certain value
     *
     * @param dateOfExpiration the received value of the date of the purchase
     */
    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }
}


