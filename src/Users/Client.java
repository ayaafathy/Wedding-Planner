
package Users;

import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client extends User implements Serializable{
    
    public projDate wDate; 
    private double budget;
    private String gender;
    private String partnerName;
    private String PhoneNumber;
    private String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\clients.dat";  

    public Client(projDate wDate ,double budget,String gender ,String partnerName ,String PhoneNumber, String userFullName, String username, String userID, String userEmail, String userPassword) {
        super(userFullName, username, userID, userEmail, userPassword);
        this.wDate = wDate;
        this.partnerName = partnerName;
        this.gender = gender;
        this.budget = budget;
        this.PhoneNumber = PhoneNumber;
    }
    
   public Client() {
        super();
        this.wDate = null;
        this.partnerName = "";
        this.gender = " ";
        this.budget = 0.0 ;
        this.PhoneNumber = " ";
    }

    public projDate getwDate() {
        return wDate;
    }

    public void setwDate(projDate wDate) {
        this.wDate = wDate;
    }
   
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
   
    
    
   public void add() 
    {
            ArrayList <Client> c = (ArrayList<Client>) BinaryFiles.readFromFile(path);
            if (c == null ){
                c = new ArrayList <>();}
            
            c.add(this);
        try {
            BinaryFiles.writeInFile(path, c);
        } 
        catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
public boolean delelte (String id)
    {
        try {
            ArrayList <Client> c = (ArrayList<Client>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (c != null ){
                for ( int i = 0; i < c.size() && index == -1; i++ ){
                    Client obj = c.get(index);
                    if (obj.getUserID() == null ? id == null : obj.getUserID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            c.remove(index);
            BinaryFiles.writeInFile(path, c);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    
}
