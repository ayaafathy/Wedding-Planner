
package WeddVendors.Decorations;

import GUI.FloristsDashBoardGUI;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class Florists implements Serializable {
         
         
     private String flowers;
     private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\florist.dat";

    public Florists(String flowers) {
        this.flowers = flowers;
    }

    public Florists() {
        this.flowers="";
 }

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }
    
    //public void dispInfo(){
 //       System.out.println(getFlowers());
 //   }
    
    public void add(){
        ArrayList <Florists> Fflowers = (ArrayList<Florists>) BinaryFiles.readFromFile(path);
            if (Fflowers == null ){
                Fflowers = new ArrayList <>();}
            
           Fflowers.add(this);
        try {
            BinaryFiles.writeInFile(path, Fflowers);
        } catch (IOException ex) {
            Logger.getLogger(Florists.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
   public boolean save() throws FileNotFoundException, IOException{
       try {
           ObjectOutputStream fileOutputStream=new ObjectOutputStream(new FileOutputStream ("Florists.dat"));
           
           fileOutputStream.writeObject(FloristsDashBoardGUI.FloristsArrayList);
           fileOutputStream.close();
           return true;
           
      } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
            
          
        }
         
    }
   
   
   
   public boolean load() throws FileNotFoundException, IOException, ClassNotFoundException{
       try{
           
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("Florists.dat"));
           FloristsDashBoardGUI.FloristsArrayList=(ArrayList<Florists>)fileInputStream.readObject();
           return true;
      } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
         }
         
    }
   
     
public boolean delelte (String id) 
    {
        try {
            ArrayList <Florists> o = (ArrayList<Florists>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (o != null ){
                for ( int i = 0; i < o.size() && index == -1; i++ ){
                    Florists obj = o.get(index);
                    if (obj.getFlowers() == null ? id == null : obj.getFlowers().equals(flowers))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            o.remove(index);
            BinaryFiles.writeInFile(path, o);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Officiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
     
   
   
}
