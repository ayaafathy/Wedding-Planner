
package WeddVendors.Beauty;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class Hairdresser extends Vendors implements Serializable {
     private double Salary;
     private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\hairdressers.dat";

    public Hairdresser(double Salary, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.Salary = Salary;
    }
    
    public Hairdresser() {
        super();
        this.Salary = 0.0;
    }
    

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
   public void add(){
       ArrayList <Hairdresser> HWomanHair = (ArrayList<Hairdresser>) BinaryFiles.readFromFile(path);
            if (HWomanHair == null ){
                HWomanHair = new ArrayList <>();}
            
           HWomanHair.add(this);
        try {
            BinaryFiles.writeInFile(path, HWomanHair);
        } catch (IOException ex) {
            Logger.getLogger(Hairdresser.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <Hairdresser> HWomanHair = (ArrayList<Hairdresser>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (HWomanHair != null ){
                for ( int i = 0; i < HWomanHair.size() && index == -1; i++ ){
                    Hairdresser obj = HWomanHair.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            HWomanHair.remove(index);
            BinaryFiles.writeInFile(path, HWomanHair);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Hairdresser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
   }

