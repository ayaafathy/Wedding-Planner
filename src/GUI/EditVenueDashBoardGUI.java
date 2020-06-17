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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 2tech
 */
public class EditVenueDashBoardGUI extends JFrame{
    
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
    
    
    public EditVenueDashBoardGUI(int index,String venueRate, String venueSetting, String venueCapacity, String venuePrice, String name, String website, String phoneNumber, String ID){
        
        setTitle("Edit Venue");
        setSize(800,600);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
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
        SaveButton=new JButton ("Save");
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
        SaveButton.addActionListener(new ActionListener() {
         @Override
            public void actionPerformed(ActionEvent e) {

             Venue ven=new Venue(VenueNameField.getText(),
             VenueIDField.getText(),
                     Integer.parseInt(VenueCapacityField.getText()),
             Integer.parseInt(VenuePriceField.getText()),
             VenuePhoneNumberField.getText(),
             VenueWebsiteField.getText(),
             VenueRatingField.getText(),
             VenueSettingLabel.getText()
             );
             
             VenuesDashBoardGUI.venuesArrayList.set(index,ven);
             VenuesDashBoardGUI vendbGUI=new VenuesDashBoardGUI();
             dispose();
             
 }
        });
      
    }
    public EditVenueDashBoardGUI(int index, Venue venue){
        
        setTitle("Edit Venue");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        
        VenueNameLabel=new JLabel("Venue Name");
        VenueNameField=new JTextField(venue.getName());
        VenueIDLabel=new JLabel("Venue ID");
        VenueIDField=new JTextField(venue.getID());
        VenuePhoneNumberLabel=new JLabel("Venue PhoneNumber");
        VenuePhoneNumberField=new JTextField(venue.getPhoneNumber());
        VenueWebsiteLabel=new JLabel("Venue Website");
        VenueWebsiteField=new JTextField(venue.getWebsite());
        VenueRatingLabel=new JLabel("Venue Rating");
        VenueRatingField=new JTextField(venue.getVenueRate());
        VenueSettingLabel=new JLabel("Venue Setting");
        VenueSettingField=new JTextField(venue.getVenueSetting());
        VenueCapacityLabel=new JLabel("Venue Capacity");
        VenueCapacityField=new JTextField(venue.getVenueCapacity());
        VenuePriceLabel=new JLabel("Venue Price");
        VenuePriceField=new JTextField((int)venue.getVenuePrice());
        SaveButton=new JButton("Edit");
        
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
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Venue updatedvenue=new Venue();
                VenueNameField.getText();
                VenueIDField.getText();
                VenuePhoneNumberField.getText();
                VenueWebsiteField.getText();
                VenueRatingField.getText();
                VenueSettingField.getText();
                Integer.parseInt(VenueCapacityField.getText());
                Double.parseDouble(VenuePriceField.getText());
                VenuesDashBoardGUI.venuesArrayList.set(index,updatedvenue);
                VenuesDashBoardGUI venudbgui=new VenuesDashBoardGUI();
                venudbgui.setVisible(true);
                 dispose(); 
                 
            }
        });
                
        }
    
 }
