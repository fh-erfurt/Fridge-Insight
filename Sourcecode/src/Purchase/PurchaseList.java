package Purchase;

import Food.Food;
import User.Account;

import java.util.LinkedList;

/**
 * the class Purchase.PurchaseList is used to create a new list of grocery</br>
 * in which a list of food items will be saved, moreover the user making the purchase will also be designated</br>
 * a date to make a purchase is also required</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Food
 * @see Account
 */
public class PurchaseList {
    private Account listMaker; // this variable designate the user making the list
    private String dateOfPurchase;// this variable designate the date of the purchase
    private LinkedList<Food> foodToBePurchased;// this variable designate the list of the food to be purchased

    /**
     * the constructor of the class PuchaseList, where all the variables are set to null.
     */
    public PurchaseList() {
        this.listMaker = new Account();
        this.dateOfPurchase = null;
        this.foodToBePurchased = new LinkedList<Food>();
    }

    /**
     * the overloaded constructor of the class Purchase.PurchaseList, where each variable is set to a certain value.
     *
     * @param listMaker         the user making the list
     * @param dateOfPurchase    the date of the purchase
     * @param foodToBePurchased the list of the food to be purchased
     */
    public PurchaseList(Account listMaker, String dateOfPurchase, LinkedList<Food> foodToBePurchased) {
        this.dateOfPurchase = dateOfPurchase;
        this.foodToBePurchased = foodToBePurchased;
        this.listMaker = listMaker;
    }

    /**
     * get the list of the food to be purchased
     *
     * @return the list of the food to be purchased
     */
    public LinkedList<Food> getFoodToBePurchased() {
        return foodToBePurchased;
    }

    /**
     * get the user making the list
     *
     * @return the account of the user making the list of the food
     */
    public Account getListMaker() {
        return listMaker;
    }

    /**
     * get the date of the purchase
     *
     * @return the value of  the date of the purchase
     */
    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * set the the date of the purchase to a certain value
     *
     * @param dateOfPurchase the received date of the purchase
     */
    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    /**
     * set the maker of the list to a certain account
     *
     * @param listMaker the received account makingg the list
     */
    public void setListMaker(Account listMaker) {
        this.listMaker = listMaker;
    }

    /**
     * set the list of the food to a certain value
     *
     * @param foodToBePurchased the received list of food to be purchased
     */
    public void setFoodToBePurchased(LinkedList<Food> foodToBePurchased) {
        this.foodToBePurchased = foodToBePurchased;
    }
}
