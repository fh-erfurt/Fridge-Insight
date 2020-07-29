/**
 * the class NotificationFood is used to create a new notification for a certain food</br>
 * in which the class Food is called to associate each notification with a certain food</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Food
 */

package FridgeInsight.FridgeInsight;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="NOTIFICATIONFOOD")
public class NotificationFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NOTIFOODID;

    @Column(name = "minimumQuantity")
    private int minimumQuantity; // this variable designate the minimum quantity allowed

    @Column(name="dateOfExpiration")
    private Date dateOfExpiration; // this variable designate the date when the purchase should be made.


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="FOOD_ID", nullable = false)
    @JsonBackReference
    private Food food; // this variable designate the selected food

    /**
     * the constructor of the class NotificationFood, where all the variables are set to null.</br>
     */
    public NotificationFood() {
    }

    /**
     * the overloaded constructor of the class NotificationFood, where each variabel is set to a certain value</br>
     *
     * @param minimumQuantity  the minimum quantity allowed
     * @param dateOfExpiration the date when the purchase should be made.
     */
    public NotificationFood(int minimumQuantity, Date dateOfExpiration) {
        this.minimumQuantity = minimumQuantity;
        this.dateOfExpiration = dateOfExpiration;
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
     * get the date of the purchase value
     *
     * @return the value of the date  of the purchase
     */
    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }

    /**
     * set the date of the purchase to a certain value
     *
     * @param dateOfExpiration the received value of the date of the purchase
     */
    public void setDateOfExpiration(Date dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public Food getFood() {
        return food;
    }

    public Long getNOTIFOODID() {
        return NOTIFOODID;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setNOTIFOODID(Long NOTIFOODID) {
        this.NOTIFOODID = NOTIFOODID;
    }
}


