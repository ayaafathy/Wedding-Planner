/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rawan Khaled
 */
public class SigninForm extends JFrame{
    JLabel lblName = new JLabel(" Please fill the following information : ");

    JLabel usernameLabel;
    JTextField usernameField;
    JLabel usernameRequired;

    JLabel passwordLabel;
    JPasswordField passwordfield;
    
    JLabel passwordfRequired;

    JButton login;
    JButton ForgotPassword;
    
    public SigninForm (){
    
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(null);
   
       usernameLabel = new JLabel("Username");
        usernameField = new JTextField();
        usernameRequired = new JLabel("*Username is required");

        passwordLabel = new JLabel("Password");
        
        passwordfield = new JPasswordField();
        passwordfRequired = new JLabel("*Password is required");

        login = new JButton("LogIn");
        ForgotPassword = new JButton ("Forgot Password");
        usernameLabel.setBounds(50, 50, 300, 30);
        usernameField.setBounds(200, 50, 300, 30);
        usernameRequired.setBounds(200, 100, 300, 30);
        usernameRequired.setForeground(Color.red);
        usernameRequired.setOpaque(true);
        passwordLabel.setBounds(50, 200, 300, 30);
        passwordfield.setBounds(200, 200, 300, 30);
        passwordfRequired.setBounds(200, 240, 300, 30);
        passwordfRequired.setForeground(Color.red);
        passwordfRequired.setOpaque(true);
        login.setBounds(150, 300, 100, 30);
        ForgotPassword.setBounds(300, 300, 200, 30);

        add(usernameLabel);
        add(usernameField);
        add(usernameRequired);
        add(passwordLabel);
        add(passwordfield);
        add(passwordfRequired);
        add(login);
        add(ForgotPassword);
        
      login.addActionListener(new loginbuttonwatcher());
      ForgotPassword.addActionListener(new ForgotPasswordbuttonwatcher ());
        
    }

    
   // usernameField.addFocusListener (new FocusListe)
    private class ForgotPasswordbuttonwatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    }
private class loginbuttonwatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //search in the arrylist 3ala el user da
            JOptionPane.showMessageDialog(null, "LoggedIn Succesfully");
            
            
            MainMenu menue = new MainMenu();
            menue.setVisible(true);
            dispose();
        }
    
}
public boolean login (String Username , String Password){
    if (users.containsKey(Username)){
        if (users.get(Username).equals(Password))
            return true;
    }
    return false;
}
    protected static HashMap<String,String >  users=new HashMap<String,String>(); 

    public static HashMap<String, String> getUsers() {
        return users;
    }

    public static void setUsers(HashMap<String, String> users) {
        SigninForm.users = users;
    }
    
    
    public boolean CheckExist(String username){
        HashMap<String,String> searchusers=new HashMap<String,String>();
        searchusers=FromFile();
        for(String name:searchusers.keySet()){
            if (name.equals(username)){
                return true;
            }
        }
        return false;
    }
    public HashMap<String,String> FromFile(){
          HashMap<String,String>  hashUsers=new HashMap<String,String>() ;
        
         try{
         ObjectInputStream inp=new ObjectInputStream(new FileInputStream("UsersLogInFile.bin"));
           
            hashUsers=(HashMap<String,String> )inp.readObject();
       
        inp.close();
        }catch(FileNotFoundException e){
            System.out.print(" file not found"+e);
        }catch(IOException | ClassNotFoundException e){
            
            System.out.print(e);
        }catch(Exception e){
            System.out.println(e);
        }
         return hashUsers;
    }
    
    
   public boolean CheckUsernameAndPassword(String username,String password){
  
       for(String name:users.keySet()){
           if(name.equals(username) && users.get(username).equals(password)){ 
           
                return true;
            }
        }
       
        return false;
   }
    

    
}

