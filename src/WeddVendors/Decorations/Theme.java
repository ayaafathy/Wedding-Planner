package WeddVendors.Decorations;

import GUI.ThemeDashBoardGUI;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;


public class Theme implements Serializable{
    private String themeStyle;
    private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\theme.dat";

    public Theme(String themeStyle) {
        this.themeStyle = themeStyle;
    }

    public Theme() {
        this.themeStyle="";
  }

    public String getThemeStyle() {
        return themeStyle;
    }

    public void setThemeStyle(String themeStyle) {
        this.themeStyle = themeStyle;
    }

   
    
   // public void dispInfo(){
     //   System.out.println(getThemeStyle());
    //}
    
    
    public void add(){
        ArrayList <Theme> theme = (ArrayList<Theme>) BinaryFiles.readFromFile(path);
            if (theme == null ){
                theme = new ArrayList <>();}
            
           theme.add(this);
        try {
            BinaryFiles.writeInFile(path, theme);
        } catch (IOException ex) {
            Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    public boolean save() throws FileNotFoundException, IOException{
       try {
           ObjectOutputStream fileOutputStream=new ObjectOutputStream(new FileOutputStream ("Theme.dat"));
           
           fileOutputStream.writeObject(ThemeDashBoardGUI.ThemeArrayList);
           fileOutputStream.close();
           return true;
           
      } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
            
          
        }
         
    }
    
     public boolean load() throws FileNotFoundException, IOException, ClassNotFoundException{
       try{
           
           ObjectInputStream fileInputStream=new ObjectInputStream(new FileInputStream("Theme.dat"));
           ThemeDashBoardGUI.ThemeArrayList=(ArrayList<Theme>)fileInputStream.readObject();
           return true;
      } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
         }
         
    }
    
    
 public boolean delelte (String id) 
    {
        try {
            ArrayList <Theme> o = (ArrayList<Theme>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (o != null ){
                for ( int i = 0; i < o.size() && index == -1; i++ ){
                    Theme obj = o.get(index);
                    if (obj.getThemeStyle()== null ? id == null : obj.getThemeStyle().equals(themeStyle))
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