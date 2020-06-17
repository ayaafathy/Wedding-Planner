

package WeddVendors;
import GUI.HotelDashboard;
import System.BinaryFiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hotel extends Vendors implements Serializable {

    private String hotelRate;
 //   private ArrayList <Room> rooms = new ArrayList <Room> ();
    private  String path = "hotels.dat";
  
    public Hotel(String hotelRate, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.hotelRate = hotelRate;
    }

    public String getHotelRate() {
        return hotelRate;
    }
      public void setHotelRate(String hotelRate) {
        this.hotelRate = hotelRate;
    }

    public Hotel() {
        super();
        this.hotelRate = "";
    }
    
     public void add() 
    {
            ArrayList <Hotel> o = (ArrayList<Hotel>) BinaryFiles.readFromFile(path);
            if (o == null ){
                o = new ArrayList <>();}
            
            o.add(this);
        try {
            BinaryFiles.writeInFile(path, o);
        } catch (IOException ex) {
            Logger.getLogger(Officiant.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public boolean save() {
      
        try {
           //todo : Write object to binary file
            ObjectOutputStream fileOutputStream = new ObjectOutputStream(new FileOutputStream("Student.dat"));
           fileOutputStream.writeObject(HotelDashboard.HotelssArrayList);
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
            
          
        }
         
    }

  

    public boolean load() {
       
        try {
            ObjectInputStream   fileInputStream = new ObjectInputStream(new FileInputStream("Student.dat"));
            HotelDashboard.HotelssArrayList= (ArrayList<Hotel>)fileInputStream.readObject();
           //todo : Read array of students from binary file
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
            ArrayList <Hotel> o = (ArrayList<Hotel>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (o != null ){
                for ( int i = 0; i < o.size() && index == -1; i++ ){
                    Hotel obj = o.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            o.remove(index);
            BinaryFiles.writeInFile(path, o);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
      
}