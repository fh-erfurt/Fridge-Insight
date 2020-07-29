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
 * @see Person
 */
@Entity
@Table(name = "ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ACCID;

    @Temporal(TemporalType.DATE)
    @Column(name = "dateOfCreation")
    private Date dateOfCreation; // this is a variable to designate the date when the profil was created.

    @Column(name = "Password")
    private String Password; // this variable holds the value of the password.

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Person_ID", nullable = false)
    @JsonBackReference
    private Person person; // this is the person who owns this account.

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
     */


    public Account(String Password, Date dateOfCreation) {
        setPassword(Password);
        setDateOfCreation(dateOfCreation);
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
     * get the date of creation'value of a certain account
     *
     * @return the value of the date of creation of the account
     */
    public Date getDateOfCreation() {
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

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setACCID(Long ACCID) {
        this.ACCID = ACCID;
    }

    public Long getACCID() {
        return ACCID;
    }

   public List<PurchaseList> getPurchaseLists() {return purchaseLists;}

    public void setPurchaseLists(List<PurchaseList> purchaseLists) {this.purchaseLists = purchaseLists;}
}

