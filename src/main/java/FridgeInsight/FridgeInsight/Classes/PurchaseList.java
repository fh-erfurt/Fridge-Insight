/**
 * the class PurchaseList is used to create a new list of grocery</br>
 * in which a list of food items will be saved, moreover the user making the purchase will also be designated</br>
 * a date to make a purchase is also required</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Food
 * @see Account
 */

package FridgeInsight.FridgeInsight.Classes;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table
public class PurchaseList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PURCHASEID;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date dateOfPurchase;// this variable designate the date of the purchase

    @ManyToMany
    @JoinTable(name="PURCHASELIST_FOOD", joinColumns = { @JoinColumn(name="fk_Purchase")}, inverseJoinColumns = {@JoinColumn(name="fk_Food")})
    @JsonBackReference
    private List<Food> listFoods = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name="ACCOUNT_ID", nullable = false)
    @JsonBackReference
    private Account account;
    /**
     * the constructor of the class PuchaseList, where all the variables are set to null.
     */
    public PurchaseList() {
    }

    /**
     * the overloaded constructor of the class PurchaseList, where each variable is set to a certain value.
     *
     * @param dateOfPurchase    the date of the purchase
     */
    public PurchaseList(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    /**
     * get the date of the purchase
     *
     * @return the value of  the date of the purchase
     */
    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * set the the date of the purchase to a certain value
     *
     * @param dateOfPurchase the received date of the purchase
     */
    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Long getPURCHASEID() {
        return PURCHASEID;
    }

    public void setPURCHASEID(Long PURCHASEID) {
        this.PURCHASEID = PURCHASEID;
    }

    public List<Food> getListFoods() {
        return listFoods;
    }

    public Account getAccount() {
        return account;
    }

    public void setListFoods(List<Food> foods) {
        this.listFoods = foods;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
