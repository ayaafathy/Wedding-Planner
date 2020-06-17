
package WeddVendors.Beauty ;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class Barber extends Vendors implements Serializable {
    private double Salary;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\barbers.dat";


    public Barber(double Salary, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.Salary = Salary;
    }

    public Barber() {
        super();
        this.Salary = 0.0 ;
    }
    
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
 public void add(){
    ArrayList <Barber> BManHairCut = (ArrayList<Barber>) BinaryFiles.readFromFile(path);
            if (BManHairCut == null ){
                BManHairCut = new ArrayList <>();}
            
           BManHairCut.add(this);
        try {
            BinaryFiles.writeInFile(path, BManHairCut);
        } catch (IOException ex) {
            Logger.getLogger(Barber.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <Barber> BManHairCut = (ArrayList<Barber>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (BManHairCut != null ){
                for ( int i = 0; i < BManHairCut.size() && index == -1; i++ ){
                    Barber obj = BManHairCut.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            BManHairCut.remove(index);
            BinaryFiles.writeInFile(path, BManHairCut);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Barber.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}

