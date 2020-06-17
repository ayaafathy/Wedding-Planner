package WeddVendors;


import GUI.OfficiantDashBoardGUI;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Officiant extends Vendors implements Serializable{
    
    private int offSalary;
    private String title;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\officiants.dat";


 public Officiant( ) {
        super();
        this.offSalary = 0;
        this.title = " ";
    }
   
   
    public Officiant(int offSalary, String title, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.offSalary = offSalary;
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOffSalary() {
        return offSalary;
    }

    public void setOffSalary(int offSalary) {
        this.offSalary = offSalary;
    }

   public void add() 
    {
            ArrayList <Officiant> o = (ArrayList<Officiant>) BinaryFiles.readFromFile(path);
            if (o == null ){
                o = new ArrayList <>();}
            
            o.add(this);
        try {
            BinaryFiles.writeInFile(path, o);
        } catch (IOException ex) {
            Logger.getLogger(Officiant.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
   
   public boolean save() throws FileNotFoundException, IOException{
       try{
           ObjectOutputStream fileOutputStream =new ObjectOutputStream(new FileOutputStream("officiants.dat"));
           
           fileOutputStream.writeObject(OfficiantDashBoardGUI.OfficiantArrayList);
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
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("officiants.dat"));
           OfficiantDashBoardGUI.OfficiantArrayList=(ArrayList<Officiant>)fileInputStream.readObject();
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
            ArrayList <Officiant> o = (ArrayList<Officiant>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (o != null ){
                for ( int i = 0; i < o.size() && index == -1; i++ ){
                    Officiant obj = o.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
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