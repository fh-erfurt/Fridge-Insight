package FridgeInsight.FridgeInsight;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PesonID;

    @Column(name = "firstName")
    private String firstName; //this variable designate the first name of the user

    @Column(name = "lastName")
    private String lastName; // this variable designate the last name of the user

    @Column(name = "Age")
    private int Age; // this variable designate the age of the user

    @Column(name = "Height")
    private float Height; // this variable designate the height of the user

    @Column(name = "superUser")
    private boolean superUser; // this variable designate the clearance of the user

    @Column(name = "familyPosition")
    private String familyPosition; // this variable designate the family position of the user


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "person")
    @JsonManagedReference
    private Account account;


    /**
     * the constructor of the class Person, where all the variables are set to null.
     */
    protected Person() {

    }

    /**
     * the overloaded constructor of the class Person, where each variable is set to a specific value.
     *
     * @param firstName      the first name of the user
     * @param lastName       the last name of the user
     * @param Age            the age of the user
     * @param Height         the height of the user
     * @param superUser      the clearance of the user
     * @param familyPosition the family position of the user
     */
    protected Person(String firstName, String lastName, int Age, float Height, boolean superUser, String familyPosition) {
        this.Age = Age;
        this.familyPosition = familyPosition;
        this.firstName = firstName;
        this.Height = Height;
        this.superUser = superUser;
        this.lastName = lastName;
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
     * get the last name'value of a certain person
     *
     * @return the value of the last name of the person
     */
    public String getLastName() {
        return lastName;
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
     * get the clearance of a certain person.
     *
     * @return the clearance of the person (True of false)
     */
    public boolean isSuperUser() {
        return superUser;
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

    /**
     * set the family position for a certain person
     *
     * @param familyPosition the received family position
     */
    public void setFamilyPosition(String familyPosition) {
        this.familyPosition = familyPosition;
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
     * set the height for a certain person
     *
     * @param height the received height
     */
    public void setHeight(float height) {
        Height = height;
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
     * set the clearance for a certain person
     *
     * @param superUser the received clearance (true/false)
     */
    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setPesonID(Long pesonID) {
        PesonID = pesonID;
    }

    public Long getPesonID() {
        return PesonID;
    }


}
