
package GUI;

import java.awt.*;
import javax.swing.*;

public class EntList extends JFrame{
    
    String [] vgdata = {"Jane Akram" , "Sara Ahmed" , "Tony Bassem" , "Hany Safwat" ,"Ayten Khalifa"};
    String [] pgdata = {"Youssef Ahmed" , "Ramy Fayez" , "Hany Hussien" ,"Maged Hassan", "Pelar ElKhosht"};
    String [] djdata = {"Tiesto Biko" ,"ElSawy" , "Sasa.REMIX" , "Migo" , "Bekkaa"};
    JLabel vgs, phs, djs;
    JList vgList, pgList, djList;
    
    public EntList () {
        

    setSize (300,400);
    setTitle ("Entertainment");
    Container c = getContentPane();
    c.setLayout(new GridLayout(3,2));

    
    vgs = new JLabel ("Videographers:");
    phs = new JLabel ("Photographers:");
    djs = new JLabel ("DJs:");
    vgList = new JList (vgdata);
    pgList = new JList (pgdata);
    djList = new JList (djdata);

    c.add (vgs);
    c.add (vgList);
    c.add (phs);
    c.add (pgList);
    c.add (djs);
    c.add (djList);

       } 
}
