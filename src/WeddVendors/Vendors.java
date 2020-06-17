
package WeddVendors;

import java.util.*;
import Users.*;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class Vendors implements Serializable{
    
    protected String name;
    protected String website;
    protected String phoneNumber;
    protected String ID;
     private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\vendors.dat";

    public Vendors( ) {
        this.name = "";
        this.website = "";
        this.phoneNumber = " ";
        this.ID = "";
    }
    
    public Vendors(String name, String website, String phoneNumber, String ID) {
        this.name = name;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

     public void add(){
         ArrayList <Vendors> Vtrader = (ArrayList<Vendors>) BinaryFiles.readFromFile(path);
            if (Vtrader == null ){
                Vtrader = new ArrayList <>();}
            
           Vtrader.add(this);
        try {
            BinaryFiles.writeInFile(path, Vtrader);
        } catch (IOException ex) {
            Logger.getLogger(Vendors.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <Vendors> Vtrader = (ArrayList<Vendors>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (Vtrader != null ){
                for ( int i = 0; i < Vtrader.size() && index == -1; i++ ){
                    Vendors obj = Vtrader.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            Vtrader.remove(index);
            BinaryFiles.writeInFile(path, Vtrader);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Vendors.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
     }
    

