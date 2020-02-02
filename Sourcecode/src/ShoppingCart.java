import java.util.LinkedList;

/**
 * the class shoppingCart is used to make a new list containing all the groceries</br>
 * in this class we can manage (delete, add, modify) each grocery list</br>
 *
 * @author : Hamza Harti
 * @version 1.0
 * @see PurchaseList
 */
public class ShoppingCart {
    private LinkedList<PurchaseList> shoppingCart;// the linked list will hold all the created purchase lists

    /**
     * the constructor of the class ShoppingCart, where an new list will be initialised.
     */
    public ShoppingCart() {
        this.shoppingCart = new LinkedList<PurchaseList>();
    }

    /**
     * get the list containing all the purchases
     *
     * @return list of type Purchaselist
     */
    public LinkedList<PurchaseList> getShoppingCart() {
        return shoppingCart;
    }

    /**
     * set a certain list of Shopping cart with purchase lists
     *
     * @param shoppingCart the received list of purchases
     */
    public void setShoppingCart(LinkedList<PurchaseList> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * add acertain Purchase to an already existing cart
     *
     * @param purchaseList the received purchase
     */
    void addPurchaseListToCart(PurchaseList purchaseList) {
        this.shoppingCart.addLast(purchaseList);
    }

    /**
     * get a purchase from an already existing cart
     *
     * @param purchaseList the purchase to be found
     * @return the purchase , in case the purchase is not found in the list null will be returned
     */
    public PurchaseList getPurchaseListFromCart(PurchaseList purchaseList) {
        PurchaseList reference = purchaseList;
        if (this.shoppingCart.size() > 0) {
            for (PurchaseList purchase : this.shoppingCart) {
                if (reference == purchase) {
                    break;
                } else {
                    reference = null;
                }
            }
        } else {
            reference = null;
        }
        return reference;
    }

    /**
     * remove a purchase from a cart
     *
     * @param purchaseList the purchase to be removed
     */
    void deletePurchaseListFromCart(PurchaseList purchaseList) {
        if (getPurchaseListFromCart(purchaseList) != null) {
            this.shoppingCart.remove(purchaseList);
        }
    }

    /**
     * update a purchase in an already existing cart
     *
     * @param purchaseList         the purhcase to be updated
     * @param newListMaker         the new value of the user making the purchase
     * @param newDateOfPurchase    the new date for the purchase
     * @param newFoodToBePurchased the new list of food to be purchased
     */
    public void updatePurchaseListInCart(PurchaseList purchaseList, Account newListMaker, String newDateOfPurchase, LinkedList<Food> newFoodToBePurchased) {
        if (getPurchaseListFromCart(purchaseList) != null) {
            if (!purchaseList.getDateOfPurchase().equals(newDateOfPurchase)) {
                purchaseList.setDateOfPurchase(newDateOfPurchase);
            }
            if (purchaseList.getListMaker() != newListMaker) {
                purchaseList.setListMaker(newListMaker);
            }
            if (purchaseList.getFoodToBePurchased() != newFoodToBePurchased) {
                purchaseList.setFoodToBePurchased(newFoodToBePurchased);
            }
        }
    }

}
