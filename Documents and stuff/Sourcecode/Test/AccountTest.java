import User.Account;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * this class <em>AccountTest</em> tests all the methods of the class User.Account are successfully tested
 *
 * @author Hamza Harti
 * @see Account
 */

public class AccountTest {

    @Test

    public void setDateOfCreation() {
        //given
        String Date = "06-01-2020";

        //When
        Account account1 = new Account();
        account1.setDateOfCreation(Date);

        //Then
        assertEquals(account1.getDateOfCreation(), Date);
    }

    @Test
    public void getDateOfCreation() {
        //already tested in setDateOfCreation()
    }

    @Test
    public void getPassword() {
        //already tested in setPassword()
    }

    @Test
    public void setPassword() {
        //given
        String Password = "123456789";

        //When
        Account account1 = new Account();
        account1.setPassword(Password);

        //Then
        assertEquals(account1.getPassword(), Password);
    }

    @Test
    public void Account() {
        //Given
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = true;
        String familyPosition = "Child";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";

        //When
        Account accountTest = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);

        //Then
        assertEquals(accountTest.getFirstName(), firstName);
        assertEquals(accountTest.getLastName(), lastName);
        assertEquals(accountTest.getAge(), Age);
        assertEquals(accountTest.getHeight(), Height, 0.1);
        assertEquals(accountTest.isSuperUser(), superUser);
        assertEquals(accountTest.getFamilyPosition(), familyPosition);
        assertEquals(accountTest.getPassword(), Password);
        assertEquals(accountTest.getDateOfCreation(), dateOfCreation);

    }
}