
package GUI;

import java.awt.*;
import javax.swing.*;
import static java.awt.Font.*;


public class BrideChoices extends JFrame {

    String [] hddata = {"Mounir" ,"Tonya" , "Hair'n Flair" ,"Kris" ,"Diva Line"};
    String [] bdata = {"Krara" , "Women House" , "Hers" , "La Beauté" , "J Beauty" };
    JLabel hds, beau;
    JList hdList, bList;
    
    public BrideChoices() {
   
    setSize (350,300);
    setTitle ("Bride Care");
    Container c = getContentPane();
    c.setLayout(new GridLayout(2,2));
    
    hds = new JLabel ("Hairdressers:");
    beau = new JLabel ("Beauticians:");
    hdList = new JList (hddata);
    bList = new JList (bdata);

    c.add (hds);
    c.add (hdList);
    c.add (beau);
    c.add (bList);  
    
    }
    
    
}
