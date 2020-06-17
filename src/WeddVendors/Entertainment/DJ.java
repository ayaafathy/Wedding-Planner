
package WeddVendors.Entertainment;

import GUI.DJDashBoardGUI;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class DJ extends Vendors implements Serializable {
    
    private int djSalary;
    private ArrayList <String> playlist = new ArrayList <String> ();
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\djs.dat";

    public DJ(int djSalary, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.djSalary = djSalary;
    }

    public DJ() {
        super();
        this.djSalary = 0;
    }
    
    public int getDjSalary() {
        return djSalary;
    }

    public void setDjSalary(int djSalary) {
        this.djSalary = djSalary;
    }

    public ArrayList<String> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<String> playlist) {
        this.playlist = playlist;
    }
    
    public void add() {

    ArrayList <DJ> dj = (ArrayList<DJ>) BinaryFiles.readFromFile(path);
            if (dj == null ){
                dj = new ArrayList <>();}
            
           dj.add(this);
        try {
            BinaryFiles.writeInFile(path, dj);
        } catch (IOException ex) {
            Logger.getLogger(DJ.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean save() throws FileNotFoundException, IOException{
       try{
           ObjectOutputStream fileOutputStream =new ObjectOutputStream(new FileOutputStream("DJ.dat"));
           
           fileOutputStream.writeObject(DJDashBoardGUI.DJArrayList);
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
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("DJ.dat"));
           DJDashBoardGUI.DJArrayList=(ArrayList<DJ>)fileInputStream.readObject();
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
            ArrayList <DJ> dj = (ArrayList<DJ>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (dj != null ){
                for ( int i = 0; i < dj.size() && index == -1; i++ ){
                    DJ obj = dj.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            dj.remove(index);
            BinaryFiles.writeInFile(path, dj);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(DJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
 
}

