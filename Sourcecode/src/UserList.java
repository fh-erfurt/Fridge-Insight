import java.util.LinkedList;

/**
 * the class UserList is used to make a new list containing all the Accounts</br>
 * in this class we can manage (delete, add, modify) each Account individually</br>
 *
 * @author Hamza Harti
 * @version 1.0
 * @see Person
 * @see Account
 */
public class UserList {
    private LinkedList<Account> Users;// the linked list will hold all the created accounts.

    /**
     * the constructor of the class UserList, where an new list will be initialised.
     */
    public UserList() {
        this.Users = new LinkedList<Account>();
    }

    /**
     * get the list containing all the accounts
     *
     * @return list of type Account
     */
    public LinkedList<Account> getUsers() {
        return this.Users;
    }

    /**
     * get the index of a certain account in the list
     *
     * @param user the received account of the user
     * @return the value of the index of the account in the list, in case account is not found return value -1
     */
    int indexOfElement(Account user) {
        if (getUser(user.getLastName(), user.getFirstName()) != null) {
            return this.Users.indexOf(user);
        } else {
            return -1;
        }
    }

    /**
     * get the account of a certain user by the index in the list
     *
     * @param Index the received index of the account
     * @return the account of the user extracted from the list
     */
    public Account getElementByIndex(int Index) {
        return this.Users.get(Index);
    }

    /**
     * set a certain list of accounts with accounts
     *
     * @param users the received list of accounts
     */
    public void setUsers(LinkedList<Account> users) {
        this.Users = users;
    }

    /**
     * add a certain account of a user to an already existing list
     *
     * @param userX the received user
     */
    void addUserToList(Account userX) {
        this.Users.addLast(userX);
    }

    /**
     * add a certain account of a user to an already existing list, clearance given only to a SuperUser.
     *
     * @param userX       the user to be added
     * @param superUser   the SuperUser, who'll carry the operation
     */
    public void superUserAdd(Account userX, Account superUser) {
        if (superUser.isSuperUser()) {
            addUserToList(userX);
        }
    }

    /**
     * remove a certian account for a user
     *
     * @param firstName the first name of the user
     * @param lastName  the last name of the user
     * @param Password  the password of the account
     */
    void deleteUserFromList(String firstName, String lastName, String Password) {
        Account referenceAccount = new Account();

        for (int i = 0; i < this.Users.size(); i++) {
            referenceAccount = this.Users.get(i);

            if (referenceAccount.getLastName().equals(lastName)) {
                if (referenceAccount.getFirstName().equals(firstName)) {
                    if (referenceAccount.getPassword().equals(Password))
                        this.Users.remove(i);
                    break;
                }
            }
        }
    }

    /**
     * remove a certain account for a user, clreance given only to a SuperUSer
     *
     * @param firstName the first name of the user
     * @param lastName  the last name of the user
     * @param superUser the Superuser, who'll carry the operation
     */
    void superUserDelete(String firstName, String lastName, Account superUser) {
        Account referenceAccount = new Account();

        for (int i = 0; i < this.Users.size(); i++) {
            referenceAccount = this.Users.get(i);

            if (referenceAccount.getLastName().equals(lastName)) {
                if (referenceAccount.getFirstName().equals(firstName)) {
                    if (superUser.isSuperUser()) {
                        this.Users.remove(i);
                        break;
                    }
                }
            }
        }
    }

    /**
     * get a certain account of a user
     *
     * @param lastN  the last name of the user
     * @param firstN the first name of the user
     * @return the account that has been founded, in case the account is not found null is returned
     */
    public Account getUser(String lastN, String firstN) {
        Account referenceAccount = new Account(null, null, 0, 0, false, null, null, null);

        for (Account account : this.Users) {
            referenceAccount = account;
            if (referenceAccount.getLastName().equals(lastN)) {
                if (referenceAccount.getFirstName().equals(firstN)) {
                    break;
                }

            } else {
                referenceAccount = null;
            }

        }
        return referenceAccount;
    }

    /**
     * update the account of a certain user
     *
     * @param firstName      the first name of the user
     * @param lastName       the last name of the user
     * @param Age            the age of the user
     * @param Height         the height of the user
     * @param familyPosition the family position of the user
     * @param Password       the password pf the account
     * @param newLastName    the new last name of the user
     * @param newFirstName   the new first name of the user
     * @param newPassword    the new password of the account
     */
    void updateUser(String firstName, String lastName, int Age, float Height, String familyPosition, String Password, String newLastName, String newFirstName, String newPassword) {
        Account referenceAccount = getUser(lastName, firstName);
        if (referenceAccount != null) {
            if (referenceAccount.getPassword().equals(Password)) {
                int indexOfAccount = this.Users.indexOf(referenceAccount);
                referenceAccount.setDateOfCreation(referenceAccount.getDateOfCreation());
                referenceAccount.setPassword(newPassword);
                referenceAccount.setSuperUser(referenceAccount.isSuperUser());
                referenceAccount.setAge(Age);
                referenceAccount.setFamilyPosition(familyPosition);
                referenceAccount.setHeight(Height);
                referenceAccount.setFirstName(newFirstName);
                referenceAccount.setLastName(newLastName);
                this.Users.remove(indexOfAccount);
                this.Users.add(indexOfAccount, referenceAccount);

            }
        }
    }
}
