
package WeddVendors;

import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

    public class Tables implements Serializable {
    private String tableShape;
    private String tableType;
     private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\tables.dat";

    public String getTableShape() {
        return tableShape;
    }

    public void setTableShape(String tableShape) {
        this.tableShape = tableShape;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
    
    
    public void dispInfo(){
        System.out.println(getTableShape());
   System.out.println(getTableType());
    }
    public void add(){
        
    ArrayList <Tables> Table = (ArrayList<Tables>) BinaryFiles.readFromFile(path);
            if (Table == null ){
                Table = new ArrayList <>();}
            
           Table.add(this);
        try {
            BinaryFiles.writeInFile(path, Table);
        } catch (IOException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
   
}
