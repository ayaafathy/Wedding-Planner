
package WeddVendors.Beauty;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class Beautician extends Vendors implements Serializable{
    private double Salary;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\beauticians.dat";


    public Beautician(double Salary, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.Salary = Salary;
    }
    
    public Beautician() {
        super();
        this.Salary = 0.0;
    }
    
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

  
}
