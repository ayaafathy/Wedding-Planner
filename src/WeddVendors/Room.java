
package WeddVendors;

import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class Room implements Serializable{
    
    private String roomType;
    private String roomView;
    private int roomCapacity;
    private int roomNumber;
    private double roomPrice;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\Rooms.dat";
  
    public Room(String roomType, String roomView, int roomCapacity, int roomNumber, double roomPrice) {
        this.roomType = roomType;
        this.roomView = roomView;
        this.roomCapacity = roomCapacity;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
    }
    
     public Room() {
        this.roomType = "";
        this.roomView = "";
        this.roomCapacity = 0;
        this.roomNumber = 0;
        this.roomPrice = 0;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomView() {
        return roomView;
    }

    public void setRoomView(String roomView) {
        this.roomView = roomView;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }
    

   public void add (){
       
   ArrayList <Room> Rarea = (ArrayList<Room>) BinaryFiles.readFromFile(path);
            if (Rarea == null ){
                Rarea = new ArrayList <>();}
            
           Rarea.add(this);
        try {
            BinaryFiles.writeInFile(path, Rarea);
        } catch (IOException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
   
}
