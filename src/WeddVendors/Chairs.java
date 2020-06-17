
package WeddVendors;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;


public class Chairs implements Serializable {
    private String  chairType;
    private String chairColor;
 private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\Chairs.dat";

    public String getChairType() {
        return chairType;
    }

    public void setChairType(String chairType) {
        this.chairType = chairType;
    }

    public String getchairColor() {
        return chairColor;
    }

    public void setchairColor(String chairColor) {
        this.chairColor = chairColor;
    }
    
    

  public void dispInfo()
  {
   System.out.println(getChairType());
   System.out.println(getchairColor());
   
}
  
  public void add (){
      ArrayList <Chairs> Csit = (ArrayList<Chairs>) BinaryFiles.readFromFile(path);
            if (Csit == null ){
                Csit = new ArrayList <>();}
            
           Csit.add(this);
        try {
            BinaryFiles.writeInFile(path, Csit);
        } catch (IOException ex) {
            Logger.getLogger(Chairs.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
   
}
