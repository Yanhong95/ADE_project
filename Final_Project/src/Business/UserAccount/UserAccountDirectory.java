/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<User> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userAccountList;
    }
    
    public User authenticateUser(long userID, String password){
        for (User ua : userAccountList)
            if (userID==ua.getUserID() && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
}
