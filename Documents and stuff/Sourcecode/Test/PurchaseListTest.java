import Food.Food;
import Purchase.PurchaseList;
import User.Account;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
import User.*;
import Food.*;
import Purchase.*;


/**
 * this class <em>PurchaseListTest</em> tests all the methods of the class Purchase.PurchaseList are successfully tested
 *
 * @author Hamza Harti
 * @see PurchaseList
 */
public class PurchaseListTest {

    @Test
    public void PurchaseList() {
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

        //When
        PurchaseList listTest = new PurchaseList(listMaker, dateOfPurchase, foodToBePurchased);


        //Then
        assertEquals(listTest.getListMaker(), listMaker);
        assertEquals(listTest.getDateOfPurchase(), dateOfPurchase);
        assertEquals(listTest.getFoodToBePurchased(), foodToBePurchased);
    }

    @Test
    public void setDateOfPurchase() {
        //Given
        String dateOfPurchase = "25-01-2020";

        //When
        PurchaseList listTest = new PurchaseList();
        listTest.setDateOfPurchase(dateOfPurchase);


        //Then
        assertEquals(listTest.getDateOfPurchase(), dateOfPurchase);
    }

    @Test
    public void setListMaker() {

        //Given
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
        //new User.Account end

        //When
        PurchaseList listTest = new PurchaseList();
        listTest.setListMaker(listMaker);

        //Then
        assertEquals(listTest.getListMaker(), listMaker);

    }

    @Test
    public void setFoodToBePurchased() {
        //Given
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

        //When
        PurchaseList listTest = new PurchaseList();
        listTest.setFoodToBePurchased(foodToBePurchased);

        //Then
        assertEquals(listTest.getFoodToBePurchased(), foodToBePurchased);
    }

    @Test
    public void getFoodToBePurchased() {
        //implicitly tested in setToBePurchased
    }

    @Test
    public void getListMaker() {
        //implicitly tested in setListMaker
    }

    @Test
    public void getDateOfPurchase() {
        //implicitly tested in setDateOfPurchase
    }
}