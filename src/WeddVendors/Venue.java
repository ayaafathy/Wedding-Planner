
package WeddVendors;

import GUI.OfficiantDashBoardGUI;
import GUI.VenuesDashBoardGUI;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Venue extends Vendors implements Serializable{
    private String venueRate;
    private String venueSetting;
    private int venueCapacity;
    private int venuePrice;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\venues.dat";
    ArrayList <Venue> v = new ArrayList <Venue> ();

   
    public Venue(String venueRate, String venueSetting, int venueCapacity, int venuePrice, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.venueRate = venueRate;
        this.venueSetting = venueSetting;
        this.venueCapacity = venueCapacity;
        this.venuePrice = venuePrice;
    }
    
    public Venue() {
        super();
        this.venueRate = "";
        this.venueSetting = "";
        this.venueCapacity = 0;
        this.venuePrice = 0;
    }
    
    
    public String getVenueRate() {
        return venueRate;
    }

    public void setVenueRate(String venueRate) {
        this.venueRate = venueRate;
    }

    public String getVenueSetting() {
        return venueSetting;
    }

    public void setVenueSetting(String venueSetting) {
        this.venueSetting = venueSetting;
    }

    public int getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(int venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public double getVenuePrice() {
        return venuePrice;
    }

    public void setVenuePrice(int venuePrice) {
        this.venuePrice = venuePrice;
    }
    
    public void add() 
    {
            ArrayList <Venue> v = (ArrayList<Venue>) BinaryFiles.readFromFile(path);
            if (v == null ){
                v = new ArrayList <>();}
            
            v.add(this);
        try {
            BinaryFiles.writeInFile(path, v);
        } catch (IOException ex) {
            Logger.getLogger(Venue.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean save() throws FileNotFoundException, IOException{
       try{
           ObjectOutputStream fileOutputStream =new ObjectOutputStream(new FileOutputStream("venues.dat"));
           
           fileOutputStream.writeObject(VenuesDashBoardGUI.venuesArrayList);
           fileOutputStream.close();
           return true;
       } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
            
          
        }
    }
    
    public boolean load() throws FileNotFoundException, IOException{
       try{
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("venues.dat"));
           VenuesDashBoardGUI.venuesArrayList=(ArrayList<Venue>)fileInputStream.readObject();
           return true;
       } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
            
        }
    }
    
    
    
    
    
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <Venue> v = (ArrayList<Venue>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (v != null ){
                for ( int i = 0; i < v.size() && index == -1; i++ ){
                    Venue obj = v.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            v.remove(index);
            BinaryFiles.writeInFile(path, v);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Venue.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public ArrayList<Venue> display (){
    
    try{
    ObjectInputStream readObj = new ObjectInputStream (new FileInputStream (path));
    v =(ArrayList<Venue>)readObj.readObject();
    readObj.close();
    }
    catch (Exception e)
            {
              e.printStackTrace();
            }
        return v;
    
    }
    
}
