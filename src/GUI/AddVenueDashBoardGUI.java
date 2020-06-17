/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Officiant;
import WeddVendors.Venue;
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
public class AddVenueDashBoardGUI extends JFrame{
    
    private JLabel VenueNameLabel;
    private JTextField VenueNameField;
    private JLabel VenueIDLabel;
    private JTextField VenueIDField;
    private JLabel VenuePhoneNumberLabel;
    private JTextField VenuePhoneNumberField;
    private JLabel VenueWebsiteLabel;
    private JTextField VenueWebsiteField;
    private JLabel VenueRatingLabel;
    private JTextField VenueRatingField;
    private JLabel VenueSettingLabel;
    private JTextField VenueSettingField;
    private JLabel VenueCapacityLabel;
    private JTextField VenueCapacityField;
    private JLabel VenuePriceLabel;
    private JTextField VenuePriceField;
    private JButton SaveButton;
    
    int width = 300;
    int height = 30;
    
    
    public AddVenueDashBoardGUI(){
        
         setTitle("Add Venue");
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        VenueNameLabel=new JLabel("Venue Name");
        VenueNameField=new JTextField();
        VenueIDLabel=new JLabel("Venue ID");
        VenueIDField=new JTextField();
        VenuePhoneNumberLabel=new JLabel("Venue PhoneNumber");
        VenuePhoneNumberField=new JTextField();
        VenueWebsiteLabel=new JLabel("Venue Website");
        VenueWebsiteField=new JTextField();
        VenueRatingLabel=new JLabel("Venue Rating");
        VenueRatingField=new JTextField();
        VenueSettingLabel=new JLabel("Venue Setting");
        VenueSettingField=new JTextField();
        VenueCapacityLabel=new JLabel("Venue Capacity");
        VenueCapacityField=new JTextField();
        VenuePriceLabel=new JLabel("Venue Price");
        VenuePriceField=new JTextField();
        SaveButton=new JButton ("Add");
        SaveButton.addActionListener(e->this.dispose());
        
        VenueNameLabel.setBounds(50,50,width,height);
        VenueNameField.setBounds(200,50,width,height);
        VenueIDLabel.setBounds(50,100,width,height);
        VenueIDField.setBounds(200,100,width,height);
        VenuePhoneNumberLabel.setBounds(50,150,width,height);        
        VenuePhoneNumberField.setBounds(200,150,width,height);
        VenueWebsiteLabel.setBounds(50,200,width,height);
        VenueWebsiteField.setBounds(200,200,width,height);
        VenueRatingLabel.setBounds(50,250,width,height);
        VenueRatingField.setBounds(200,250,width,height);        
        VenueSettingLabel.setBounds(50,300,width,height);        
        VenueSettingField.setBounds(200,300,width,height);        
        VenueCapacityLabel.setBounds(50,350,width,height);       
        VenueCapacityField.setBounds(200,350,width,height);        
        VenuePriceLabel.setBounds(50,400,width,height);        
        VenuePriceField.setBounds(200,400,width,height);
        SaveButton.setBounds(200,500,width,height);        
        
        add(VenueNameLabel);
        add(VenueNameField);
        add(VenueIDLabel);
        add(VenueIDField);
        add(VenuePhoneNumberLabel);
        add(VenuePhoneNumberField);
        add(VenueWebsiteLabel);
        add(VenueWebsiteField);
        add(VenueRatingLabel);
        add(VenueRatingField);
        add(VenueSettingLabel);
        add(VenueSettingField);
        add(VenueCapacityLabel);
        add(VenueCapacityField);
        add(VenuePriceLabel);
        add(VenuePriceField);
        add(SaveButton);
                
        SaveButton.addActionListener(new Action());
    }
    private class Action implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          Venue veneu=new Venue();
          veneu.setName(VenueNameField.getText());
          veneu.setID(VenueIDField.getText());
          veneu.setPhoneNumber(VenuePhoneNumberField.getText());
          veneu.setWebsite(VenueWebsiteField.getText());
          veneu.setVenueRate(VenueRatingField.getText());
          veneu.setVenueSetting(VenueSettingField.getText());
          veneu.setVenueCapacity(Integer.parseInt(VenueCapacityField.getText()));
          veneu.setVenuePrice(Integer.parseInt(VenuePriceField.getText()));
          VenuesDashBoardGUI.venuesArrayList.add(veneu);
          VenuesDashBoardGUI vedb = new VenuesDashBoardGUI();
          vedb.setVisible(true);
        }
    }

}
