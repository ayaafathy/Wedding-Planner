/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Entertainment.DJ;
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
public class EditDJDashBoardGUI extends JFrame{
    
    private JLabel NameLabel;
    private JTextField NameField;
    
    private JLabel WebsiteLabel;
    private JTextField WebsiteField;
    
    private JLabel PhoneNumberLabel;
    private JTextField PhoneNumberField;
    
    private JLabel IDLabel;
    private JTextField IDField;
    
    private JLabel SalaryLabel;
    private JTextField SalaryField;
    
    private JButton SaveButton;
    
    public EditDJDashBoardGUI(int index, String name , String website, String Number, String ID, String salary){
        
        setTitle("Edit DJ");
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
        SalaryLabel=new JLabel("Salary");
        SalaryField=new JTextField();
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
        SalaryLabel.setBounds(50,250,width,height);
        SalaryField.setBounds(200,250,width,height);
        SaveButton.setBounds(200,300,width,height);
        
        add(NameLabel);
        add(NameField);
        add(WebsiteLabel);
        add(WebsiteField);
        add(PhoneNumberLabel);
        add(PhoneNumberField);
        add(IDLabel);
        add(IDField);
        add(SalaryLabel);
        add(SalaryField);
        add(SaveButton);
        
        
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             DJ dj=new DJ( Integer.parseInt(SalaryField.getText()),NameField.getText(), WebsiteField.getText(),
                     PhoneNumberField.getText(),  IDField.getText() );
            
            
             DJDashBoardGUI.DJArrayList.set(index,dj);
             DJDashBoardGUI offdbGUI=new DJDashBoardGUI();
             dispose();
             
 }
        });
      
    }
    
        
     public EditDJDashBoardGUI(int index, DJ dej){
        
        setTitle("Edit DJ");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        NameLabel=new JLabel("Name");
        NameField=new JTextField(dej.getName());
        WebsiteLabel=new JLabel("Website");
        WebsiteField=new JTextField(dej.getWebsite());
        PhoneNumberLabel=new JLabel("PhoneNumber");
        PhoneNumberField=new JTextField(dej.getPhoneNumber());
        IDLabel=new JLabel("ID");
        IDField=new JTextField(dej.getID());
        SalaryLabel=new JLabel("Salary");
        SalaryField=new JTextField((int) dej.getDjSalary());
        SaveButton=new JButton("Edit");
        
        
        NameLabel.setBounds(50,50,width,height);
        NameField.setBounds(200,50,width,height);
        WebsiteLabel.setBounds(50,100,width,height);
        WebsiteField.setBounds(200,100,width,height);
        PhoneNumberLabel.setBounds(50,150,width,height);
        PhoneNumberField.setBounds(200,150,width,height);
        IDLabel.setBounds(50,200,width,height);
        IDField.setBounds(200,200,width,height);
        SalaryLabel.setBounds(50,250,width,height);
        SalaryField.setBounds(200,250,width,height);
        SaveButton.setBounds(200,300,width,height);
        
        add(NameLabel);
        add(NameField);
        add(WebsiteLabel);
        add(WebsiteLabel);
        add(WebsiteField);
        add(PhoneNumberLabel);
        add(PhoneNumberField);
        add(IDLabel);
        add(IDField);
        add(SalaryLabel);
        add(SalaryField);
        add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DJ updateddj=new DJ();
                
                NameField.getText();
                WebsiteField.getText();
                PhoneNumberField.getText();
                IDField.getText();
                Integer.parseInt(SalaryField.getText());
                DJDashBoardGUI.DJArrayList.set(index,updateddj);
                DJDashBoardGUI djdashb=new DJDashBoardGUI();
                djdashb.setVisible(true);
                 dispose(); 
                 
            }
        });
                
        }
    
 }
