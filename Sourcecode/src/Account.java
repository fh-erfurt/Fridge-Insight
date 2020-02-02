/**
 * the class Account extends the class Person</br>
 * it is used to create new account for a certain user</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Person
 */
public class Account extends Person {

    private String dateOfCreation; // this is a variable to designate the date when the profil was created.
    private String Password; // this variable holds the value of the password.

    /**
     * the Constructor of the class Account, where all the variables are set to null.</br>
     * this constructor calls automatically the constructor of the parent class Person.</br>
     */
    public Account() {
        this.dateOfCreation = null;
        this.Password = null;
    }

    /**
     * the overloaded constructor of the class Account, where each variable is set to a specific value.</br>
     * the password and date of creation are set using the setter-functions of this class.</br>
     *
     * @param firstName      the first name of the user
     * @param lastName       the last name of the user
     * @param Age            the age of the user
     * @param Height         the height of the user
     * @param superUser      the clearance of the user
     * @param familyPosition the family position of the user
     * @param Password       the password of the user
     * @param dateOfCreation the date of creation of the account
     */
    public Account(String firstName, String lastName, int Age, float Height, boolean superUser, String familyPosition, String Password, String dateOfCreation) {
        super(firstName, lastName, Age, Height, superUser, familyPosition);
        setPassword(Password);
        setDateOfCreation(dateOfCreation);
    }

    /**
     * set a date of creation for an account.
     *
     * @param dateOfCreation the received date of creation
     */
    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    /**
     * get the date of creation'value of a certain account
     *
     * @return the value of the date of creation of the account
     */
    public String getDateOfCreation() {
        return dateOfCreation;
    }

    /**
     * get a password for an account
     *
     * @return the password of the account
     */
    public String getPassword() {
        return Password;
    }

    /**
     * set a password for an account
     *
     * @param password the received password
     */
    public void setPassword(String password) {
        Password = password;
    }
}
