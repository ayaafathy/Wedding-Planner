
package WeddVendors.WeddBuffet;
import System.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import WeddVendors.*;

public class Menu implements Serializable{
     private String foodMenu;
     private String drinksMenu;
     private String menuID;
     private final String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\menu.dat"; 

    public Menu(String foodMenu, String drinksMenu, String menuID) {
        this.foodMenu = foodMenu;
        this.drinksMenu = drinksMenu;
        this.menuID = menuID;
    }

     public Menu( ) {
        this.foodMenu = "";
        this.drinksMenu = "";
        this.menuID = "";
    }
    
    public String getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(String foodMenu) {
        this.foodMenu = foodMenu;
    }

    public String getDrinksMenu() {
        return drinksMenu;
    }

    public void setDrinksMenu(String drinksMenu) {
        this.drinksMenu = drinksMenu;
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }
    
    
    public void add(){
        ArrayList <Menu> MFoodandDrinks = (ArrayList<Menu>) BinaryFiles.readFromFile(path);
            if (MFoodandDrinks == null ){
                MFoodandDrinks = new ArrayList <>();}
            
           MFoodandDrinks.add(this);
        try {
            BinaryFiles.writeInFile(path, MFoodandDrinks);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public boolean delelte (String id) 
    {
        try {
            ArrayList <Menu> MFoodandDrinks = (ArrayList<Menu>) BinaryFiles.readFromFile(path);
            int index = -1;
            
            if (MFoodandDrinks != null ){
                for ( int i = 0; i < MFoodandDrinks.size() && index == -1; i++ ){
                    Menu obj = MFoodandDrinks.get(index);
                    if (obj.getMenuID()== null ? id == null : obj.getMenuID().equals(id))
                        index = i;
                }}
            if (index == -1)
                return false;
            
            MFoodandDrinks.remove(index);
            BinaryFiles.writeInFile(path, MFoodandDrinks);
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    
    }
}
