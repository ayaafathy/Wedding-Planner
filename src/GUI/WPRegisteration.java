
package GUI;

import Users.*;
import java.awt.*;
import java.awt.event.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class WPRegisteration  extends JFrame implements Serializable{
    
     JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
     JTextField t1, t2, t3, t4, t5, t6;
     JPasswordField p1,p2;
     JRadioButton button1, button2, button3, button4;
     JButton b1, b2;
     ButtonGroup bg1, bg2 ;
     
    private static final Pattern userNamePattern = Pattern.compile("[a-zA-Z0-9_-]{6,14}$");
    private static Pattern passwordPattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
    private static Pattern emailPattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

     
     SigninForm s = new SigninForm();
     
     public static ArrayList <WeddingPlanner> w = new ArrayList <WeddingPlanner> ();
     public static WeddingPlanner wp = new WeddingPlanner ();
     
     public WPRegisteration ()
     {
      setSize (620 , 670);
      setTitle ("Wedding Planner Registeration Form ");
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
     l9 = new JLabel ("Salary ");
     l10 = new JLabel ("Availability ");
     
     l1.setBounds(50,20,200,40);
     l2.setBounds (50,70,200,40);
     l3.setBounds(50,120,200,40);
     l4.setBounds(50,170,200,40);     
     l5.setBounds(50,220,200,40);     
     l6.setBounds(50,270,200,40);
     l7.setBounds(50,320,200,40);
     l8.setBounds(50,370,200,40);
     l9.setBounds(50,420,200,40);
     l10.setBounds(50,470,200,40);

     t1 = new JTextField();
     t1.addActionListener(new AcListener());
     t2 = new JTextField();
     t2.addActionListener(new AcListener());
     t3 = new JTextField();     
     t3.addActionListener(new AcListener());
     t4 = new JTextField();     
     t4.addActionListener(new AcListener());
     t5 = new JTextField();     
     t5.addActionListener(new AcListener());
     t6 = new JTextField();     
     t6.addActionListener(new AcListener());
     p1 = new JPasswordField();
     p1.setEchoChar('*');
     p1.addActionListener(new AcListener());
     p2 = new JPasswordField();
     p2.addActionListener(new AcListener());
     p2.setEchoChar('*');

     button1 = new JRadioButton("Male", false); 
     button1.addActionListener(new AcListener());
     button2 = new JRadioButton("Female", false);
     button2.addActionListener(new AcListener());
     button3 = new JRadioButton ("Available", false);
     button3.addActionListener(new AcListener());
     button4 = new JRadioButton ("Not Available", false);
     button4.addActionListener(new AcListener());


     t1.setBounds(250, 20, 200, 30);
     button1.setBounds(250, 70, 100, 30);
     button2.setBounds(350, 70, 100, 30);
     t2.setBounds(250, 120, 200, 30);
     t3.setBounds(250, 170, 200, 30);
     t4.setBounds(250, 220, 200, 30);
     t5.setBounds(250, 270, 200, 30);
     p1.setBounds(250, 320, 200, 30);
     p2.setBounds(250, 370, 200, 30);
     t6.setBounds(250, 420, 200, 30);
     button3.setBounds(250, 470, 100, 30);
     button4.setBounds(350, 470, 100, 30);

     b1 = new JButton("Sign in");
     b1.addActionListener(new AcListener());
     
     b2 = new JButton("Next");
     b2.addActionListener(new AcListener());

     b1.setBounds(50, 550, 100, 40);
     b2.setBounds(350, 550, 100, 40);
     
     bg1 = new ButtonGroup();
     bg1.add(button1);
     bg1.add(button2);
     
     bg2 = new ButtonGroup();
     bg2.add(button3);
     bg2.add(button4);
     
     c.add(l1);
     c.add(l2);
     c.add(l3);
     c.add(l4);
     c.add(l5);
     c.add(l6);
     c.add(l7);
     c.add(l8);
     c.add(l9);
     c.add(l10);
     c.add(t1);
     c.add(t2);
     c.add(t3);
     c.add(t4);
     c.add(t5);
     c.add(t6);
     c.add(p1);
     c.add(p2);
     c.add(button1);
     c.add(button2);
     c.add(button3);
     c.add(button4);
     c.add(b1);
     c.add(b2);

       }
     
      public static boolean validateUserName(String userName){
         
        Matcher match = userNamePattern.matcher(userName);
        if(match.matches()){
            return true;
        }
        return false;
    }
    
    public static boolean validatePassword(String userName){
         
        Matcher match = passwordPattern.matcher(userName);
        if(match.matches()){
            return true;
        }
        return false;
    } 
    
    public static boolean validateEmailAddress(String userName){
         
        Matcher match = emailPattern.matcher(userName);
        if(match.matches()){
            return true;
        }
        return false;
    }
     
 public class AcListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            Object o = e.getSource();
           
            if (o == t1)   
            {
                if (t1.getText().isEmpty())
                   JOptionPane.showMessageDialog(null, "Full Name is required", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   wp.setUserFullName(t1.getText());
            }
            
            if (o == t2)   
            {   
                if (!validateEmailAddress(t2.getText()))
                   JOptionPane.showMessageDialog(null, "Invalid E-mail Address Format", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   wp.setUserEmail(t2.getText());
            }
            
            if (o == t3)
            {   
                if (t3.getText().length() != 11)
                   JOptionPane.showMessageDialog(null, "Invalid Phone Number Format", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   wp.setWpPhoneNumber(t3.getText());
            }
            
            if (o == t4) 
            {   
                if (t4.getText().isEmpty())
                   JOptionPane.showMessageDialog(null, "National ID is required", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   wp.setUserID(t4.getText());
            }   
            
            
            if (o == t5)
            {                 
                if (!validateUserName(t5.getText()))
                  JOptionPane.showMessageDialog(null, "username have to be at least 6 characters and only contain lowercase characters, '-', '_'",
                                                "Alert", JOptionPane.ERROR_MESSAGE);
                else
                  wp.setUsername(t5.getText());
            }
            
            if (o == p1)
            {
             if (!validatePassword(String.valueOf(p1.getPassword())))
                  JOptionPane.showMessageDialog(null, "Passwords must be within 6 to 15 characters and have at least one lowercase character,"
                                                + " one lowercase character and a special character",
                                                "Allert", JOptionPane.ERROR_MESSAGE);
            }
            
            if (o == p2) 
            {
                if (p2.getPassword() == p1.getPassword())
                   wp.setUserPassword(String.valueOf(p1.getPassword()));
                else
                   JOptionPane.showMessageDialog(null, "Passwords do not match", "Allert", JOptionPane.ERROR_MESSAGE);
            }
            
            if (o == t6)
            { 
                if (t4.getText().isEmpty())
                   JOptionPane.showMessageDialog(null, "Please enter your salary", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   wp.setWpSalary(Integer.parseInt(t6.getText()));
            }   
            
            if (button1.isSelected())
                wp.setWpGender("Male");
            else if (button2.isSelected())
                wp.setWpGender("Female");
            
            if (button3.isSelected())
                wp.setAvailability(true);
            else if (button4.isSelected())
                wp.setAvailability(false);
                
            if (o == b1)
               s.setVisible(true);
            else if (o == b2)
            {
               w.add(wp);
                try {
                    wp.save();
                } catch (IOException ex) {
                    Logger.getLogger(WPRegisteration.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                JOptionPane.showMessageDialog(null, "Your profile is ready!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    //WHAT IS NEXTT
               
            }    
        }
    }
}