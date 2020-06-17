/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.*;
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
public class OfficiantDashBoardGUI extends JFrame {
    
    private JLabel TitleTagLabel;
    private JLabel NameTagLabel;
    private JLabel WebsiteTagLabel;
    private JLabel PhoneNumberTagLabel;
    private JLabel IDTagLabel;
    private JLabel SalaryTagLabel;
    private JLabel actionTagLabel;
    
    private JLabel TitleLabel;
    private JLabel NameLabel;
    private JLabel WebsiteLabel;
    private JLabel PhoneNumberLabel;
    private JLabel IDLabel;
    private JLabel SalaryLabel;
    private JLabel Check;
    
    private JButton SaveButton;
    private JButton AddButton;
    
    public static ArrayList<Officiant>OfficiantArrayList=new ArrayList();
         int x_cor =50;
         int y_cor=80;
         
    public OfficiantDashBoardGUI(){
        
        
        
        setTitle("Officiant Dashboard");
        setSize(800,800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
        if(OfficiantArrayList.size() !=0){
            
           TitleTagLabel=new JLabel("Title");
           NameTagLabel=new JLabel("Name");
           WebsiteTagLabel=new JLabel("Website");
           PhoneNumberTagLabel=new JLabel("PhoneNumber");
           IDTagLabel=new JLabel("ID");
           SalaryTagLabel=new JLabel("Salary");
           actionTagLabel=new JLabel("Actions");
           
           
           TitleTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
           NameTagLabel.setBounds(x_cor + 150, y_cor - 50, 100, 30);
           WebsiteTagLabel.setBounds(x_cor + 250, y_cor - 50, 100, 30);
           PhoneNumberTagLabel.setBounds(x_cor + 350, y_cor - 50, 100, 30);
           IDTagLabel.setBounds(x_cor + 450, y_cor - 50, 100, 30);
           SalaryTagLabel.setBounds(x_cor + 550, y_cor - 50, 100, 30);
           actionTagLabel.setBounds(x_cor + 700, y_cor - 50, 100, 30);
           
           
           TitleTagLabel.setForeground(Color.red);
           NameTagLabel.setForeground(Color.red);
           WebsiteTagLabel.setForeground(Color.red);
           PhoneNumberTagLabel.setForeground(Color.red);
           IDTagLabel.setForeground(Color.red);
           SalaryTagLabel.setForeground(Color.red);
           actionTagLabel.setForeground(Color.red);
           
           add(TitleTagLabel);
           add(NameTagLabel);
           add(WebsiteTagLabel);
           add(PhoneNumberTagLabel);
           add(IDTagLabel);
           add(SalaryTagLabel);
           add(actionTagLabel);
           
           for(int i=0; i<OfficiantArrayList.size();i++){
               TitleLabel=new JLabel(OfficiantArrayList.get(i).getTitle());
               NameLabel=new JLabel(OfficiantArrayList.get(i).getName());
               WebsiteLabel=new JLabel(OfficiantArrayList.get(i).getWebsite());
               PhoneNumberLabel=new JLabel(OfficiantArrayList.get(i).getPhoneNumber());
               IDLabel=new JLabel(OfficiantArrayList.get(i).getID());
               String stri = Integer.toString(OfficiantArrayList.get(i).getOffSalary());
               SalaryLabel=new JLabel(stri);
               
               TitleLabel.setBounds(x_cor ,y_cor  ,100,30);
               NameLabel.setBounds(x_cor +150,y_cor , 100, 30);
               WebsiteLabel.setBounds(x_cor +250,y_cor , 100, 30);
               PhoneNumberLabel.setBounds(x_cor +350,y_cor , 100, 30);
               IDLabel.setBounds(x_cor +450,y_cor , 100, 30);
               SalaryLabel.setBounds(x_cor +550,y_cor , 100, 30);
               
               add(TitleLabel);
               add(NameLabel);
               add(WebsiteLabel);
               add(PhoneNumberLabel);
               add(IDLabel);
               add(SalaryLabel);
               
               
               JButton editButton=new JButton("Edit");
               editButton.setBounds(x_cor + 650, y_cor, 70, 30);
               add(editButton);
               editButton.setActionCommand(""+i);
               editButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                     int index= Integer.parseInt(e.getActionCommand());
                     EditOfficiantDashBoardGUI y =new EditOfficiantDashBoardGUI(index,  TitleLabel.getText(),
                     NameLabel.getText(),
                     WebsiteLabel.getText(),
                     PhoneNumberLabel.getText(),
                     IDLabel.getText(),
                     SalaryLabel.getText());
                     TitleLabel.getText();
                     NameLabel.getText();
                     WebsiteLabel.getText();
                     PhoneNumberLabel.getText();
                     IDLabel.getText();
                     SalaryLabel.getText();
                     dispose();
                  }
               });
               
               JButton deleteButton=new JButton("Delete");
               deleteButton.setBounds(x_cor + 750, y_cor, 70, 30);
               add(deleteButton);
               deleteButton.setActionCommand(""+i);
               
               deleteButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                   JOptionPane.showConfirmDialog(rootPane, "for sure to delete this officiant");
                    int index = Integer.parseInt(e.getActionCommand());
                    OfficiantDashBoardGUI.OfficiantArrayList.remove(index);
                    OfficiantDashBoardGUI officinatdash=new OfficiantDashBoardGUI();
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
              AddOfficiantDashBoardGUI addo=new AddOfficiantDashBoardGUI();
              addo.setVisible(true);
              dispose();
 }
           });
           
           SaveButton= new JButton("Save");
           SaveButton.setBounds(500, 600, 80, 30);
           add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                
                   Officiant OFF=new Officiant();
                   try {
                       if(OFF.save()){
                   JOptionPane.showMessageDialog(rootPane,"Saved ");
                 }
                   } catch (IOException ex) {
                       Logger.getLogger(OfficiantDashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
                   }



               }
           });
         }
        
        else {
            
        setTitle("Officiant Dashboard");
        setSize(650, 700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
           Check=new JLabel();
            JOptionPane.showMessageDialog(null, "ArrayList is empty and There's No Officinats");
            Check.setText("ArrayList is empty and There's No Officinats");
            Check.setBounds(50,50,300,200);
            add(Check);
            
            
            
        AddButton = new JButton("Add");
        AddButton.setBounds(400, 600, 80, 30);
        add(AddButton);
        AddButton.setVisible(true);
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                AddOfficiantDashBoardGUI addofi  = new AddOfficiantDashBoardGUI();
                    addofi.setVisible(true);
                    setVisible(false);
                
}
        });
            
          }
        
        
        
    }
    
    
}
