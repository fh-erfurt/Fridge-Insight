/**
 * the class Food is used to create an item of food</br>
 * in which the class Supermarket is called to associate each food with a certain supermarket</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see SuperMarket
 */
package FridgeInsight.FridgeInsight;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long FOODID;

    @Column
    private String foodTitle; // this variable designate the name of the food

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date expireDate; // this variable designate the expiration date of the food

    @Column
    private String foodType; // this variable designate the type of the food

    @Column
    private int foodQuantity; // this variable designate the quantity of the food

    @Column
    private String foodUnit; // this variable designate the Unity of the food

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE, optional = false)
    @JoinColumn (name="SuperMarket_ID", nullable = false)
    @JsonBackReference
    private SuperMarket supermarket;

    @OneToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL, mappedBy = "food")
    @JsonManagedReference
    private NotificationFood notificationFood;

    @ManyToMany(mappedBy = "foods")
    @JsonManagedReference
    private List<PurchaseList> purchaseLists = new ArrayList<PurchaseList>();

    /**
     * the constructor of the class Food, where all the varibales are set to null.
     */
    public Food() {

    }

    /**
     * the overloaded constructor of the class Food, where each variable is set to a certain value.
     *
     * @param foodTitle    the name of the food
     * @param expireDate   the expiration date of the food
     * @param foodType     the type of the food
     * @param foodQuantity the quantity of the food
     */
    public Food(String foodTitle, Date expireDate, String foodType, int foodQuantity) {
        this.expireDate = expireDate;
        this.foodQuantity = foodQuantity;
        this.foodTitle = foodTitle;
        this.foodType = foodType;
    }

    /**
     * get the Food'name value
     *
     * @return the value of the name of the food
     */
    public String getFoodTitle() {
        return foodTitle;
    }

    /**
     * get the food'type value
     *
     * @return the value of the type of the food
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * get the food'expiration date value
     *
     * @return the value of the expiration date
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * get the food'quantity value
     *
     * @return the value of the quantity of the food
     */
    public int getFoodQuantity() {
        return foodQuantity;
    }

    /**
     * get the food'supermarket
     *
     * @return the value of the supermarket where the food is being sold
     */

    /**
     * set the Expiration date to a certain value
     *
     * @param expireDate the received value of the expiration date
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * set the supermarket to a certain value
     *
     * @param foodMarket the received value of the supermarket where the food is being sold
     */
    /**
     * set the food'quantity to certain value
     *
     * @param foodQuantity the received value of the quantity of the food
     */
    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    /**
     * set the food'name to certain value
     *
     * @param foodTitle the receiced value of the name of the food
     */
    public void setFoodTitle(String foodTitle) {
        this.foodTitle = foodTitle;
    }

    /**
     * set the food'type to a certain value
     *
     * @param foodType the received value of the type of the food
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Long getFOODID() {
        return FOODID;
    }

    public NotificationFood getNotificationFood() {
        return notificationFood;
    }

    public void setFOODID(Long FOODID) {
        this.FOODID = FOODID;
    }

    public void setNotificationFood(NotificationFood notificationFood) {
        this.notificationFood = notificationFood;
    }

    public SuperMarket getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(SuperMarket supermarket) {
        this.supermarket = supermarket;
    }

    public List<PurchaseList> getPurchaseLists() {
        return purchaseLists;
    }

    public void setPurchaseLists(List<PurchaseList> purchaseLists) {
        this.purchaseLists = purchaseLists;
    }

    public String getFoodUnit() {
        return foodUnit;
    }

    public void setFoodUnit(String foodUnit) {
        this.foodUnit = foodUnit;
    }
}
