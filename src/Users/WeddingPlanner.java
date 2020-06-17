
package Users;


import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JList;


public class WeddingPlanner  implements Serializable
{
  
    private double wpSalary;
    private String wpPhoneNumber;
    private String ID;
    private String FullName;
    private String path = "D:\\MIU\\OOP\\Project\\Binary\\wplanners.dat";  
    

    public WeddingPlanner( double wpSalary, String wpPhoneNumber, String FullName ,String ID) {
       
       
        this.wpSalary = wpSalary;
        this.wpPhoneNumber = wpPhoneNumber;
        this.FullName=  FullName;
        this.ID = ID;
        
    }
    
 public WeddingPlanner() {
       
        
        this.wpSalary = 0.0;
        this.wpPhoneNumber = "";
        this.FullName=  "";
        this.ID = "";
        

    }

 
    public double getWpSalary() {
        return wpSalary;
    }

    public void setWpSalary(double wpSalary) {
        this.wpSalary = wpSalary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getWpPhoneNumber() {
        return wpPhoneNumber;
    }

    public void setWpPhoneNumber(String wpPhoneNumber) {
        this.wpPhoneNumber = wpPhoneNumber;
    }

    
       
      public void add() 
    {
            ArrayList <WeddingPlanner> c = (ArrayList<WeddingPlanner>) BinaryFiles.readFromFile("wplanners.dat");
           
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


    public boolean delelte (String id) throws EOFException, IOException
    {
       
            ArrayList <WeddingPlanner> w = (ArrayList<WeddingPlanner>) BinaryFiles.readFromFile("wplanners.dat");
            int index = -1;
            
            if (w != null ){
                for ( int i = 0; i < w.size() && index == -1; i++ ){
                    WeddingPlanner obj = w.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }
            }
            if (index == -1){
                return false;
            }
            
            w.remove(index);
            BinaryFiles.writeInFile("wplanners.dat", w);
            return true;
       
    }

        





}
