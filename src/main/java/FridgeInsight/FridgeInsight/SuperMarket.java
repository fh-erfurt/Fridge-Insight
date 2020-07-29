/**
 * this class is used to create a new supermarket</br>
 * the name of the supermarket is required</br>
 * in addition to an address created with the help of the class Address</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Address
 */


package FridgeInsight.FridgeInsight;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "SuperMarket")
public class SuperMarket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MarketID;

    @Column(name = "marketName")
    private String marketName; //this variable designate the name of the supermarket


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "supermarket")
    @JsonManagedReference
    private List<Food> foodList;


    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "Address_ID", nullable = false)
    @JsonBackReference
    private Address address; //this variable designate the address of the supermarket

    /**
     * the construtor of the class SuperMarket, where all the variables are set to null.
     */
    public SuperMarket() {
    }

    /**
     * the overloaded constructor of the class SuperMarket, where each variabble is set to a certain variable.
     *
     * @param marketName the name of the supermarket
     */
    public SuperMarket(String marketName) {
        this.marketName = marketName;
    }

    /**
     * /**
     * get the supermarket'name value
     *
     * @return the value of the name of the supermarket
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * set the supermarket'name to a certain value
     *
     * @param marketName the received value of the name of the supermarket
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Long getMarketID() {
        return MarketID;
    }

    public void setMarketID(Long marketID) {
        MarketID = marketID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
