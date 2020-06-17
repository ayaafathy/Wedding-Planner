/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Hotel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jana
 */
public class EditHotel extends JFrame {

    private JLabel NameLabel;
    private JTextField NameField;
    private JLabel WebsiteLabel;
    private JTextField WebsiteField;

    private JLabel NumberLabel;
    private JTextField NumberField;

    private JLabel IDLabel;
    private JTextField IDField;

    private JLabel RatingLabel;
    private JTextField RatingField;


    private JButton saveButton;
    
     public EditHotel(int index,  String name, String websitw,String number, String id,String rating) {

        setTitle("Edit Hotel");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int x_cor = 50;
        int y_cor = 50;
        int width = 300;
        int height = 30;
        
        
        NameLabel = new JLabel("Hotel Name");
        NameField = new JTextField();

         WebsiteLabel = new JLabel("Website");
         WebsiteField = new JTextField();

         NumberLabel = new JLabel("Phone Number");
         NumberField = new JTextField();

         IDLabel = new JLabel("ID");
         IDField = new JTextField();

         RatingLabel = new JLabel("Rating");
         RatingField = new JTextField();

        saveButton = new JButton("SAVE");
        saveButton.addActionListener(e->this.dispose());
        
        
        
        NameLabel.setBounds(50, 50, width, height);
        NameField.setBounds(200, 50, width, height);
        WebsiteLabel.setBounds(50, 100, width, height);
        WebsiteField.setBounds(200, 100, width, height);
        NumberLabel.setBounds(50, 150, width, height);
        NumberField.setBounds(200, 150, width, height);
        IDLabel.setBounds(50, 200, width, height);
        IDField.setBounds(200, 200, width, height);
        RatingLabel.setBounds(50, 250, width, height);
        RatingField.setBounds(200, 250, width, height);

        saveButton.setBounds(200, 300, 100, height);

        add(NameLabel);
        add(NameField);
        add(WebsiteLabel);
        add(WebsiteField);
        add(NumberLabel);
        add(NumberField);
        add(IDLabel);
        add(IDField);
        add(RatingLabel);
        add(RatingField);

        
         add(saveButton);
         saveButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Hotel updatedHotel = new Hotel( NameField.getText(),WebsiteField.getText(),NumberField.getText(),IDField.getText(),RatingField.getText());
            
                 HotelDashboard.HotelssArrayList.set(index, updatedHotel);
                 HotelDashboard dashboardGUI = new HotelDashboard();

                 dispose();
             }
        }); 
    }
      public EditHotel(int index, Hotel hotel){
           setTitle("Edit Student");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int x_cor = 50;
        int y_cor = 50;
        int width = 300;
        int height = 30;
        
        
        NameLabel = new JLabel("Hotel Name");
        NameField = new JTextField();

         WebsiteLabel = new JLabel("Website");
         WebsiteField = new JTextField();

         NumberLabel = new JLabel("Phone Number");
         NumberField = new JTextField();

         IDLabel = new JLabel("ID");
         IDField = new JTextField();

         RatingLabel = new JLabel("Rating");
         RatingField = new JTextField();

        saveButton = new JButton("SAVE");
        saveButton.addActionListener(e->this.dispose());
        
        
        
        NameLabel.setBounds(50, 50, width, height);
        NameField.setBounds(200, 50, width, height);
        WebsiteLabel.setBounds(50, 100, width, height);
        WebsiteField.setBounds(200, 100, width, height);
        NumberLabel.setBounds(50, 150, width, height);
        NumberField.setBounds(200, 150, width, height);
        IDLabel.setBounds(50, 200, width, height);
        IDField.setBounds(200, 200, width, height);
        RatingLabel.setBounds(50, 250, width, height);
        RatingField.setBounds(200, 250, width, height);

        saveButton.setBounds(200, 300, 100, height);

        add(NameLabel);
        add(NameField);
        add(WebsiteLabel);
        add(WebsiteField);
        add(NumberLabel);
        add(NumberField);
        add(IDLabel);
        add(IDField);
        add(RatingLabel);
        add(RatingField);

        
         add(saveButton);
         saveButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Hotel updatedHotel = new Hotel( NameField.getText(),WebsiteField.getText(),NumberField.getText(),IDField.getText(),RatingField.getText());
            
                 HotelDashboard.HotelssArrayList.set(index, updatedHotel);
                 HotelDashboard dashboardGUI = new HotelDashboard();

                 dispose();
             }
        }); 
      }
    }




