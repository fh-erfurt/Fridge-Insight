import Food.Address;
import org.junit.Test;

import static org.junit.Assert.*;

import User.*;
import Food.*;
import Purchase.*;


/**
 * this class <em>AddressTest</em> tests all the methods of the class Food.Address are successfully tested
 *
 * @author Hamza Harti
 * @see Address
 */
public class AddressTest {
    @Test
    public void Address() {
        //Given
        int houseNumber = 1003;
        String streetName = "Plauener Weg 8";
        String City = "Erfurt";
        String State = "Thueringen";
        int postalCode = 99089;

        //When
        Address addressTest = new Address(houseNumber, streetName, City, State, postalCode);

        //Then
        assertEquals(addressTest.getHouseNumber(), houseNumber);
        assertEquals(addressTest.getStreetName(), streetName);
        assertEquals(addressTest.getCity(), City);
        assertEquals(addressTest.getState(), State);
        assertEquals(addressTest.getPostalCode(), postalCode);
    }

    @Test
    public void getHouseNumber() {
        //Given
        int houseNumber = 1003;

        //When
        Address addressTest = new Address();
        addressTest.setHouseNumber(houseNumber);

        //then
        assertEquals(addressTest.getHouseNumber(), houseNumber);
    }

    @Test
    public void getPostalCode() {
        //Given
        int postalCode = 99089;

        //When
        Address addressTest = new Address();
        addressTest.setPostalCode(postalCode);

        //then
        assertEquals(addressTest.getPostalCode(), postalCode);
    }

    @Test
    public void getCity() {
        //Given
        String City = "Erfurt";

        //When
        Address addressTest = new Address();
        addressTest.setCity(City);

        //then
        assertEquals(addressTest.getCity(), City);
    }

    @Test
    public void getState() {
        //Given
        String State = "Thueringen";

        //When
        Address addressTest = new Address();
        addressTest.setState(State);

        //then
        assertEquals(addressTest.getState(), State);
    }

    @Test
    public void getStreetName() {
        //Given
        String streetName = "Plauener Weg 8";

        //When
        Address addressTest = new Address();
        addressTest.setStreetName(streetName);

        //then
        assertEquals(addressTest.getStreetName(), streetName);
    }

    @Test
    public void setCity() {
        //implicitly tested in getCity
    }

    @Test
    public void setHouseNumber() {
        //implicitly tested in getHouseNumber
    }

    @Test
    public void setPostalCode() {
        //implicitly tested in getPostalCode
    }

    @Test
    public void setState() {
        //implicitly tested in getState
    }

    @Test
    public void setStreetName() {
        //implicitly tested in getStreetName
    }


}