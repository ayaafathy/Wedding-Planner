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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 2tech
 */
public class EditPhotoDashBoardGUI extends JFrame {
    
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
    
    public EditPhotoDashBoardGUI(int index ,String name,String website, String num, String ID, String theme, String salary){
        
        setTitle("Edit Photography");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        int width = 300;
        int height = 30;
        
        NameLabel= new JLabel ("Name");
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
        SaveButton=new JButton("Save");
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
        
         SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             Photography photo=new Photography( Integer.parseInt(PhotoSalaryField.getText()), NameField.getText(),
             WebsiteField.getText(),
             PhoneNumberField.getText(),
             IDField.getText(), PhotoThemeField.getText());
            
            
            
             PhotographyDashBoardGUI.PhotographyArrayList.set(index,photo);
             PhotographyDashBoardGUI phtdbGUI=new PhotographyDashBoardGUI();
             dispose();
             
 }
        });
      
    }
    
public EditPhotoDashBoardGUI(int index, Photography photo){

        setTitle("Edit Photography");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        NameLabel=new JLabel("Name");
        NameField=new JTextField(photo.getName());
        WebsiteLabel=new JLabel("Website");
        WebsiteField=new JTextField(photo.getWebsite());
        PhoneNumberLabel=new JLabel("Phone Number");
        PhoneNumberField=new JTextField(photo.getPhoneNumber());
        IDLabel=new JLabel("ID");
        IDField=new JTextField(photo.getID());
        PhotoSalaryLabel=new JLabel("PhotoSalary");
        PhotoSalaryField=new JTextField((int) photo.getPhotographySalary());
        PhotoThemeLabel=new JLabel("PhotoTheme");
        PhotoThemeField=new JTextField(photo.getPhotosTheme());
        SaveButton=new JButton("Edit");


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
        
        
SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Photography updatedph=new Photography();
                
                NameField.getText();
                WebsiteField.getText();
                PhoneNumberField.getText();
                IDField.getText();
                Double.parseDouble(PhotoSalaryField.getText());
                PhotoThemeField.getText();
                PhotographyDashBoardGUI.PhotographyArrayList.set(index,updatedph);
                PhotographyDashBoardGUI phdashb=new PhotographyDashBoardGUI();
                phdashb.setVisible(true);
                 dispose(); 
                 
            }
        });
                
        }
    
 }
