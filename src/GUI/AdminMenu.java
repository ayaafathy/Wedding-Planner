/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Notification;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Font.SERIF;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Rawan Khaled
 */
public class AdminMenu extends JFrame {
        JList l;
    String [] menu = { "Clients" , "Notification" , "To-Do List" , "Reports" , "Invoice" , "Menu" };
    Font f = new Font (SERIF, Font.ROMAN_BASELINE, 16);
    Notification n = new Notification ();
    ToDoList t= new ToDoList();
    Reports r = new Reports ();
    Invoice i = new Invoice ();
    Planner pl = new Planner ();
    ClientDetails cd =  new ClientDetails ();
    
    
   public AdminMenu()  {
        
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
          
          if (s == "Clients")
             cd.setVisible(true);
          else if (s == "Notification")
              n.setVisible (true);
          else if (s == "To-Do List")
              t.setVisible(true);
          else if (s=="Reports")
           r.setVisible(true);
          else if (s== "Invoice")
              i.setVisible ( true);
          else if (s== "Menu")
              pl.setVisible(true);
                    
              } 
      
 } 
}