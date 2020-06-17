
package GUI;
import java.awt.*;
import static java.awt.Font.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Organizer extends JFrame {

    Font f = new Font (SERIF, Font.ROMAN_BASELINE, 16);
    String [] org = {"" , "ToDo List" , "CheckList" , "Notes" };
    JList l; 
    ToDoList t = new ToDoList();
    CheckList c = new CheckList();
    Notes n = new Notes ();
     
    public Organizer() {
     
     setSize (250, 250);
     setTitle ("Organizer");
     Container c = getContentPane();
     c.setLayout(null);
     
     l = new JList (org);
     l.setFont(f);
     l.setBounds(0, 0, 250, 250);
     l.addListSelectionListener(new Listener());
     c.add(l);
    }
    
    public class Listener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
           
          String s =  (String) l.getSelectedValue();
          
          if (s == "ToDo List")
            t.setVisible(true);
          else if (s == "CheckList")    
            c.setVisible(true);
          else if (s == "Notes")    
            n.setVisible(true);

        }
    }
}
    
