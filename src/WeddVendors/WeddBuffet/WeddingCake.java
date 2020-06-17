
package WeddVendors.WeddBuffet;

import java.util.*;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;


public class WeddingCake implements Serializable{
    
    private String flavour;
    private String colour;
    private String cakeID;
    private int noOfLevels;
    private double cakePrice;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\cake.dat";
    

    public WeddingCake(String flavour, String colour, String cakeID, int noOfLevels, double cakePrice) {
        this.flavour = flavour;
        this.colour = colour;
        this.cakeID = cakeID;
        this.noOfLevels = noOfLevels;
        this.cakePrice = cakePrice;
    }
    


    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCakeID() {
        return cakeID;
    }

    public void setCakeID(String cakeID) {
        this.cakeID = cakeID;
    }

    public int getNoOfLevels() {
        return noOfLevels;
    }

    public void setNoOfLevels(int noOfLevels) {
        this.noOfLevels = noOfLevels;
    }

    public double getCakePrice() {
        return cakePrice;
    }

    public void setCakePrice(double cakePrice) {
        this.cakePrice = cakePrice;
    }

   
    public void add(){
        
    ArrayList <WeddingCake> WeddCake = (ArrayList<WeddingCake>) BinaryFiles.readFromFile(path);
            if (WeddCake == null ){
                WeddCake = new ArrayList <>();}
            
           WeddCake.add(this);
        try {
            BinaryFiles.writeInFile(path, WeddCake);
        } catch (IOException ex) {
            Logger.getLogger(WeddingCake.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <WeddingCake> WeddCake = (ArrayList<WeddingCake>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (WeddCake != null ){
                for ( int i = 0; i < WeddCake.size() && index == -1; i++ ){
                    WeddingCake obj = WeddCake.get(index);
                    if (obj.getCakeID()== null ? id == null : obj.getCakeID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            WeddCake.remove(index);
            BinaryFiles.writeInFile(path, WeddCake);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(WeddingCake.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
   
}
