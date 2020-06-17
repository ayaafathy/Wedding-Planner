
package GUI;
import java.awt.*;
import static java.awt.Font.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Notes extends JFrame {

    JButton add, edit, delete, save;
    
    
    private String path = "C:\\Users\\Aya\\Documents\\NetBeansProjects\\WeddPlanner\\BinaryFiles\\notes.dat"; 
    ArrayList <String> notes = new ArrayList <String> ();
    
    public Notes() {
        
     setSize (400, 300);
     setTitle ("Notes");
     this.setLayout(null);
     
//     add = new JButton (new ImageIcon(note.jpg));
     
    }
    
    
    
//    private void addNote ()
//    {
//        try {
//           
//            Scanner s = new Scanner(System.in);
//            String n = s.nextLine();
//            notes.add(n);
//            ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream(path));
//            o.writeObject(notes);
//            
//        } catch (IOException ex) {
//            Logger.getLogger(Notes.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
}
