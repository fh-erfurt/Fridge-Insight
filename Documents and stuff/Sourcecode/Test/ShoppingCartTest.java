import User.Account;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

import User.*;
import Food.*;
import Purchase.*;


/**
 * this class <em>ShoppingCartTest</em> tests all the methods of the class Purchase.ShoppingCart are successfully tested
 *
 * @author Hamza Harti
 * @see ShoppingCart
 */
public class ShoppingCartTest {

    @Test
    public void getShoppingCart() {
        //implicitly tested in deletePurchaseListFromCart
    }

    /**
     * verify the set method :</br>
     * 1. create two shopping carts</br>
     * 2. create a purchase list</br>
     * 3. add it to one shopping cart</br>
     * 4. use the method SetShoppingCart to add the shopping list from the first cart to the second cart</br>
     * 5. test if the date of purchase of the purchase list in the second Shopping cart is equal to the same date used in the first shopping cart</br>
     */
    @Test
    public void setShoppingCart() {
        //Given
        ShoppingCart testCart;
        ShoppingCart referenceCart;
        PurchaseList referencePurchaseList;

        //When
        testCart = new ShoppingCart();
        referenceCart = new ShoppingCart();
        referencePurchaseList = new PurchaseList(null, "01-01-01", null);
        referenceCart.addPurchaseListToCart(referencePurchaseList);
        testCart.setShoppingCart(referenceCart.getShoppingCart());

        //Then
        assertEquals(testCart.getPurchaseListFromCart(referencePurchaseList).getDateOfPurchase(), "01-01-01");
    }

    @Test
    public void addPurchaseListToCart() {
        //implicitly tested in deletePurchaseListFromCart
    }

    @Test
    public void getPurchaseListFromCart() {
        //implicitly tested in deletePurchaseListFromCart
    }

    /**
     * test the delete method :</br>
     * 1. create a new account from the parameters </br>
     * 2. create a new food from the parameters </br>
     * 3. create a new list where we will the new food items</br>
     * 4. add the list to a shoping cart</br>
     * 5. delete the list from the shopping cart</br>
     * 6. verify if the size of the shopping is equal to 0</br>
     */
    @Test
    public void deletePurchaseListFromCart() {
        //Given
        String dateOfPurchase = "25-01-2020"; //Date of Purchase
        // new User.Account begin
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = true;
        String familyPosition = "Child";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";
        Account listMaker = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);
        // new User.Account End
        //new Food.Food begin
        String foodTitle = "Vollkorn Brot G&G 50g";
        String expireDate = "20-12-2021";
        String foodType = "Brot";
        int foodQuantity = 3;
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);
        SuperMarket foodMarket = new SuperMarket("Edeka Koch", edekaKoch);
        Food brotVollkorn = new Food(foodTitle, expireDate, foodType, foodQuantity, foodMarket);
        //-------------------------------------------------------------------------------------
        String foodTitleSecond = "Milch G&G 1L 3%";
        String expireDateSecond = "22-11-2020";
        String foodTypeSecond = "Milch";
        int foodQuantitySecond = 7;
        Food Milch = new Food(foodTitleSecond, expireDateSecond, foodTypeSecond, foodQuantitySecond, foodMarket);
        //new Food.Food end

        //new list for Food.Food begin
        LinkedList<Food> foodToBePurchased = new LinkedList<Food>();
        foodToBePurchased.add(brotVollkorn);
        foodToBePurchased.add(Milch);
        //new list for Food.Food end

        PurchaseList listTest = new PurchaseList(listMaker, dateOfPurchase, foodToBePurchased);

        //when
        ShoppingCart testCart = new ShoppingCart();
        testCart.addPurchaseListToCart(listTest);
        testCart.deletePurchaseListFromCart(listTest);

        //Then
        assertEquals(testCart.getShoppingCart().size(), 0);
    }

    /**
     * test the update method:</br>
     * 1. create a new list of grocery</br>
     * 2. set the date of purchase to 01-01-01</br>
     * 3. create a new cart</br>
     * 4. add the list to the cart</br>
     * 5. change the date of the purchase of the list in the cart to 01-02-01</br>
     * 6. verify if the date of our list in the shopping is actually equal to 01-02-01</br>
     */
    @Test
    public void updatePurchaseListInCart() {
        //Given
        PurchaseList listTest = new PurchaseList(null, "01-01-01", null);

        //When
        ShoppingCart testCart = new ShoppingCart();
        testCart.addPurchaseListToCart(listTest);
        System.out.println(testCart.getPurchaseListFromCart(listTest).getListMaker());
        testCart.updatePurchaseListInCart(listTest, null, "01-02-01", null);


        //Then
        assertEquals(testCart.getPurchaseListFromCart(listTest).getDateOfPurchase(), "01-02-01");

    }
}