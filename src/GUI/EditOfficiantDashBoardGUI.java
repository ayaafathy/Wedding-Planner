/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Officiant;
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
public class EditOfficiantDashBoardGUI extends JFrame {
    
    private JLabel TitleLabel;
    private JTextField TitleField;
    
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
    
    public  EditOfficiantDashBoardGUI(int index,String title ,String Name,String Website,String PhoneNumber,String ID,String Salary ){
        
        setTitle("Edit Officiant");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        TitleLabel=new JLabel("Title");
        TitleField=new JTextField();
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
        
        
        TitleLabel.setBounds(50,50,width,height);
        TitleField.setBounds(200,50,width,height);
        NameLabel.setBounds(50,100,width,height);
        NameField.setBounds(200,100,width,height);
        WebsiteLabel.setBounds(50,150,width,height);
        WebsiteField.setBounds(200,150,width,height);
        PhoneNumberLabel.setBounds(50,200,width,height);
        PhoneNumberField.setBounds(200,200,width,height);
        IDLabel.setBounds(50,250,width,height);
        IDField.setBounds(200,250,width,height);
        SalaryLabel.setBounds(50,300,width,height);
        SalaryField.setBounds(200,300,width,height);
        SaveButton.setBounds(200,400,width,height);
        
        add(TitleLabel);
        add(TitleField);
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

             Officiant offi=new Officiant();
             TitleField.getText();
             NameField.getText();
             WebsiteField.getText();
             PhoneNumberField.getText();
             IDField.getText();
             Integer.parseInt(SalaryField.getText());
             OfficiantDashBoardGUI.OfficiantArrayList.set(index,offi);
             OfficiantDashBoardGUI offdbGUI=new OfficiantDashBoardGUI();
             dispose();
             
 }
        });
      
    }
    
    public EditOfficiantDashBoardGUI(int index, Officiant officiant){
        
        setTitle("Edit Officiant");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        
        TitleLabel=new JLabel("Title");
        TitleField=new JTextField(officiant.getTitle());
        NameLabel=new JLabel("Name");
        NameField=new JTextField(officiant.getName());
        WebsiteLabel=new JLabel("Website");
        WebsiteField=new JTextField(officiant.getWebsite());
        PhoneNumberLabel=new JLabel("PhoneNumber");
        PhoneNumberField=new JTextField(officiant.getPhoneNumber());
        IDLabel=new JLabel("ID");
        IDField=new JTextField(officiant.getID());
        SalaryLabel=new JLabel("Salary");
        SalaryField=new JTextField(officiant.getOffSalary());
        SaveButton=new JButton("Edit");
        
        TitleLabel.setBounds(50,50,width,height);
        TitleField.setBounds(200,50,width,height);
        NameLabel.setBounds(50,100,width,height);
        NameField.setBounds(200,100,width,height);
        WebsiteLabel.setBounds(50,150,width,height);
        WebsiteField.setBounds(200,150,width,height);
        PhoneNumberLabel.setBounds(50,200,width,height);
        PhoneNumberField.setBounds(200,200,width,height);
        IDLabel.setBounds(50,250,width,height);
        IDField.setBounds(200,250,width,height);
        SalaryLabel.setBounds(50,300,width,height);
        SalaryField.setBounds(200,300,width,height);
        SaveButton.setBounds(200,400,width,height);
        
        add(TitleLabel);
        add(TitleField);
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

                Officiant updatedOfficiant=new Officiant( Integer.parseInt(SalaryField.getText()), TitleField.getText(),
                NameField.getText(),
                WebsiteField.getText(),
                PhoneNumberField.getText(),
                IDField.getText());
              
                OfficiantDashBoardGUI.OfficiantArrayList.set(index,updatedOfficiant);
                OfficiantDashBoardGUI offidbgui=new OfficiantDashBoardGUI();
                offidbgui.setVisible(true);
                 dispose(); 
                 
            }
        });
                
        }
    
 }
