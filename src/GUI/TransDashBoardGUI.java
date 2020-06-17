/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.DJDashBoardGUI.DJArrayList;
import WeddVendors.Entertainment.DJ;
import WeddVendors.Transportation;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 2tech
 */
public class TransDashBoardGUI extends JFrame{

private JLabel CarTypeTagLabel;
private JLabel CarIDTagLabel;
private JLabel CarCostTagLabel;
private JLabel actionTagLabel;
    

private JLabel CarTypeLabel;
private JLabel CarIDLabel;
private JLabel CarCostLabel;
private JLabel checkLabel;
    
private JButton SaveButton;
private JButton AddButton;


public static ArrayList<Transportation>TransArrayList=new ArrayList();
         int x_cor =50;
         int y_cor=80;


public TransDashBoardGUI(){
    
        setTitle("Transportation Dashboard");
        setSize(800,800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
        if(TransArrayList.size()!=0){
            
            CarTypeTagLabel=new JLabel("Car Type");
            CarIDTagLabel=new JLabel ("Car ID");
            CarCostTagLabel=new JLabel("Car Cost");
            actionTagLabel=new JLabel("Actions");
            
            CarTypeTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
            CarIDTagLabel.setBounds(x_cor + 150, y_cor - 50, 100, 30);
            CarCostTagLabel.setBounds(x_cor + 250, y_cor - 50, 100, 30);
            actionTagLabel.setBounds(x_cor + 400, y_cor - 50, 100, 30);
            
           CarTypeTagLabel.setForeground(Color.red);
           CarIDTagLabel.setForeground(Color.red);
           CarCostTagLabel.setForeground(Color.red);
           actionTagLabel.setForeground(Color.red);
            
           add(CarTypeTagLabel);
           add(CarIDTagLabel);
           add(CarCostTagLabel);
           add(actionTagLabel);
            
           
           for(int i=0; i<TransArrayList.size();i++){
               
               CarTypeLabel=new JLabel(TransArrayList.get(i).getCarType());
               CarIDLabel=new JLabel(TransArrayList.get(i).getCarID());
               CarCostLabel=new JLabel(TransArrayList.get(i).getCarCost());
               
               CarTypeLabel.setBounds(x_cor ,y_cor  ,100,30);
               CarIDLabel.setBounds(x_cor +150 ,y_cor  ,100,30);
               CarCostLabel.setBounds(x_cor +250 ,y_cor  ,100,30);
               
               add(CarTypeLabel);
               add(CarIDLabel);
               add(CarCostLabel);
               
               JButton editButton=new JButton("Edit");
               editButton.setBounds(x_cor + 350, y_cor, 70, 30);
               add(editButton);
               editButton.setActionCommand(""+i);
               editButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                     int index= Integer.parseInt(e.getActionCommand());
                     EditTransDashBoardGUI yKL =new EditTransDashBoardGUI(index,  CarTypeLabel.getText(),
                     CarIDLabel.getText(),    
                     CarCostLabel.getText());
                     CarTypeLabel.getText();
                     CarIDLabel.getText();    
                     CarCostLabel.getText();
                     dispose();
                  }
               });
               
               JButton deleteButton=new JButton("Delete");
               deleteButton.setBounds(x_cor + 450, y_cor, 70, 30);
               add(deleteButton);
               deleteButton.setActionCommand(""+i);
               
               deleteButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                   JOptionPane.showConfirmDialog(rootPane, "for sure to delete this Transportation");
                    int index = Integer.parseInt(e.getActionCommand());
                   TransDashBoardGUI.TransArrayList.remove(index);
                    TransDashBoardGUI trasndash=new TransDashBoardGUI();
                    dispose();
 }
               });
                y_cor += 40;
                
              }
               
              AddButton = new JButton("Add");
           AddButton.setBounds(400, 600, 80, 30);
           add(AddButton);
           AddButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
              AddTransDashBoardGUI tradd=new AddTransDashBoardGUI();
              tradd.setVisible(true);
              dispose();
 }
           }); 
               
              SaveButton= new JButton("Save");
           SaveButton.setBounds(500, 600, 80, 30);
           add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                
                   Transportation trns=new Transportation();
                   try {
                       if(trns.save()){
                   JOptionPane.showMessageDialog(rootPane,"Saved ");
                 }
                   } catch (IOException ex) {
                       Logger.getLogger(OfficiantDashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
                   }



               }
           });
         } 
               
        else{
            
        setTitle("Transportation Dashboard");
        setSize(650, 700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
        checkLabel=new JLabel();
        JOptionPane.showMessageDialog(null, "ArrayList is empty and There's No Transportation");
        checkLabel.setText("ArrayList is empty and There's No Transportation");
        checkLabel.setBounds(50,50,300,200);
        add(checkLabel);   
            
            
       AddButton = new JButton("Add");
        AddButton.setBounds(400, 600, 80, 30);
        add(AddButton);
        AddButton.setVisible(true);
        AddButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
               
                AddTransDashBoardGUI addtranss  = new AddTransDashBoardGUI();
                    addtranss.setVisible(true);
                    setVisible(false);
                
}
        });
            
          }
        
        
        
    }
    
    
}
