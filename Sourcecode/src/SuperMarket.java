/**
 * this class is used to create a new supermarket</br>
 * the name of the supermarket is required</br>
 * in addition to an address created with the help of the class Address</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Address
 */
public class SuperMarket {
    private String marketName; //this variable designate the name of the supermarket
    private Address marketAddress; //this variable designate the address of the supermarket

    /**
     * the construtor of the class SuperMarket, where all the variables are set to null.
     */
    public SuperMarket() {
        this.marketName = null;
        this.marketAddress = new Address();
    }

    /**
     * the overloaded constructor of the class SuperMarket, where each variabble is set to a certain variable.
     *
     * @param marketName    the name of the supermarket
     * @param marketAddress the address of the supermarket
     */
    public SuperMarket(String marketName, Address marketAddress) {
        this.marketAddress = marketAddress;
        this.marketName = marketName;
    }

    /**
     * get the supermarket'address value
     *
     * @return the value of the address of the supermarket
     */
    public Address getMarketAddress() {
        return marketAddress;
    }

    /**
     * get the supermarket'name value
     *
     * @return the value of the name of the supermarket
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * set the supermarket'address to a certain value
     *
     * @param marketAddress the received value of the address of the supermarket
     */
    public void setMarketAddress(Address marketAddress) {
        this.marketAddress = marketAddress;
    }

    /**
     * set the supermarket'name to a certain value
     *
     * @param marketName the received value of the name of the supermarket
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
}
