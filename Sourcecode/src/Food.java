/**
 * the class Food is used to create an item of food</br>
 * in which the class Supermarket is called to associate each food with a certain supermarket</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see SuperMarket
 */
public class Food {
    private String foodTitle; // this variable designate the name of the food
    private String expireDate; // this variable designate the expiration date of the food
    private String foodType; // this variable designate the type of the food
    private int foodQuantity; // this variable designate the quantity of the food
    private SuperMarket foodMarket;  // this variable designate the supermarket where the food is being sold

    /**
     * the constructor of the class Food, where all the varibales are set to null.
     */
    public Food() {
        this.foodTitle = null;
        this.expireDate = null;
        this.foodType = null;
        this.foodQuantity = 0;
        this.foodMarket = new SuperMarket();
    }

    /**
     * the overloaded constructor of the class Food, where each variable is set to a certain value.
     *
     * @param foodTitle    the name of the food
     * @param expireDate   the expiration date of the food
     * @param foodType     the type of the food
     * @param foodQuantity the quantity of the food
     * @param foodMarket   the supermarket where the food is being sold
     */
    public Food(String foodTitle, String expireDate, String foodType, int foodQuantity, SuperMarket foodMarket) {
        this.foodMarket = foodMarket;
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
    public String getExpireDate() {
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
    public SuperMarket getFoodMarket() {
        return foodMarket;
    }

    /**
     * set the Expiration date to a certain value
     *
     * @param expireDate the received value of the expiration date
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * set the supermarket to a certain value
     *
     * @param foodMarket the received value of the supermarket where the food is being sold
     */
    public void setFoodMarket(SuperMarket foodMarket) {
        this.foodMarket = foodMarket;
    }

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
}
