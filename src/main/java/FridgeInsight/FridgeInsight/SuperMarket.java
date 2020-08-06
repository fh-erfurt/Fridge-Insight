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
@Table
public class SuperMarket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marketID;

    @Column
    private String marketName; //this variable designate the name of the supermarket

    @Column
    private int houseNumber; // this variable designate the number of the house

    @Column
    private String streetName; // this variable designate the number of the street

    @Column
    private String city; // this variable designate the City

    @Column
    private String state; // this variable designate the state

    @Column
    private int postalCode; // this variable designate the postal code

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "supermarket")
    @JsonManagedReference
    private List<Food> foodList;


    /**
     * the construtor of the class SuperMarket, where all the variables are set to null.
     */
    public SuperMarket() {
    }

    /**
     * the overloaded constructor of the class SuperMarket, where each variabble is set to a certain variable.
     *
     * @param houseNumber the number of the house
     * @param streetName  the name of the street
     * @param city        the name of the city
     * @param state       the name of the state
     * @param postalCode  the postal code
     * @param marketName  the name of the supermarket
     */
    public SuperMarket(String marketName, int houseNumber, String streetName, String city, String state, int postalCode) {
        this.city = city;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.state = state;
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
        return marketID;
    }

    public void setMarketID(Long marketID) {
        this.marketID = marketID;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }


    /**
     * get the name of the state
     *
     * @return the name of the state
     */
    public String getState() {
        return state;
    }

    /**
     * set the name of the state to a certain value
     *
     * @param state the received name of the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * get the name of the street
     *
     * @return the name of the street
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * set the name of the street to a certain value
     *
     * @param streetName the received name of the street
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * get the name of the city
     *
     * @return the name of the city
     */
    public String getCity() {
        return city;
    }

    /**
     * set the name of the city to a certain value
     *
     * @param city the received name of the city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * get the value of the house'number
     *
     * @return the value of the number of the house
     */
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * set the number of the house to a certain value
     *
     * @param houseNumber the received number of the house
     */
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * get the value of the postal code
     *
     * @return the value of the postal code
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     * set the postal code to a certain value
     *
     * @param postalCode the received postal code
     */
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }


}
