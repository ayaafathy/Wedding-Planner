/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Entertainment.DJ;
import WeddVendors.Entertainment.Photography;
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
public class AddPhotoDashBoardGUI extends JFrame{

    private JLabel NameLabel;
    private JTextField NameField;
    
    private JLabel WebsiteLabel;
    private JTextField WebsiteField;
    
    private JLabel PhoneNumberLabel;
    private JTextField PhoneNumberField;
    
    private JLabel IDLabel;
    private JTextField IDField;
    
    private JLabel PhotoSalaryLabel;
    private JTextField PhotoSalaryField;
    
    private JLabel PhotoThemeLabel;
    private JTextField PhotoThemeField;
    
    private JButton SaveButton;
    
     int width = 300;
    int height = 30;
    
    public AddPhotoDashBoardGUI(){
        
        setTitle("Add Photography");
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        NameLabel=new JLabel("Name");
        NameField=new JTextField();
        WebsiteLabel=new JLabel("Website");
        WebsiteField=new JTextField();
        PhoneNumberLabel=new JLabel("PhoneNumber");
        PhoneNumberField=new JTextField();
        IDLabel=new JLabel("ID");
        IDField=new JTextField();
        PhotoSalaryLabel=new JLabel("PhotoSalary");
        PhotoSalaryField=new JTextField();
        PhotoThemeLabel=new JLabel("PhotoTheme");
        PhotoThemeField=new JTextField();
        SaveButton=new JButton ("Add");
        SaveButton.addActionListener(e->this.dispose());
        
        NameLabel.setBounds(50,50,width,height);
        NameField.setBounds(200,50,width,height);
        WebsiteLabel.setBounds(50,100,width,height);
        WebsiteField.setBounds(200,100,width,height);
        PhoneNumberLabel.setBounds(50,150,width,height);
        PhoneNumberField.setBounds(200,150,width,height);
        IDLabel.setBounds(50,200,width,height);
        IDField.setBounds(200,200,width,height);
        PhotoSalaryLabel.setBounds(50,250,width,height);
        PhotoSalaryField.setBounds(200,250,width,height);
        PhotoThemeLabel.setBounds(50,300,width,height);
        PhotoThemeField.setBounds(200,300,width,height);
        SaveButton.setBounds(200,400,width,height);
        
        add(NameLabel);
        add(NameField);
        add(WebsiteLabel);
        add(WebsiteField);
        add(PhoneNumberLabel);
        add(PhoneNumberField);
        add(IDLabel);
        add(IDField);
        add(PhotoSalaryLabel);
        add(PhotoSalaryField);
        add(PhotoThemeLabel);
        add(PhotoThemeField);
        add(SaveButton);
        
       SaveButton.addActionListener(new Action());
        
   }
    private class Action implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          Photography pvh=new Photography();
          pvh.setName(NameField.getText());
          pvh.setWebsite(WebsiteField.getText());
          pvh.setPhoneNumber(PhoneNumberField.getText());
          pvh.setID(IDField.getText());
          pvh.setPhotographySalary(Integer.parseInt(PhotoSalaryField.getText()));
          pvh.setPhotosTheme(PhotoThemeField.getText());
          PhotographyDashBoardGUI.PhotographyArrayList.add(pvh);
          PhotographyDashBoardGUI frph = new PhotographyDashBoardGUI();
          frph.setVisible(true);
        }
    }

}
