/**
 * the class Address is used to create a new address for the supermarket</br>
 * this class will only be used in the SuperMarket class</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see SuperMarket
 */
package FridgeInsight.FridgeInsight;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ADDID;

    @Column(name = "houseNumber")
    private int houseNumber; // this variable designate the number of the house

    @Column(name = "streetName")
    private String streetName; // this variable designate the number of the street

    @Column(name = "City")
    private String City; // this variable designate the City

    @Column(name = "State")
    private String State; // this variable designate the state

    @Column(name = "postalCode")
    private int postalCode; // this variable designate the postal code

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "address")
    @JsonManagedReference
    private SuperMarket superMarket;

    /**
     * the constructor of the class Address, where all the variables are set to null.
     */
    public Address() {

    }

    /**
     * the overloaded constructor of the class Address, where each variable is set to a certain value
     *
     * @param houseNumber the number of the house
     * @param streetName  the name of the street
     * @param City        the name of the city
     * @param State       the name of the state
     * @param postalCode  the postal code
     */
    public Address(int houseNumber, String streetName, String City, String State, int postalCode) {
        this.City = City;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.State = State;
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
     * get the value of the postal code
     *
     * @return the value of the postal code
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     * get the name of the city
     *
     * @return the name of the city
     */
    public String getCity() {
        return City;
    }

    /**
     * get the name of the state
     *
     * @return the name of the state
     */
    public String getState() {
        return State;
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
     * set the name of the city to a certain value
     *
     * @param city the received name of the city
     */
    public void setCity(String city) {
        City = city;
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
     * set the postal code to a certain value
     *
     * @param postalCode the received postal code
     */
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * set the name of the state to a certain value
     *
     * @param state the received name of the state
     */
    public void setState(String state) {
        State = state;
    }

    /**
     * set the name of the street to a certain value
     *
     * @param streetName the received name of the street
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setADDID(Long ADDID) {
        this.ADDID = ADDID;
    }

    public Long getADDID() {
        return ADDID;
    }

    public SuperMarket getSuperMarket() {
        return superMarket;
    }

    public void setSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }
}
