import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * this class <em>SuperMarketTest</em> tests all the methods of the class SuperMarket are successfully tested
 *
 * @author Hamza Harti
 * @see SuperMarket
 */
public class SuperMarketTest {
    @Test
    public void SuperMarket() {
        //Given
        String marketName = "Edeka koch";
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);

        //When
        SuperMarket foodMarket = new SuperMarket(marketName, edekaKoch);

        //Then
        assertEquals(foodMarket.getMarketName(), marketName);
        assertEquals(foodMarket.getMarketAddress(), edekaKoch);
    }

    @Test
    public void getMarketAddress() {
        //implicitly tested in setMarketAddress
    }

    @Test
    public void getMarketName() {
        //implicitly tested in setMarketName
    }

    @Test
    public void setMarketAddress() {
        //Given
        Address edekaKoch = new Address(10, "Beim Bunten Mantel 1", "Erfurt", "Thueringen", 99092);

        //When
        SuperMarket market1 = new SuperMarket();
        market1.setMarketAddress(edekaKoch);

        //Then
        assertEquals(market1.getMarketAddress(), edekaKoch);
    }

    @Test
    public void setMarketName() {
        String marketName = "Edeka Koch";

        //When
        SuperMarket market1 = new SuperMarket();
        market1.setMarketName(marketName);

        //Then
        assertEquals(market1.getMarketName(), marketName);
    }


}