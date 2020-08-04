package FridgeInsight.FridgeInsight;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * the class Account extends the class Person</br>
 * it is used to create new account for a certain user</br>
 *
 * @author Hamza Harti
 * @version 1.0
 */
@Entity
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ACCID;

    @Column
    private String firstName; //this variable designate the first name of the user

    @Column
    private String lastName; // this variable designate the last name of the user

    @Column
    private int Age; // this variable designate the age of the user

    @Column
    private float Height; // this variable designate the height of the user

    @Column
    private boolean superUser; // this variable designate the clearance of the user

    @Column
    private String familyPosition; // this variable designate the family position of the user


    @Temporal(TemporalType.DATE)
    @Column
    private Date dateOfCreation; // this is a variable to designate the date when the profil was created.

    @Column
    private String Password; // this variable holds the value of the password.

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "account")
    @JsonManagedReference
    private List<PurchaseList> purchaseLists;

    /**
     * the Constructor of the class Account, where all the variables are set to null.</br>
     * this constructor calls automatically the constructor of the parent class Person.</br>
     */
    public Account() {

    }

    /**
     * the overloaded constructor of the class Account, where each variable is set to a specific value.</br>
     * the password and date of creation are set using the setter-functions of this class.</br>
     *
     * @param Password       the password of the user
     * @param dateOfCreation the date of creation of the account
     * @param firstName      the first name of the user
     * @param lastName       the last name of the user
     * @param Age            the age of the user
     * @param Height         the height of the user
     * @param superUser      the clearance of the user
     * @param familyPosition the family position of the user
     */


    public Account(String firstName, String lastName, int Age, float Height, boolean superUser, String familyPosition, String Password, Date dateOfCreation) {
        setPassword(Password);
        setDateOfCreation(dateOfCreation);
        this.Age = Age;
        this.familyPosition = familyPosition;
        this.firstName = firstName;
        this.Height = Height;
        this.superUser = superUser;
        this.lastName = lastName;
    }

    /**
     * get the date of creation'value of a certain account
     *
     * @return the value of the date of creation of the account
     */
    public Date getDateOfCreation() {
        return dateOfCreation;
    }
    /**
     * set a date of creation for an account.
     *
     * @param dateOfCreation the received date of creation
     */
    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
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


    public Long getACCID() {
        return ACCID;
    }

    public void setACCID(Long ACCID) {
        this.ACCID = ACCID;
    }

    /**
     * get the clearance of a certain person.
     *
     * @return the clearance of the person (True of false)
     */

    public boolean isSuperUser() {
        return superUser;
    }
    /**
     * set the clearance for a certain person
     *
     * @param superUser the received clearance (true/false)
     */
    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    public List<PurchaseList> getPurchaseLists() {
        return purchaseLists;
    }

    public void setPurchaseLists(List<PurchaseList> purchaseLists) {
        this.purchaseLists = purchaseLists;
    }

    /**
     * get the first name'value of a certain person
     *
     * @return the value of the first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set the first name for a person
     *
     * @param firstName the received first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * get the last name'value of a certain person
     *
     * @return the value of the last name of the person
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * set the last name for a certain person
     *
     * @param lastName the received last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get the familyposition'value of a certain person.
     *
     * @return the value of the family position of the person
     */
    public String getFamilyPosition() {
        return familyPosition;
    }
    /**
     * set the family position for a certain person
     *
     * @param familyPosition the received family position
     */
    public void setFamilyPosition(String familyPosition) {
        this.familyPosition = familyPosition;
    }


    /**
     * get the height'value of a certain person
     *
     * @return the value of the height of the person
     */
    public float getHeight() {
        return Height;
    }


    /**
     * set the height for a certain person
     *
     * @param height the received height
     */
    public void setHeight(float height) {
        Height = height;
    }

    /**
     * get the age'value of a certain person
     *
     * @return the value of the age of the person
     */
    public int getAge() {
        return Age;
    }

    /**
     * set the age for a certain person
     *
     * @param age the received age
     */
    public void setAge(int age) {
        Age = age;
    }
}

