/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.DJDashBoardGUI.DJArrayList;
import WeddVendors.Entertainment.DJ;
import WeddVendors.WeddBuffet.Cheif;
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
public class CheifDashBoardGUI extends JFrame{
    
    private JLabel NameTagLabel;
    private JLabel WebsiteTagLabel;
    private JLabel PhoneNumberTagLabel;
    private JLabel IDTagLabel;
    private JLabel CheifSalaryTagLabel;
    private JLabel actionTagLabel;
    
    private JLabel NameLabel;
    private JLabel WebsiteLabel;
    private JLabel PhoneNumberLabel;
    private JLabel IDLabel;
    private JLabel CheifSalaryLabel;
    private JLabel checkLabel;
    
    private JButton SaveButton;
    private JButton AddButton;
    
    public static ArrayList<Cheif>CheifArrayList=new ArrayList();
         int x_cor =50;
         int y_cor=80;
    
         public CheifDashBoardGUI(){
             
        setTitle("Cheif Dashboard");
        setSize(800,800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
             
         if(CheifArrayList.size()!=0){
             
           NameTagLabel=new JLabel("Name");
           WebsiteTagLabel=new JLabel("Website");
           PhoneNumberTagLabel=new JLabel("PhoneNumber");
           IDTagLabel=new JLabel("ID");
           CheifSalaryTagLabel=new JLabel("Salary");
           actionTagLabel=new JLabel("Actions");
            
           NameTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
           WebsiteTagLabel.setBounds(x_cor + 150, y_cor - 50, 100, 30);
           PhoneNumberTagLabel.setBounds(x_cor + 250, y_cor - 50, 100, 30);
           IDTagLabel.setBounds(x_cor + 350, y_cor - 50, 100, 30);
           CheifSalaryTagLabel.setBounds(x_cor + 450, y_cor - 50, 100, 30);
           actionTagLabel.setBounds(x_cor + 600, y_cor - 50, 100, 30);
            
           NameTagLabel.setForeground(Color.red);
           WebsiteTagLabel.setForeground(Color.red);
           PhoneNumberTagLabel.setForeground(Color.red);
           IDTagLabel.setForeground(Color.red);
           CheifSalaryTagLabel.setForeground(Color.red);
           actionTagLabel.setForeground(Color.red);
           
           add(NameTagLabel);
           add(WebsiteTagLabel);
           add(PhoneNumberTagLabel);
           add(IDTagLabel);
           add(CheifSalaryTagLabel);
           add(actionTagLabel);
          
            for(int i=0; i<CheifArrayList.size();i++){
                
               NameLabel=new JLabel(CheifArrayList.get(i).getName());
               WebsiteLabel=new JLabel(CheifArrayList.get(i).getWebsite());
               PhoneNumberLabel=new JLabel(CheifArrayList.get(i).getPhoneNumber());
               IDLabel=new JLabel(CheifArrayList.get(i).getID());
               String stri = Double.toString(CheifArrayList.get(i).getCheifSalary());
               CheifSalaryLabel=new JLabel(stri);
               
               NameLabel.setBounds(x_cor ,y_cor  ,100,30);
               WebsiteLabel.setBounds(x_cor +150,y_cor , 100, 30);
               PhoneNumberLabel.setBounds(x_cor +250,y_cor , 100, 30);
               IDLabel.setBounds(x_cor +350,y_cor , 100, 30);
               CheifSalaryLabel.setBounds(x_cor +450,y_cor , 100, 30);
               
               add(NameLabel);
               add(WebsiteLabel);
               add(PhoneNumberLabel);
               add(IDLabel);
               add(CheifSalaryLabel);  
                
                
                JButton editButton=new JButton("Edit");
               editButton.setBounds(x_cor + 550, y_cor, 70, 30);
               add(editButton);
               editButton.setActionCommand(""+i);
               editButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                     int index= Integer.parseInt(e.getActionCommand());
                     EditCheifDashBoardGUI yoL =new EditCheifDashBoardGUI(index,  NameLabel.getText(),
                     WebsiteLabel.getText(), 
                     PhoneNumberLabel.getText(),
                     IDLabel.getText(),
                     CheifSalaryLabel.getText());
                     NameLabel.getText();
                     WebsiteLabel.getText();    
                     PhoneNumberLabel.getText();
                     IDLabel.getText();
                     CheifSalaryLabel.getText();
                     dispose();
                  }
               });
                
               JButton deleteButton=new JButton("Delete");
               deleteButton.setBounds(x_cor + 650, y_cor, 70, 30);
               add(deleteButton);
               deleteButton.setActionCommand(""+i);
               
               deleteButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                   JOptionPane.showConfirmDialog(rootPane, "for sure to delete this Cheif");
                    int index = Integer.parseInt(e.getActionCommand());
                    CheifDashBoardGUI.CheifArrayList.remove(index);
                    CheifDashBoardGUI CHdash=new CheifDashBoardGUI();
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
              AddCheifDashBoardGUI chefadd=new AddCheifDashBoardGUI();
              chefadd.setVisible(true);
              dispose();
 }
           });  
                
             SaveButton= new JButton("Save");
           SaveButton.setBounds(500, 600, 80, 30);
           add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                
                   Cheif chj=new Cheif();
                   try {
                       if(chj.save()){
                   JOptionPane.showMessageDialog(rootPane,"Saved ");
                 }
                   } catch (IOException ex) {
                       Logger.getLogger(OfficiantDashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
                   }



               }
           });
         }   
                
         else{
             
        setTitle("Cheif Dashboard");
        setSize(650, 700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
       checkLabel=new JLabel();
       JOptionPane.showMessageDialog(null, "ArrayList is empty and There's No Cheif");
       checkLabel.setText("ArrayList is empty and There's No Cheif");
       checkLabel.setBounds(50,50,300,200);
       add(checkLabel);
            
        AddButton = new JButton("Add");
        AddButton.setBounds(400, 600, 80, 30);
        add(AddButton);
        AddButton.setVisible(true);
        AddButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
               
                AddCheifDashBoardGUI addche  = new AddCheifDashBoardGUI();
                    addche.setVisible(true);
                    setVisible(false);
                
}
        });
            
          }
        
        
        
    }
    
    
}
