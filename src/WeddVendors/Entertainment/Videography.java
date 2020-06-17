
package WeddVendors.Entertainment;
import System.*;
import WeddVendors.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;



public class Videography extends Vendors implements Serializable{
    
    private double videographerSalary;
    private String videoTheme;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\videographers.dat";
        
    public Videography(double videographerSalary, String videoTheme, String name, String website, String phoneNumber, String ID) {
        super(name, website, phoneNumber, ID);
        this.videographerSalary = videographerSalary;
        this.videoTheme = videoTheme;
    }
    
    public Videography() {
        super();
        this.videographerSalary = 0.0;
        this.videoTheme = "";
    }

    public double getVideographerSalary() {
        return videographerSalary;
    }

    public void setVideographerSalary(double videographerSalary) {
        this.videographerSalary = videographerSalary;
    }

    public String getVideoTheme() {
        return videoTheme;
    }

    public void setVideoTheme(String videoTheme) {
        this.videoTheme = videoTheme;
    }
    
    public void add (){
    
     ArrayList <Videography> v = (ArrayList<Videography>) BinaryFiles.readFromFile(path);
            if (v == null ){
                v = new ArrayList <>();}
            
          v.add(this);
        try {
            BinaryFiles.writeInFile(path, v);
        } catch (IOException ex) {
            Logger.getLogger(Videography.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <Videography> Video = (ArrayList<Videography>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (Video != null ){
                for ( int i = 0; i < Video.size() && index == -1; i++ ){
                    Videography obj = Video.get(index);
                    if (obj.getID() == null ? id == null : obj.getID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            Video.remove(index);
            BinaryFiles.writeInFile(path, Video);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Videography.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
}
