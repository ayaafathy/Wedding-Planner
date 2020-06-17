
package WeddVendors;

import GUI.DJDashBoardGUI;
import GUI.TransDashBoardGUI;
import System.*;
import WeddVendors.Entertainment.DJ;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Transportation implements Serializable {
    private String carType;
    private String carID;
    private String carCost;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\transportations.dat";
    ArrayList<Transportation> t = new ArrayList<>();

    public Transportation(String carType, String carID, String carCost) {
        this.carType = carType;
        this.carID = carID;
        this.carCost = carCost;
    }

     public Transportation() {
        this.carType = " ";
        this.carID = " ";
        this.carCost = " ";
    }

    
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getCarCost() {
        return carCost;
    }

    public void setCarCost(String carCost) {
        this.carCost = carCost;
    }
    
public void add() 
    {
            ArrayList <Transportation> t = (ArrayList<Transportation>) BinaryFiles.readFromFile(path);
            if (t == null ){
                t = new ArrayList <>();}
            
            t.add(this);
        try {
            BinaryFiles.writeInFile(path, t);
        } catch (IOException ex) {
            Logger.getLogger(Transportation.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    


public boolean save() throws FileNotFoundException, IOException{
       try{
           ObjectOutputStream fileOutputStream =new ObjectOutputStream(new FileOutputStream("transportations.dat"));
           
           fileOutputStream.writeObject(TransDashBoardGUI.TransArrayList);
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
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("transportations.dat"));
           TransDashBoardGUI.TransArrayList=(ArrayList<Transportation>)fileInputStream.readObject();
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
            ArrayList <Transportation> t = (ArrayList<Transportation>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (t != null ){
                for ( int i = 0; i < t.size() && index == -1; i++ ){
                    Transportation obj = t.get(index);
                    if (obj.getCarID()== null ? id == null : obj.getCarID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            t.remove(index);
            BinaryFiles.writeInFile(path, t);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Transportation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
      
    public ArrayList<Transportation> display (){
    
    try{
    ObjectInputStream readObj = new ObjectInputStream (new FileInputStream (path));
    t =(ArrayList<Transportation>)readObj.readObject();
    readObj.close();
    }
    catch (Exception e)
            {
              e.printStackTrace();
            }
        return t;
    }
    
    
    
}
