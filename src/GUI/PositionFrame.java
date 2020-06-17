package GUI;

import WeddVendors.Transportation;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;


public class PositionFrame extends JFrame {
    
    JButton admin,  client;

    
   
  
    LoginORSignup LorS = new LoginORSignup();
    
    
    public PositionFrame (){
        
    setSize (1000,1000);
    setTitle ("Identity");
    Container c = getContentPane();
    c.setLayout(null); 
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         c.setBackground(Color.pink);
    admin = new JButton("Admin"); 

    client = new JButton("Client");
 
    admin.setBounds(50, 500, 100, 100);
    client.setBounds(50, 650, 100, 100);
   
    
    c.add(admin);
   
    c.add(client);
     admin.setVisible(true);
      admin.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Transportation tr = new Transportation();
                    try {
                        tr.load();
                    } catch (IOException ex) {
                        Logger.getLogger(PositionFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                TransDashBoardGUI sign = new TransDashBoardGUI();
                sign.setVisible(true);
                setVisible(false);

                }
            });
    
}
   
public void paint (Graphics c){
    super.paint(c);
    try{
    BufferedImage img= ImageIO.read(new File ("D:\\MIU\\OOP\\Project\\6666.png"));
    c.drawImage(img,50,50,600,300,null);
    BufferedImage img2= ImageIO.read(new File ("D:\\MIU\\OOP\\Project\\587.png"));
    c.drawImage(img2 ,400,400,400,600,null);
    }   
    catch (IOException ex) {
           // Logger.getLogger(WelcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
//public class AcListener implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            
//            Object o = e.getSource();
//           
//            
//           
//            if (client.isSelected())
//            { LorS.setVisible(true);
//            }
//            else if(admin.isSelected())
//            {  
//                TransDashBoardGUI sign = new TransDashBoardGUI();
//                sign.setVisible(true);
//                setVisible(true);
//                
//            }
//        }    
//    }

}