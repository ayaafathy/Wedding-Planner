
package WeddVendors.Entertainment;
import GUI.PhotographyDashBoardGUI;
import System.*;
import WeddVendors.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Photography extends Vendors implements Serializable{
    
    private int photographySalary;
    private String photosTheme;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\photographers.dat";

    public Photography(int photographySalary, String photosTheme, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.photographySalary = photographySalary;
        this.photosTheme = photosTheme;
    }
    
    public Photography() {
        super();
        this.photographySalary = 0;
        this.photosTheme = "";
    }

    public double getPhotographySalary() {
        return photographySalary;
    }

    public void setPhotographySalary(int photographySalary) {
        this.photographySalary = photographySalary;
    }

    public String getPhotosTheme() {
        return photosTheme;
    }

    public void setPhotosTheme(String photosTheme) {
        this.photosTheme = photosTheme;
    }
    
    public void add() 
    {        
    ArrayList <Photography> p = (ArrayList<Photography>) BinaryFiles.readFromFile(path);
            if (p == null ){
                p = new ArrayList <>();}
            
            p.add(this);
        try {
            BinaryFiles.writeInFile(path, p);
        } catch (IOException ex) {
            Logger.getLogger(Photography.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
      public boolean save() throws FileNotFoundException, IOException{
       try{
           ObjectOutputStream fileOutputStream =new ObjectOutputStream(new FileOutputStream("Photography.dat"));
           
           fileOutputStream.writeObject(PhotographyDashBoardGUI.PhotographyArrayList);
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
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("Photography.dat"));
           PhotographyDashBoardGUI.PhotographyArrayList=(ArrayList<Photography>)fileInputStream.readObject();
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
            ArrayList <Photography> p = (ArrayList<Photography>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (p != null ){
                for ( int i = 0; i < p.size() && index == -1; i++ ){
                    Photography obj = p.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            p.remove(index);
            BinaryFiles.writeInFile(path, p);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Photography.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
}
