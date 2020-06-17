
package GUI;
import java.awt.*;
import static java.awt.Font.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Planner extends JFrame {
     
     JList l;
     Font f = new Font (SERIF, Font.ROMAN_BASELINE, 16);
     String [] p = {" ","Wedding Planners","Officiant","Hotels","Venues","Decorations","Entertainment",
                    "Buffet & Catering","Bride","Groom"};
     
     WPlannersList w = new WPlannersList();
   //  OfficiantsList o = new OfficiantsList();
     HotelsList h = new HotelsList();
     VenuesList v = new VenuesList();
     DecorationsList d = new DecorationsList();
     EntList en = new EntList();
     BuffetList b = new BuffetList();
     BrideChoices br = new BrideChoices();
     GroomChoices g = new GroomChoices();
    
    public Planner() {
        
     setSize (250, 300);
     setTitle ("Planner");
     Container c = getContentPane();
     c.setLayout(null);
       
     l = new JList (p);
     l.addListSelectionListener(new Listener ());
     l.setFont(f);
     l.setBounds(0, 0, 250, 300);
     c.add(l);
    }
    
     public class Listener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
           
          String s =  (String) l.getSelectedValue();
          
          if (s == "Wedding Planners")
              w.setVisible(true);
//          else if (s == "Officiant")
//              o.setVisible(true);
          else if (s == "Hotels")
              h.setVisible(true);
          else if (s == "Venues")
              v.setVisible(true);
          else if (s == "Decorations")
              d.setVisible(true);
          else if (s == "Entertainment")
              en.setVisible(true);
          else if (s == "Buffet & Catering")
              b.setVisible(true);
          else if (s == "Bride")
              br.setVisible(true);
          else if (s == "Groom")
              g.setVisible(true);
              
        }
    }
}
