
package GUI;
import java.awt.*;
import javax.swing.*;

public class GroomChoices extends JFrame  {

    JLabel barbers;
    JList bList;
    String [] bdata = {"Ahmed n Abdo" ,"Hany Rabea" , "Men in Style"};
   
    public GroomChoices() {
    
    setSize (300,250);
    setTitle ("Groom Care");
    Container c = getContentPane();
    c.setLayout(new GridLayout(2,2));

    barbers = new JLabel ("Barbers:");
    bList = new JList (bdata);
    c.add (barbers);
    c.add (bList);
    
    
    }   
}
