import org.junit.Test;

import static org.junit.Assert.*;

import User.*;
import Food.*;
import Purchase.*;


/**
 * this class <em>NotificationFoodListTest</em> tests all the methods of the class Food.NotificationFoodList are successfully tested
 *
 * @author Hamza Harti
 * @see NotificationFoodList
 */
public class NotificationFoodListTest {

    @Test
    public void getNotifications() {
        //Given
        NotificationFoodList notiList;

        //When
        notiList = new NotificationFoodList();
        //Then
        assertNotNull(notiList.getNotifications());
    }

    @Test
    public void setNotifications() {
        //Given
        NotificationFoodList notiList;
        NotificationFoodList referenceNotiList;
        NotificationFood referenceNoti;

        //When
        notiList = new NotificationFoodList();
        referenceNotiList = new NotificationFoodList();
        referenceNoti = new NotificationFood(0, null, "01-01-01");
        referenceNotiList.addNotificationToList(referenceNoti);
        notiList.setNotifications(referenceNotiList.getNotifications());

        //Then
        assertEquals(notiList.getNotificationFromList(referenceNoti).getDateOfExpiration(), "01-01-01");


        //Then
        assertNotNull(notiList.getNotifications());
    }

    @Test
    public void addNotificationToList() {
        //implicitly tested in deleteNotificationFromListTest
    }

    @Test
    public void deleteNotificationFromList() {
        //--------
        String foodTitle = "Vollkorn Brot G&G 50g";
        String expireDate = "20-12-2021";
        String foodType = "Brot";
        int foodQuantity = 3;
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);
        SuperMarket foodMarket = new SuperMarket("Edeka Koch", edekaKoch);
        //--------
        String dateOfExpiration = "12-15-2020";
        int minimumQuantity = 50;
        Food selectedFood = new Food(foodTitle, expireDate, foodType, foodQuantity, foodMarket);
        //-------
        NotificationFood notiFood = new NotificationFood(minimumQuantity, selectedFood, dateOfExpiration);


        //When
        NotificationFoodList notificationFoodList = new NotificationFoodList();
        notificationFoodList.addNotificationToList(notiFood);
        notificationFoodList.deleteNotificationFromList(notiFood);

        //Then
        assertNull(notificationFoodList.getNotificationFromList(notiFood));
    }

    @Test
    public void updateNotificationInList() {
        //Given
        //--------
        String foodTitle = "Vollkorn Brot G&G 50g";
        String expireDate = "20-12-2021";
        String foodType = "Brot";
        int foodQuantity = 3;
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);
        SuperMarket foodMarket = new SuperMarket("Edeka Koch", edekaKoch);
        //--------
        String dateOfExpiration = "12-15-2020";
        int minimumQuantity = 50;
        Food selectedFood = new Food(foodTitle, expireDate, foodType, foodQuantity, foodMarket);
        //-------
        NotificationFood notiFood = new NotificationFood(minimumQuantity, selectedFood, dateOfExpiration);


        //When
        NotificationFoodList notificationFoodList = new NotificationFoodList();
        notificationFoodList.addNotificationToList(notiFood);
        notificationFoodList.updateNotificationInList(notiFood, "30-10-2022", 30, selectedFood);

        //Then
        assertEquals(notificationFoodList.getNotificationFromList(notiFood).getDateOfExpiration(), "30-10-2022");
        assertEquals(notificationFoodList.getNotificationFromList(notiFood).getMinimumQuantity(), 30);

    }

    @Test
    public void getNotificationFromList() {
        //implicitly tested in deleteNotificationFromListTest
    }
}