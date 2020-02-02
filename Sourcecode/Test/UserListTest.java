import User.*;
import Food.*;
import Purchase.*;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * this class <em>UserListTest</em> tests all the methods of the class User.UserList are successfully tested
 *
 * @author Hamza Harti
 * @see UserList
 */
public class UserListTest {

    /**
     * verify the get method :</br>
     * 1.create two new account</br>
     * 2.add them to a list</br>
     * 3.verify if the size of the list is equal to 2</br>
     */
    @Test
    public void getUsers() {
        //Given
        //parameter for new User.Account begin
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = false;
        String familyPosition = "Father";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";
        //parameter for new User.Account end
        //parameter for SuperUser User.Account begin
        String firstNames = "Oumaima";
        String lastNames = "Morchid";
        int Ages = 24;
        float Heights = 172;
        boolean superUsers = true;
        String familyPositions = "Child";
        String Passwords = "987654321";
        String dateOfCreations = "10-01-2020";
        //parameter for SuperUser User.Account end

        //When
        Account userX = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);
        Account superUserX = new Account(firstNames, lastNames, Ages, Heights, superUsers, familyPositions, Passwords, dateOfCreations);
        UserList userList = new UserList();
        userList.addUserToList(userX);
        userList.addUserToList(superUserX);

        //Then
        assertEquals(userList.getUsers().size(), 2);


    }

    /**
     * verify the set Method:</br>
     * 1. create an account</br>
     * 2. add it to a list</br>
     * 3. use the method to put the account in a new list</br>
     * 4. verify if the lists have the same account bases on the first name</br>
     */
    @Test
    public void setUsers() {
        //Given
        //parameter for new User.Account begin
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = false;
        String familyPosition = "Father";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";
        //parameter for new User.Account end

        //When
        Account userX = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);
        UserList userList = new UserList();
        UserList referenceList = new UserList();
        referenceList.setUsers(userList.getUsers());

        //Then
        assertEquals(userList.getUser("Harti", "Hamza").getFirstName(), referenceList.getUser("Harti", "Hamza").getFirstName());

    }

    /**
     * verify the add method:</br>
     * 1. create an User.Account</br>
     * 2. add the account to a list</br>
     * 3. use the get method to retrieve the account</br>
     * 4. compare it with the account first created, they should be equal</br>
     */
    @Test
    public void addUserToList() {
        //Given
        //parameter for new User.Account begin
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = true;
        String familyPosition = "Child";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";
        //parameter for new User.Account end
        //set a List of users
        UserList userList;

        //When
        Account userX = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);
        userList = new UserList();
        userList.addUserToList(userX);

        //Then
        assertEquals(userX, userList.getUser(lastName, firstName));
    }

    @Test
    public void superUserAdd() {
        //implicitly  tested in Method : superUserDelete
    }

    /**
     * verify the delete method:</br>
     * 1. create an account</br>
     * 2. add it to a list</br>
     * 3. delete it from the list</br>
     * 4. compare the account create with the one added to the list, they should not be equal</br>
     */
    @Test
    public void deleteUserFromList() {
        //Given
        //parameter for new User.Account begin
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = true;
        String familyPosition = "Child";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";
        //parameter for new User.Account end
        //set a List of users
        UserList userList;

        //When
        Account userX = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);
        userList = new UserList();
        userList.addUserToList(userX);
        userList.deleteUserFromList(firstName, lastName, Password);

        //Then
        assertNotEquals(userX, userList.getUser(lastName, firstName));
    }

    /**
     * verify the super user Delete method :</br>
     * 1. create an account</br>
     * 2. create a super user account</br>
     * 3. add the super user to a list</br>
     * 4. add the user to the list using the super user add method</br>
     * 5. delete the user using the super user delete method </br>
     * 6. search for the user in the list, it should no longer exist</br>
     */
    @Test
    public void superUserDelete() {
        //Given
        //parameter for new User.Account begin
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = false;
        String familyPosition = "Father";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";
        //parameter for new User.Account end
        //parameter for SuperUser User.Account begin
        String firstNames = "Oumaima";
        String lastNames = "Morchid";
        int Ages = 24;
        float Heights = 172;
        boolean superUsers = true;
        String familyPositions = "Child";
        String Passwords = "987654321";
        String dateOfCreations = "10-01-2020";
        //parameter for SuperUser User.Account end

        //When
        Account userX = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);
        Account superUserX = new Account(firstNames, lastNames, Ages, Heights, superUsers, familyPositions, Passwords, dateOfCreations);
        UserList userList = new UserList();
        userList.addUserToList(superUserX);
        userList.superUserAdd(userX, superUserX);
        userList.superUserDelete(firstName, lastName, superUserX);

        //Then
        assertNotEquals(userX, userList.getUser(lastName, firstName));

    }

    @Test
    public void getUser() {
        //implicitly  tested in Method : AddUserToList
    }

    /**
     * verify the update method :</br>
     * 1. create a user</br>
     * 2. add it ot a list</br>
     * 3. retrieve the index of the user in the list</br>
     * 4. modify some parameters in the recently added user</br>
     * 5. get the user by index and compare it with the new updated user, they should be the same</br>
     */
    @Test
    public void updateUser() {

        //Given
        //parameter for new User.Account begin
        String firstName = "Hamza";
        String lastName = "Harti";
        int Age = 26;
        float Height = 178;
        boolean superUser = true;
        String familyPosition = "Child";
        String Password = "123456789";
        String dateOfCreation = "06-01-2020";
        //parameter for new User.Account end
        UserList userList;

        //when
        Account userX = new Account(firstName, lastName, Age, Height, superUser, familyPosition, Password, dateOfCreation);
        userList = new UserList();
        userList.addUserToList(userX);
        int indexOfUserX = userList.indexOfElement(userX);
        userList.updateUser(firstName, lastName, 24, 172, "Mother", Password, "Morchid", "Oumaima", "987654321");

        //Then
        assertEquals(userList.getElementByIndex(indexOfUserX), userList.getUser("Morchid", "Oumaima"));
    }
}