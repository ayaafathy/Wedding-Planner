
package GUI;
import java.awt.*;
import javax.swing.*;

public class RegisterForm extends JFrame{
    
     JLabel l1, l2, l3, l4, l5, l6, l7, l8;
     JTextField t1, t2, t3, t4, t5;
     JPasswordField p1, p2;
     JRadioButton button1, button2;
     JButton b1, b2;
     ButtonGroup bg ;
    
     public RegisterForm ()
     {
      setSize (570 , 620);
      setTitle ("Register Form ");
      Container c = getContentPane();
      c.setLayout(null);

     
     l1 = new JLabel("Full Name ");
     l2 = new JLabel("Gender ");
     l3 = new JLabel("E-mail Adress ");
     l4 = new JLabel("Phone Number ");
     l5 = new JLabel("National ID ");
     l6 = new JLabel("Username ");
     l7 = new JLabel("Create a new Password ");
     l8 = new JLabel("Re-write Password ");

     l1.setBounds(50,20,200,40);
     l2.setBounds (50,70,200,40);
     l3.setBounds(50,120,200,40);
     l4.setBounds(50,170,200,40);     
     l5.setBounds(50,220,200,40);     
     l6.setBounds(50,270,200,40);
     l7.setBounds(50,320,200,40);
     l8.setBounds(50,370,200,40);

     
     t1 = new JTextField();
     t2 = new JTextField();
     t3 = new JTextField();
     t4 = new JTextField();
     t5 = new JTextField();
     p1 = new JPasswordField ();
     p2 = new JPasswordField();
     button1 = new JRadioButton("Male", false); 
     button2 = new JRadioButton("Female", false);
     
     t1.setBounds(250, 20, 200, 30);
     button1.setBounds(250, 70, 100, 30);
     button2.setBounds(350, 70, 100, 30);
     t2.setBounds(250, 120, 200, 30);
     t3.setBounds(250, 170, 200, 30);
     t4.setBounds(250, 220, 200, 30);
     t5.setBounds(250, 270, 200, 30);
     p1.setBounds(250, 320, 200, 30);
     p2.setBounds(250, 370, 200, 30);

     b1 = new JButton("Back");
     b2 = new JButton("Next");
     
     b1.setBounds(50, 450, 100, 40);
     b2.setBounds(350, 450, 100, 40);
     
     bg = new ButtonGroup();
     bg.add(button1);
     bg.add(button2);
    
     c.add(l1);
     c.add(l2);
     c.add(l3);
     c.add(l4);
     c.add(l5);
     c.add(l6);
     c.add(l7);
     c.add(l8);
     c.add(t1);
     c.add(t2);
     c.add(t3);
     c.add(t4);
     c.add(t5);
     c.add(p1);
     c.add(p2);
     c.add(button1);
     c.add(button2);
     c.add(b1);
     c.add(b2);

       }
}