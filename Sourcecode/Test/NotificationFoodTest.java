import org.junit.Test;
import User.*;
import Food.*;
import Purchase.*;
import static org.junit.Assert.*;
/**
 * this class <em>NotificationFoodTest</em> tests all the methods of the class Food.NotificationFood are successfully tested
 *
 * @author Hamza Harti
 * @see NotificationFood
 */
public class NotificationFoodTest {

    @Test
    public void NotificationFood() {
        //Given
        String dateOfExpiration = "12-15-2020";
        int minimumQuantity = 50;
        String foodTitle = "Vollkorn Brot G&G 50g";
        String expireDate = "20-12-2021";
        String foodType = "Brot";
        int foodQuantity = 3;
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);
        SuperMarket foodMarket = new SuperMarket("Edeka Koch", edekaKoch);
        Food selectedFood = new Food(foodTitle, expireDate, foodType, foodQuantity, foodMarket);

        //When
        NotificationFood notiFood = new NotificationFood(minimumQuantity, selectedFood, dateOfExpiration);


        //Then
        assertEquals(notiFood.getMinimumQuantity(), minimumQuantity);
        assertEquals(notiFood.getSelectedFood(), selectedFood);
        assertEquals(notiFood.getDateOfExpiration(), dateOfExpiration);

    }

    @Test
    public void setMinimumQuantity() {
        //Given
        int minimumQuantity = 50;

        //When
        NotificationFood notiFood = new NotificationFood();
        notiFood.setMinimumQuantity(minimumQuantity);


        //Then
        assertEquals(notiFood.getMinimumQuantity(), minimumQuantity);
    }

    @Test
    public void setSelectedFood() {
        //Given
        String foodTitle = "Vollkorn Brot G&G 50g";
        String expireDate = "20-12-2021";
        String foodType = "Brot";
        int foodQuantity = 3;
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);
        SuperMarket foodMarket = new SuperMarket("Edeka Koch", edekaKoch);
        Food selectedFood = new Food(foodTitle, expireDate, foodType, foodQuantity, foodMarket);

        //When
        NotificationFood notiFood = new NotificationFood();
        notiFood.setSelectedFood(selectedFood);

        //Then
        assertEquals(notiFood.getSelectedFood(), selectedFood);

    }


    @Test
    public void setDateOfExpiration() {
        //Given
        String dateOfExpiration = "20-10-2020";

        //When
        NotificationFood notiFood = new NotificationFood();
        notiFood.setDateOfExpiration(dateOfExpiration);

        //Then
        assertEquals(notiFood.getDateOfExpiration(), dateOfExpiration);
    }

    @Test
    public void getSelectedFood() {
        //implicitly tested in setSelectedFood
    }

    @Test
    public void getMinimumQuantity() {
        //implicitly tested in setMinimumQuantity
    }

    @Test
    public void getDateOfExpiration() {
        //implicitly tested in setDateOfExpiration
    }


}