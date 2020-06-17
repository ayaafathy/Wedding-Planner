/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import WeddVendors.*;

/**
 *
 * @author Jana
 */
public class AddHotel extends JFrame {

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

    int x_cor = 50;
    int y_cor = 50;
    int width = 300;
    int height = 30;

    public AddHotel() {

        setTitle("Add Hotel");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        saveButton = new JButton("ADD");
        saveButton.addActionListener(e -> this.dispose());

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
        saveButton.addActionListener(new Action());

       
    }

    private class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Hotel hh = new Hotel();
            hh.setName(NameField.getText());
            hh.setWebsite(WebsiteField.getText());
            hh.setID(IDField.getText());
            hh.setPhoneNumber(NumberField.getText());
            hh.setHotelRate(RatingField.getText());
            HotelDashboard.HotelssArrayList.add(hh);
            HotelDashboard fr = new HotelDashboard();
            fr.setVisible(true);
        }
    }

}
