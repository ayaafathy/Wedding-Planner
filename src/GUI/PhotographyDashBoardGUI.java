/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Entertainment.Photography;
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
public class PhotographyDashBoardGUI extends JFrame {

   private JLabel NameTagLabel;
   private JLabel WebsiteTagLabel;
   private JLabel PhoneNumberTagLabel;
   private JLabel IDTagLabel;
   private JLabel PhotoSalaryTagLabel;
   private JLabel PhotoThemeTagLabel;
   private JLabel ActionTagLabel;
   
   private JLabel NameLabel;
   private JLabel WebsiteLabel;
   private JLabel PhoneNumberLabel;
   private JLabel IDLabel;
   private JLabel PhotoSalaryLabel;
   private JLabel PhotoThemeLabel;
   private JLabel checkLabel;
   
   private JButton SaveButton;
   private JButton AddButton;
   
   public static ArrayList<Photography>PhotographyArrayList=new ArrayList();
   
   int x_cor =50;
   int y_cor=80;
   
   public PhotographyDashBoardGUI(){
       
        setTitle("Photography Dashboard");
        setSize(800,800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       if(PhotographyArrayList.size()!=0){
           
           NameTagLabel=new JLabel ("Name");
           WebsiteTagLabel=new JLabel("Website");
           PhoneNumberTagLabel=new JLabel("PhoneNumber");
           IDTagLabel=new JLabel("ID");
           PhotoSalaryTagLabel=new JLabel("PhotoSalary");
           PhotoThemeTagLabel=new JLabel("PhotoTheme");
           ActionTagLabel=new JLabel("Actions");
           
            NameTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
            WebsiteTagLabel.setBounds(x_cor +150,y_cor-50,100,30);
            PhoneNumberTagLabel.setBounds(x_cor +250,y_cor-50,100,30);
            IDTagLabel.setBounds(x_cor +350,y_cor-50,100,30);
            PhotoSalaryTagLabel.setBounds(x_cor +450,y_cor-50,100,30);
            PhotoThemeTagLabel.setBounds(x_cor +550,y_cor-50,100,30);
            ActionTagLabel.setBounds(x_cor +700,y_cor-50,100,30);
            
            NameTagLabel.setForeground(Color.red);
            WebsiteTagLabel.setForeground(Color.red);
            PhoneNumberTagLabel.setForeground(Color.red);
            IDTagLabel.setForeground(Color.red);
            PhotoSalaryTagLabel.setForeground(Color.red);
            PhotoThemeTagLabel.setForeground(Color.red);
            ActionTagLabel.setForeground(Color.red);
            
            add(NameTagLabel);
            add(WebsiteTagLabel);
            add(PhoneNumberTagLabel);
            add(IDTagLabel);
            add(PhotoSalaryTagLabel);
            add(PhotoThemeTagLabel);
            add(ActionTagLabel);
            
           for(int i=0;i<PhotographyArrayList.size();i++){
               
               NameLabel= new JLabel(PhotographyArrayList.get(i).getName());
               WebsiteLabel=new JLabel(PhotographyArrayList.get(i).getWebsite());
               PhoneNumberLabel=new JLabel(PhotographyArrayList.get(i).getPhoneNumber());
               IDLabel=new JLabel(PhotographyArrayList.get(i).getID());
               String stri = Double.toString(PhotographyArrayList.get(i).getPhotographySalary());
               PhotoSalaryLabel=new JLabel(stri);
               PhotoThemeLabel=new JLabel(PhotographyArrayList.get(i).getPhotosTheme());
               
               NameLabel.setBounds(x_cor ,y_cor  ,100,30);
               WebsiteLabel.setBounds(x_cor +150 ,y_cor  ,100,30);
               PhoneNumberLabel.setBounds(x_cor +250 ,y_cor  ,100,30);
               IDLabel.setBounds(x_cor +350 ,y_cor  ,100,30);
               PhotoSalaryLabel.setBounds(x_cor +450 ,y_cor  ,100,30);
               PhotoThemeLabel.setBounds(x_cor +550 ,y_cor  ,100,30);
               
               add(NameLabel);
               add(WebsiteLabel);
               add(PhoneNumberLabel);
               add(IDLabel);
               add(PhotoSalaryLabel);
               add(PhotoThemeLabel);
               
               JButton editButton=new JButton("Edit");
               editButton.setBounds(x_cor + 650, y_cor, 70, 30);
               add(editButton);
               editButton.setActionCommand(""+i);
               editButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                     int index= Integer.parseInt(e.getActionCommand());
                     EditPhotoDashBoardGUI yKL =new EditPhotoDashBoardGUI(index,  NameLabel.getText(),
                     WebsiteLabel.getText(),    
                     PhoneNumberLabel.getText(),
                     IDLabel.getText(),
                     PhotoSalaryLabel.getText(),
                     PhotoThemeLabel.getText());
                     NameLabel.getText();
                     WebsiteLabel.getText();    
                     PhoneNumberLabel.getText();
                     IDLabel.getText();
                     PhotoSalaryLabel.getText();
                     PhotoThemeLabel.getText();
                     dispose();
                  }
               });
               
               
                JButton deleteButton=new JButton("Delete");
               deleteButton.setBounds(x_cor + 750, y_cor, 70, 30);
               add(deleteButton);
               deleteButton.setActionCommand(""+i);
               
               deleteButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                   JOptionPane.showConfirmDialog(rootPane, "for sure to delete this Photography");
                    int index = Integer.parseInt(e.getActionCommand());
                    PhotographyDashBoardGUI.PhotographyArrayList.remove(index);
                    PhotographyDashBoardGUI PHdash=new PhotographyDashBoardGUI();
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
              AddPhotoDashBoardGUI thadd=new AddPhotoDashBoardGUI();
              thadd.setVisible(true);
              dispose();
 }
           });
               
            SaveButton= new JButton("Save");
           SaveButton.setBounds(500, 600, 80, 30);
           add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                
                   Photography Phty=new Photography();
                   try {
                       if(Phty.save()){
                   JOptionPane.showMessageDialog(rootPane,"Saved ");
                 }
                   } catch (IOException ex) {
                       Logger.getLogger(OfficiantDashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
                   }



               }
           });
         }
               
               
       else{
           
        setTitle("Photography Dashboard");
        setSize(650, 700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            checkLabel=new JLabel();
            JOptionPane.showMessageDialog(null, "ArrayList is empty and There's No Photography");
            checkLabel.setText("ArrayList is empty and There's No Photography");
            checkLabel.setBounds(50,50,300,200);
            add(checkLabel);
           
            
        AddButton = new JButton("Add");
        AddButton.setBounds(400, 600, 80, 30);
        add(AddButton);
        AddButton.setVisible(true);
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                AddPhotoDashBoardGUI addphtyu  = new AddPhotoDashBoardGUI();
                    addphtyu.setVisible(true);
                    setVisible(false);
                
}
        });
            
          }
        
        
        
    }
    
    
}
