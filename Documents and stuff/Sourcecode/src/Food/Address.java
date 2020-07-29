package Food;

import Food.SuperMarket;

/**
 * the class Food.Address is used to create a new address for the supermarket</br>
 * this class will only be used in the Food.SuperMarket class</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see SuperMarket
 */
public class Address {
    private int houseNumber; // this variable designate the number of the house
    private String streetName; // this variable designate the number of the street
    private String City; // this variable designate the City
    private String State; // this variable designate the state
    private int postalCode; // this variable designate the postal code

    /**
     * the constructor of the class Food.Address, where all the variables are set to null.
     */
    public Address() {
        this.houseNumber = 0;
        this.streetName = null;
        this.City = null;
        this.State = null;
        this.postalCode = 0;
    }

    /**
     * the overloaded constructor of the class Food.Address, where each variable is set to a certain value
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
}
