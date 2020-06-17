
package Users;

import java.util.*;


public class User {
    
    protected String userFullName;
    protected  String username;
    protected String userID;
    protected String userEmail;
    protected String userPassword;
  

    public User(String userFullName, String username, String userID, String userEmail, String userPassword) {
        this.userFullName = userFullName;
        this.username = username;
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    
    }
    public User() {
        this.userFullName = "";
        this.username = "";
        this.userID = "";
        this.userEmail = "";
        this.userPassword = "";
    
    }
 
    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

   
    
//    public void signup()
//    {
//        
//    }
//    
//    public void login(String userEmail, String userPassword)
//    {
//       
//        
//    }
//
//    public void updateInfo()
//    {
//        
//    }
    
    
}
