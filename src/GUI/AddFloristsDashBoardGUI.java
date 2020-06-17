/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import WeddVendors.Decorations.Florists;
import WeddVendors.Officiant;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 2tech
 */
public class AddFloristsDashBoardGUI extends JFrame{
    
    private JLabel FlowerTypeLabel;
    private JTextField FlowerTypeField;
    
    private JButton SaveButton;
    
    int width = 300;
    int height = 30;
    
    
    
    public AddFloristsDashBoardGUI(){
        
        setTitle("Add Florists");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.RED);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowerTypeLabel=new JLabel("Florists");
        FlowerTypeField=new JTextField();
        SaveButton=new JButton ("Add");
        SaveButton.addActionListener(e->this.dispose());
        
        FlowerTypeLabel.setBounds(50,50,width,height);
        FlowerTypeField.setBounds(200,50,width,height);
        SaveButton.setBounds(200,100,width,height);
        
        
        add(FlowerTypeLabel);
        add(FlowerTypeField);
        add(SaveButton);
        
        
        SaveButton.addActionListener(new Action());
        
    }
    private class Action implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          Florists flre=new Florists();
          flre.setFlowers(FlowerTypeField.getText());
          FloristsDashBoardGUI.FloristsArrayList.add(flre);
          FloristsDashBoardGUI fdvgui = new FloristsDashBoardGUI();
          fdvgui.setVisible(true);
        }
    }

}

        
        

