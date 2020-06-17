/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.OfficiantDashBoardGUI.OfficiantArrayList;
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
public class VenuesDashBoardGUI extends JFrame{
    
    private JLabel VenueNameTagLabel;
    private JLabel VenueIDTagLabel;
    private JLabel VenuePhoneNumberTagLabel;
    private JLabel VenueWebsiteTagLabel;
    private JLabel VenueRatingTagLabel;
    private JLabel VenueSettinTagLabel;
    private JLabel VenueCapacityTagLabel;
    private JLabel VenuePriceTagLabel;
    private JLabel actionTagLabel;
    
    private JLabel VenueNameLabel;
    private JLabel VenueIDLabel;
    private JLabel VenuePhoneNumberLabel;
    private JLabel VenueWebsiteLabel;
    private JLabel VenueRatingLabel;
    private JLabel VenueSettingLabel;
    private JLabel VenueCapacityLabel;
    private JLabel VenuePriceLabel;
    private JLabel Check;
    
    private JButton SaveButton;
    private JButton AddButton;
    
    public static ArrayList<Venue>venuesArrayList=new ArrayList();
    int x_cor =50;
    int y_cor=80;
    
    public VenuesDashBoardGUI(){
        
        setTitle("Venue Dashboard");
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(venuesArrayList.size()!=0){
           
           VenueNameTagLabel=new JLabel("Venue Name");
           VenueIDTagLabel=new JLabel("Venue ID");
           VenuePhoneNumberTagLabel=new JLabel("Venue Phone Number");
           VenueWebsiteTagLabel=new JLabel("Venue Website");
           VenueRatingTagLabel=new JLabel("Venue Rating");
           VenueSettinTagLabel=new JLabel("Venue Setting");
           VenueCapacityTagLabel=new JLabel("Venue Capacity");
           VenuePriceTagLabel=new JLabel("Venue Price");
           actionTagLabel=new JLabel("Actions");
            
           VenueNameTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
           VenueIDTagLabel.setBounds(x_cor + 150, y_cor - 50, 100, 30);
           VenuePhoneNumberTagLabel.setBounds(x_cor + 250, y_cor - 50, 100, 30); 
           VenueWebsiteTagLabel.setBounds(x_cor + 350, y_cor - 50, 100, 30);  
           VenueRatingTagLabel.setBounds(x_cor + 450, y_cor - 50, 100, 30); 
           VenueSettinTagLabel.setBounds(x_cor + 550, y_cor - 50, 100, 30); 
           VenueCapacityTagLabel.setBounds(x_cor + 650, y_cor - 50, 100, 30); 
           VenuePriceTagLabel.setBounds(x_cor + 750, y_cor - 50, 100, 30); 
           actionTagLabel.setBounds(x_cor + 900, y_cor - 50, 100, 30); 
           
           VenueNameTagLabel.setForeground(Color.red);
           VenueIDTagLabel.setForeground(Color.red);
           VenuePhoneNumberTagLabel.setForeground(Color.red);
           VenueWebsiteTagLabel.setForeground(Color.red);
           VenueRatingTagLabel.setForeground(Color.red);
           VenueSettinTagLabel.setForeground(Color.red);
           VenueCapacityTagLabel.setForeground(Color.red);
           VenuePriceTagLabel.setForeground(Color.red);
           actionTagLabel.setForeground(Color.red);
           
           add(VenueNameTagLabel);
           add(VenueIDTagLabel);
           add(VenuePhoneNumberTagLabel);
           add(VenueWebsiteTagLabel);
           add(VenueRatingTagLabel);
           add(VenueSettinTagLabel);
           add(VenueCapacityTagLabel);
           add(VenuePriceTagLabel);
           add(actionTagLabel);
           
           for(int i=0; i<venuesArrayList.size();i++){
               
           VenueNameLabel=new JLabel(venuesArrayList.get(i).getName());
           VenueIDLabel=new JLabel(venuesArrayList.get(i).getID());
           VenuePhoneNumberLabel=new JLabel(venuesArrayList.get(i).getPhoneNumber());
           VenueWebsiteLabel=new JLabel(venuesArrayList.get(i).getWebsite());
           VenueRatingLabel=new JLabel(venuesArrayList.get(i).getVenueRate());
           VenueSettingLabel=new JLabel(venuesArrayList.get(i).getVenueSetting());
           String stri = Integer.toString(venuesArrayList.get(i).getVenueCapacity());
           VenueCapacityLabel=new JLabel(stri);
           String ftr = Double.toString(venuesArrayList.get(i).getVenuePrice());
           VenuePriceLabel=new JLabel(ftr);
           
           VenueNameLabel.setBounds(x_cor ,y_cor  ,100,30);
           VenueIDLabel.setBounds(x_cor +150,y_cor  ,100,30); 
           VenuePhoneNumberLabel.setBounds(x_cor +250,y_cor  ,100,30); 
           VenueWebsiteLabel.setBounds(x_cor +350,y_cor  ,100,30);  
           VenueRatingLabel.setBounds(x_cor +450,y_cor  ,100,30); 
           VenueSettingLabel.setBounds(x_cor +550,y_cor  ,100,30);
           VenueCapacityLabel.setBounds(x_cor +650,y_cor  ,100,30);
           VenuePriceLabel.setBounds(x_cor +750,y_cor  ,100,30);
           
           add(VenueNameLabel);
           add(VenueIDLabel);
           add(VenuePhoneNumberLabel);
           add(VenueWebsiteLabel);
           add(VenueRatingLabel);
           add(VenueSettingLabel);
           add(VenueCapacityLabel);
           add(VenuePriceLabel);
           
           JButton editButton=new JButton("Edit");
               editButton.setBounds(x_cor + 850, y_cor, 70, 30);
               add(editButton);
               editButton.setActionCommand(""+i);
               editButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                     int index= Integer.parseInt(e.getActionCommand());
                     EditVenueDashBoardGUI ydr =new EditVenueDashBoardGUI(index,  VenueNameLabel.getText(),
                     VenueIDLabel.getText(),
                     VenuePhoneNumberLabel.getText(),    
                     VenueWebsiteLabel.getText(),
                     VenueRatingLabel.getText(),
                     VenueSettingLabel.getText(),
                     VenueCapacityLabel.getText(),
                     VenuePriceLabel.getText());
                     VenueNameLabel.getText();
                     VenueIDLabel.getText();
                     VenuePhoneNumberLabel.getText();    
                     VenueWebsiteLabel.getText();
                     VenueRatingLabel.getText();
                     VenueSettingLabel.getText();
                     VenueCapacityLabel.getText();
                     VenuePriceLabel.getText();
                     dispose();
                  }
               });
           
           JButton deleteButton=new JButton("Delete");
               deleteButton.setBounds(x_cor + 950, y_cor, 70, 30);
               add(deleteButton);
               deleteButton.setActionCommand(""+i);
               
               deleteButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                   JOptionPane.showConfirmDialog(rootPane, "for sure to delete this Venue");
                    int index = Integer.parseInt(e.getActionCommand());
                    VenuesDashBoardGUI.venuesArrayList.remove(index);
                    VenuesDashBoardGUI venuedash=new VenuesDashBoardGUI();
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
              AddVenueDashBoardGUI addvenue=new AddVenueDashBoardGUI();
              addvenue.setVisible(true);
              dispose();
 }
           });
             
           SaveButton= new JButton("Save");
           SaveButton.setBounds(500, 600, 80, 30);
           add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                
                   Venue nue=new Venue();
                   try {
                       if(nue.save()){
                   JOptionPane.showMessageDialog(rootPane,"Saved ");
                 }
                   } catch (IOException ex) {
                       Logger.getLogger(OfficiantDashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
                   }



               }
           });
         }
               
        else {
                
         setTitle("Venue Dashboard");
        setSize(650, 700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
           Check=new JLabel();
            JOptionPane.showMessageDialog(null, "ArrayList is empty and There's No Venue");
            Check.setText("ArrayList is empty and There's No Venue");
            Check.setBounds(50,50,300,200);
            add(Check);
            
            
            
        AddButton = new JButton("Add");
        AddButton.setBounds(400, 600, 80, 30);
        add(AddButton);
        AddButton.setVisible(true);
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                AddVenueDashBoardGUI addvue  = new AddVenueDashBoardGUI();
                    addvue.setVisible(true);
                    setVisible(false);
                
}
        });
            
          }
        
        
        
    }
    
    
}
