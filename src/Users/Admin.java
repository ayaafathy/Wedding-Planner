
package Users;

import System.*;
import WeddPayments.*;
import WeddVendors.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends User implements Serializable  {
   
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\admins.dat";

    public Admin(String userFullName, String username, String userID, String userEmail, String userPassword) {
        super(userFullName, username, userID, userEmail, userPassword); 
    }
    
    public Admin() {
        super(); 
    }
   
    public void add() 
    {
            ArrayList <Admin> a = (ArrayList<Admin>) BinaryFiles.readFromFile(path);
            if (a == null ){
                a = new ArrayList <>();}
            
            a.add(this);
        try {
            BinaryFiles.writeInFile(path, a);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <Admin> a = (ArrayList<Admin>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (a != null ){
                for ( int i = 0; i < a.size() && index == -1; i++ ){
                    Admin obj = a.get(index);
                    if (obj.getUserID() == null ? id == null : obj.getUserID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            a.remove(index);
            BinaryFiles.writeInFile(path, a);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
//   
//    Payment clientPayment(Payment CPayment)
//    {
//        return null;
//    }
//    
//    TodoList createToDo(TodoList ToDo)
//    {
//        return null;
//        
//    }
//    Notification generateNotifications(Notification not)
//    {
//        return null;
//    }
//    
//    void dispInvoice()
//    {
//        
//    }
//    
//    public void addWPlanner() 
//    {
//      
//    }
//    
// 
//    public void addOfficiant ()
//    {
//        
//    }
//
//
//    
}
