import org.junit.Test;
import User.*;
import Food.*;
import Purchase.*;

import static org.junit.Assert.*;


/**
 * this class <em>FoodTest</em> tests all the methods of the class Food.Food are successfully tested
 *
 * @author Hamza Harti
 * @see Food
 */
public class FoodTest {
    @Test
    public void food() {
        //Given
        String foodTitle = "Vollkorn Brot G&G 50g";
        String expireDate = "20-12-2021";
        String foodType = "Brot";
        int foodQuantity = 3;
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);
        SuperMarket foodMarket = new SuperMarket("Edeka Koch", edekaKoch);

        //When
        Food brotVollkorn = new Food(foodTitle, expireDate, foodType, foodQuantity, foodMarket);

        //then
        assertEquals(brotVollkorn.getFoodTitle(), foodTitle);
        assertEquals(brotVollkorn.getExpireDate(), expireDate);
        assertEquals(brotVollkorn.getFoodMarket(), foodMarket);
        assertEquals(brotVollkorn.getFoodQuantity(), foodQuantity);
        assertEquals(brotVollkorn.getFoodType(), foodType);
    }

    @Test
    public void setExpireDate() {
        //Given
        String expireDate = "05-12-2021";

        //When
        Food foodTest = new Food();
        foodTest.setExpireDate(expireDate);

        //Then
        assertEquals(foodTest.getExpireDate(), expireDate);

    }

    @Test
    public void setFoodMarket() {
        //Given
        Address address1 = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);
        SuperMarket foodMarket = new SuperMarket();
        foodMarket.setMarketName("Edeka koch");
        foodMarket.setMarketAddress(address1);


        //When
        Food foodTest = new Food();
        foodTest.setFoodMarket(foodMarket);

        //Then
        assertEquals(foodTest.getFoodMarket(), foodMarket);

    }

    @Test
    public void setFoodQuantity() {
        //Given
        int foodQuantity = 10;

        //when
        Food foodTest = new Food();
        foodTest.setFoodQuantity(foodQuantity);

        //Then
        assertEquals(foodTest.getFoodQuantity(), foodQuantity);
    }

    @Test
    public void setFoodTitle() {
        //Given
        String foodTitle = "Vollkorn Brot G&G 50g";

        //when
        Food foodTest = new Food();
        foodTest.setFoodTitle(foodTitle);

        //Then
        assertEquals(foodTest.getFoodTitle(), foodTitle);
    }

    @Test
    public void setFoodType() {
        //Given
        String foodType = "Brot";

        //When
        Food foodTest = new Food();
        foodTest.setFoodType(foodType);

        //Then
        assertEquals(foodTest.getFoodType(), foodType);
    }

    @Test
    public void getFoodTitle() {
        //implicitly tested in setFoodTitle
    }

    @Test
    public void getFoodType() {
        //implicitly tested in setFoodType
    }

    @Test
    public void getExpireDate() {
        //implicitly tested in setExpireDate
    }

    @Test
    public void getFoodQuantity() {
        //implicitly tested in setFoodQuantity
    }

    @Test
    public void getFoodMarket() {
        //implicitly tested in setFoodMarket
    }
}