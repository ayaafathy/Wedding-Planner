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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author 2tech
 */
public class EditTransDashBoardGUI extends JFrame{
 
    private JLabel CarTypeLabel;
    private JTextField CarTypeField;
    
    private JLabel CarIDLabel;
    private JTextField CarIDField;
    
    private JLabel CarCostLabel;
    private JTextField CarCostField;
    
    private JButton SaveButton;
     
    
    public EditTransDashBoardGUI(int index,String type , String ID, String cost){
        
        setTitle("Edit Transportation");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
         int width = 300;
        int height = 30;
        
        CarTypeLabel= new JLabel("Car Type");
        CarTypeField=new JTextField();
        CarIDLabel=new JLabel("Car ID");
        CarIDField=new JTextField();
        CarCostLabel=new JLabel("Car Cost");
        CarCostField=new JTextField();
        SaveButton=new JButton("Save");
        SaveButton.addActionListener(e->this.dispose());
        
        CarTypeLabel.setBounds(50,50,width,height);
        CarTypeField.setBounds(200,50,width,height);
        CarIDLabel.setBounds(50,100,width,height);
        CarIDField.setBounds(200,100,width,height);
        CarCostLabel.setBounds(50,150,width,height);
        CarCostField.setBounds(200,150,width,height);
        SaveButton.setBounds(200,200,width,height);
        
        add(CarTypeLabel);
        add(CarTypeField);
        add(CarIDLabel);
        add(CarIDField);
        add(CarCostLabel);
        add(CarCostField);
        add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             Transportation tr=new Transportation( CarTypeField.getText(),
             CarIDField.getText(),
             CarCostField.getText());
            
             TransDashBoardGUI.TransArrayList.set(index,tr);
             TransDashBoardGUI TrandbGUI=new TransDashBoardGUI();
             dispose();
             
 }
        });
      
    }
        
   public EditTransDashBoardGUI(int index, Transportation trans ){
       
       setTitle("Edit Transportation");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        CarTypeLabel=new JLabel("Name");
        CarTypeField=new JTextField(trans.getCarType());
        CarIDLabel=new JLabel("Car ID");
        CarIDField=new JTextField(trans.getCarID());
        CarCostLabel=new JLabel("Car Cost");
        CarCostField=new JTextField(trans.getCarCost());
        SaveButton=new JButton("Edit");
         
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
        
        
        
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Transportation updatetras=new Transportation();
                
                CarTypeField.getText();
                CarIDField.getText();
                CarCostField.getText();
                TransDashBoardGUI.TransArrayList.set(index,updatetras);
                TransDashBoardGUI trdashb=new TransDashBoardGUI();
                 dispose(); 
                 
            }
        });
                
        }
    
 }
