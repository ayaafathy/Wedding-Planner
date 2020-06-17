
package WeddVendors.WeddBuffet;

import GUI.CheifDashBoardGUI;
import GUI.DJDashBoardGUI;
import java.util.*;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;
import WeddVendors.Entertainment.DJ;



public class Cheif extends WeddVendors.Vendors implements Serializable{
    
        private int cheifSalary;
     
        private ArrayList <Cheif> Cheifs = new ArrayList <Cheif> ();
         private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\cheif.dat";

        public Cheif() {
        super();
        this.cheifSalary = 0;
    } 
        

    public Cheif(int cheifSalary, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.cheifSalary = cheifSalary;
    } 
        

    public double getCheifSalary() {
        return cheifSalary;
    }

    public void setCheifSalary(int cheifSalary) {
        this.cheifSalary = cheifSalary;
    }

 public void add(){
     ArrayList <Cheif> Ccook = (ArrayList<Cheif>) BinaryFiles.readFromFile(path);
            if (Ccook == null ){
                Ccook = new ArrayList <>();}
            
           Ccook.add(this);
        try {
            BinaryFiles.writeInFile(path, Ccook);
        } catch (IOException ex) {
            Logger.getLogger(Cheif.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
 public boolean save() throws FileNotFoundException, IOException{
       try{
           ObjectOutputStream fileOutputStream =new ObjectOutputStream(new FileOutputStream("Cheif.dat"));
           
           fileOutputStream.writeObject(CheifDashBoardGUI.CheifArrayList);
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
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("Cheif.dat"));
           CheifDashBoardGUI.CheifArrayList=(ArrayList<Cheif>)fileInputStream.readObject();
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
            ArrayList <Cheif> Ccook = (ArrayList<Cheif>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (Ccook != null ){
                for ( int i = 0; i < Ccook.size() && index == -1; i++ ){
                    Cheif obj = Ccook.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            Ccook.remove(index);
            BinaryFiles.writeInFile(path, Ccook);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Cheif.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    
 }

}
