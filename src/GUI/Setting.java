
package GUI;
import java.awt.*;
import static java.awt.Font.*;
import javax.swing.*;


public class Setting extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7;
    
    public Setting() throws HeadlessException {
        
        setSize (400,300);
        setTitle ("Setting");
        Container c = getContentPane();
        c.setLayout(new GridLayout(2,2));
        
        JPanel ppane = new JPanel ();
        ppane.setLayout(null);
        
        l1 = new JLabel("Profile Setting");
        l2 = new JLabel ("Personal");
        l3 = new JLabel ("Full Name");
        l4 = new JLabel ("Gender");
        l7 = new JLabel ("E-mail Address");
        l5 = new JLabel ("partner");
        l6 = new JLabel ("Full Name");

        
        
        
        
        
        JPanel wpane = new JPanel ();
        wpane.setLayout(null);
        
        JLabel jl1 = new JLabel("Wedding Setting");
        JLabel jl2 = new JLabel("Budget");
        JLabel jl3 = new JLabel("Date of the Ceremony");


        
    }
}
