
package GUI;
import java.awt.*;
import static java.awt.Font.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class MainMenu extends JFrame {

    JList l;
    String [] menu = { "Organizer" , "Budget" , "Payment" , "Guests" , "Booked Vendors" , "Planner" , "Setting" };
    Font f = new Font (SERIF, Font.ROMAN_BASELINE, 16);
    
    Organizer o = new Organizer ();
//    Budget b = new Budget ();
//    Payment p = new Payment ();
    Guests g = new Guests();
//    BookedVendors bv = new Bookedvendors ();
    Planner pl = new Planner ();
    Setting set = new Setting ();
    
   public MainMenu()  {
        
     setSize (250, 250);
     setTitle ("Menu");
     Container c = getContentPane();
     c.setLayout(null);
     
     l = new JList (menu);
     l.setFont(f);
     l.setBounds(0, 0, 250, 250);
     l.addListSelectionListener(new Listener());
     c.add(l);
    }
   
 public class Listener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
           
          String s =  (String) l.getSelectedValue();
          
          if (s == "Organizer")
              o.setVisible(true);
//          else if (s == "Budget")
//              b.setVisible(true);
//          else if (s == "Payment")
//              p.setVisible(true);
//          else if (s == "Guests")
//              g.setVisible(true);
//          else if (s == "Booked Vendors")
//              bv.setVisible(true);
          else if (s == "Planner")
              pl.setVisible(true);
          else if (s == "Setting")
              set.setVisible(true);
          
              } 
      
 }  
    
}
