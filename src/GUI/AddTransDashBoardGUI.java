/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Entertainment.DJ;
import WeddVendors.Transportation;
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
public class AddTransDashBoardGUI extends JFrame{
    
    private JLabel CarTypeLabel;
    private JTextField CarTypeField;
    
    private JLabel CarIDLabel;
    private JTextField CarIDField;
    
    private JLabel CarCostLabel;
    private JTextField CarCostField;
    
    private JButton SaveButton;
    
    int width = 300;
    int height = 30;
    
   public AddTransDashBoardGUI(){  
       
        setTitle("Add Transportation");
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
       
        CarTypeLabel=new JLabel("Car Type");
        CarTypeField=new JTextField();
        CarIDLabel=new JLabel("Car ID");
        CarIDField=new JTextField();
        CarCostLabel=new JLabel("Car Cost");
        CarCostField=new JTextField();
        SaveButton=new JButton ("Add");
        SaveButton.addActionListener(e->this.dispose());
        
        
        
        CarTypeLabel.setBounds(50,50,width,height);
        CarTypeField.setBounds(200,50,width,height);
        CarIDLabel.setBounds(50,100,width,height);
        CarIDField.setBounds(200,100,width,height);
        CarCostLabel.setBounds(50,150,width,height);
        CarCostField.setBounds(200,150,width,height);
        SaveButton.setBounds(200,250,width,height);
        
        
        add(CarTypeLabel);
        add(CarTypeField);
        add(CarIDLabel);
        add(CarIDField);
        add(CarCostLabel);
        add(CarCostField);
        add(SaveButton);
       
        SaveButton.addActionListener(new Action());
        
   }
    private class Action implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          Transportation transp=new Transportation();
          transp.setCarType(CarTypeField.getText());
          transp.setCarID(CarIDField.getText());
          transp.setCarCost(CarCostField.getText());
         TransDashBoardGUI.TransArrayList.add(transp);
          TransDashBoardGUI Trans = new TransDashBoardGUI();
          Trans.setVisible(true);
        }
    }

}
