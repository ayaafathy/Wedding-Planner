/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.SigninForm;
import GUI.SigninForm;
import GUI.clRegisteration;
import GUI.clRegisteration;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rawan Khaled
 */
public class LoginORSignup extends JFrame {
    JButton Loginbutton=new JButton(" Login ");
JButton Signupbutton=new JButton(" Signup ");
JLabel l = new JLabel("Login if you already have an account ");
JLabel s = new JLabel(" OR SignUp to create a new account ");
 SigninForm L= new SigninForm();
 clRegisteration S= new clRegisteration ();

   public LoginORSignup() {
setSize(500,500);
Container cp= getContentPane(); 
setTitle(" Welcome ");
cp.add(l);
cp.add(Loginbutton);
cp.add(s);
cp.add(Signupbutton);  
cp.setLayout(new FlowLayout());
   
Loginbutton.addActionListener (new loginbuttonwatcher());

Signupbutton.addActionListener (new signupbuttonwatcher());

}

private class loginbuttonwatcher implements ActionListener {
    

    @Override
    public void actionPerformed(ActionEvent e) {
       
        L.setVisible(true);
        dispose();
               
    }
    
}
private class signupbuttonwatcher implements ActionListener {
   
        @Override
        public void actionPerformed(ActionEvent e) {
           
        S.setVisible(true);
        dispose();
             
        }
    }

}

