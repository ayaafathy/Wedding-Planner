
package GUI;
import System.projDate;
import Users.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class clRegisteration extends JFrame implements Serializable{
    
     JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
     JTextField t1, t2, t3, t4, t5, t6, t7, hh, dd, mm, yy;
     JPasswordField p1, p2;
     JRadioButton button1, button2;
     JButton b1, b2;
     ButtonGroup bg ;
     
    
    private static final Pattern userNamePattern = Pattern.compile("[a-zA-Z0-9_-]{6,14}$");
    private static Pattern passwordPattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
    private static Pattern emailPattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

     private Client cl = new Client ();
     projDate weddDate = new projDate ();
     MainMenu m = new MainMenu();
     SigninForm s = new SigninForm();
     
     public clRegisteration ()
     {
      setSize (620 , 850);
      setTitle ("Client Registeration Form ");
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
     l9 = new JLabel("Partner's Full Name");
     l10 = new JLabel ("Budget");
     l11= new JLabel ("Ceremony Date");

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
     p1 = new JPasswordField();
     p1.addActionListener(new AcListener());
     p2 = new JPasswordField();
     p2.addActionListener(new AcListener());
     t6 = new JTextField(" ");
     t6.addActionListener(new AcListener());
     t7 = new JTextField("00000");
     t7.addActionListener(new AcListener());
     hh = new JTextField();
     hh.setToolTipText("Hour");
     hh.addActionListener(new AcListener());
     dd = new JTextField();
     dd.setToolTipText("Day");
     dd.addActionListener(new AcListener());
     mm = new JTextField();
     mm.setToolTipText("Month");
     mm.addActionListener(new AcListener());
     yy = new JTextField();
     yy.setToolTipText("Year");
     yy.addActionListener(new AcListener());
     
   
     button1 = new JRadioButton("Male", false); 
     button1.addActionListener(new AcListener());
     button2 = new JRadioButton("Female", false);
     button2.addActionListener(new AcListener());
      
     bg = new ButtonGroup();
     bg.add(button1);
     bg.add(button2);
     
     b1 = new JButton("Sign in");
     b1.addActionListener(new AcListener());
     b2 = new JButton("Next");
     b2.addActionListener(new AcListener());
     
     
     l1.setBounds(100, 20, 200, 40);
     l2.setBounds(100, 70, 200,  40);
     l3.setBounds(100, 120, 200, 40);
     l4.setBounds(100, 170, 200, 40);     
     l5.setBounds(100, 220, 200, 40);     
     l6.setBounds(100, 270, 200, 40);
     l7.setBounds(100, 320, 200, 40);
     l8.setBounds(100, 370, 200, 40);
     l9.setBounds(100, 420, 200, 40);
     l10.setBounds(100, 470, 200, 40);
     l11.setBounds(100, 520, 200, 40);
     b1.setBounds(100, 630, 100, 40);
     
     t1.setBounds(280, 20, 200, 30);
     button1.setBounds(280, 70, 100, 30);
     button2.setBounds(380, 70, 100, 30);
     t2.setBounds(280, 120, 200, 30);
     t3.setBounds(280, 170, 200, 30);
     t4.setBounds(280, 220, 200, 30);
     t5.setBounds(280, 270, 200, 30);
     p1.setBounds(280, 320, 200, 30);
     p2.setBounds(280, 370, 200, 30);
     t6.setBounds(280, 420, 200, 30);
     t7.setBounds(280, 470, 200, 30);
     hh.setBounds(280, 520, 70, 30);
     dd.setBounds(380, 520, 70, 30);
     mm.setBounds(280, 570, 70, 30);
     yy.setBounds(380, 570, 70, 30);
     b2.setBounds(380, 630, 100, 40);

    
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
     c.add(l11);
     c.add(t1);
     c.add(t2);
     c.add(t3);
     c.add(t4);
     c.add(t5);
     c.add(t6);
     c.add(t7);
     c.add(hh);
     c.add(dd);
     c.add(mm);
     c.add(yy);
     c.add(p1);
     c.add(p2);
     c.add(button1);
     c.add(button2);
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
                   cl.setUserFullName(t1.getText());
            }
            
            if (o == t2)   
            {   
                if (!validateEmailAddress(t2.getText()))
                   JOptionPane.showMessageDialog(null, "Invalid E-mail Address Format", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   cl.setUserEmail(t2.getText());
            }
            
            if (o == t3)
            {   if (t3.getText().isEmpty())
                   JOptionPane.showMessageDialog(null, "Phone Number is required", "Alert", JOptionPane.ERROR_MESSAGE);
                else if (t3.getText().length() != 11)
                   JOptionPane.showMessageDialog(null, "Invalid Phone Number Format", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   cl.setPhoneNumber(t3.getText());
            }
            
            if (o == t4) 
            {   
                if (t4.getText().isEmpty())
                   JOptionPane.showMessageDialog(null, "National ID is required", "Alert", JOptionPane.ERROR_MESSAGE);
                else if (Integer.parseInt(t4.getText()) < 1)
                   JOptionPane.showMessageDialog(null, "Invalid National ID", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   cl.setUserID(t4.getText());
            }   
            
            
            if (o == t5)
            {                 
                if (!validateUserName(t5.getText()))
                  JOptionPane.showMessageDialog(null, "username have to be at least 6 characters and only contain lowercase characters, '-', '_'",
                                                "Alert", JOptionPane.ERROR_MESSAGE);
                else
                  cl.setUsername(t5.getText());
            }
            
            
            if (o == t6)
            {    
               if (t6.getText().isEmpty())
                 JOptionPane.showMessageDialog(null, "Partner's full name is required", "Alert", JOptionPane.ERROR_MESSAGE);
               else 
                 cl.setPartnerName(t6.getText());
            }   
            
            if (o == t7)
            {   
                if (t7.getText().isEmpty())
                  JOptionPane.showMessageDialog(null, "Wedding budget is required", "Alert", JOptionPane.ERROR_MESSAGE);
                else if (Integer.parseInt(t7.getText()) < 1)
                   JOptionPane.showMessageDialog(null, "Invalid value", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                  cl.setBudget(Integer.parseInt(t7.getText()));
            }
            
             if (o == hh)
            {     
                   
                if (Integer.parseInt(hh.getText()) < 0 || Integer.parseInt(hh.getText()) > 24 || hh.getText().isEmpty())
                   JOptionPane.showMessageDialog(null, "Invalid Time", "Alert", JOptionPane.ERROR_MESSAGE);
                else    
                  weddDate.setHour(Integer.parseInt(hh.getText()));
            }   
             
             if (o == dd)
            {
                if (Integer.parseInt(dd.getText()) < 1 || Integer.parseInt(dd.getText()) > 31 || dd.getText().isEmpty())
                   JOptionPane.showMessageDialog(null, "Invalid Day", "Alert", JOptionPane.ERROR_MESSAGE);
                else
                   weddDate.setDay(Integer.parseInt(dd.getText()));
            }
  
            if (o == mm)
            {
                if (Integer.parseInt(mm.getText()) < 1 || Integer.parseInt(mm.getText()) > 12 || mm.getText().isEmpty())
                  JOptionPane.showMessageDialog(null, "Invalid Month", "Alert", JOptionPane.ERROR_MESSAGE); 
                else    
                  weddDate.setMonth(Integer.parseInt(mm.getText()));
            }
            
            if (o == yy)
            {   
                if (Integer.parseInt(yy.getText()) < 2019 || Integer.parseInt(yy.getText()) > 2022 || yy.getText().isEmpty())
                  JOptionPane.showMessageDialog(null, "Invalid Year", "Alert", JOptionPane.ERROR_MESSAGE); 
                else
                  weddDate.setYear(Integer.parseInt(yy.getText()));
                  cl.setwDate(weddDate);
            }   
          
           
            if (button1.isSelected())
               cl.setGender("Male");
            else if (button2.isSelected())
               cl.setGender("Female");
           
            if (o == b1)
               s.setVisible(true);
            else if (o == b2){
               cl.add();
               JOptionPane.showMessageDialog(null, "Your profile is ready!", "Message", JOptionPane.INFORMATION_MESSAGE);
               m.setVisible(true);
               
            }    
        }
       
    }
}