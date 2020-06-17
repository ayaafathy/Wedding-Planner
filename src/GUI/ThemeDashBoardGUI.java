/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import static GUI.FloristsDashBoardGUI.FloristsArrayList;
import WeddVendors.*;
import WeddVendors.Decorations.Florists;
import WeddVendors.Decorations.Theme;
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
import GUI.*;


/**
 *
 * @author 2tech
 */
public class ThemeDashBoardGUI extends JFrame {
    
    private JLabel ThemeTagLabel;
    private JLabel actionTagLabel;
    
    private JLabel ThemeLabel;
    private JLabel CheckLabel;
    
    private JButton SaveButton;
    private JButton AddButton;
    
    
    public static ArrayList<Theme>ThemeArrayList=new ArrayList();
     int x_cor =50;
     int y_cor=80;
    
     public ThemeDashBoardGUI(){
         
        setTitle("Theme Dashboard");
        setSize(800,800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(ThemeArrayList.size()!=0){
            
          ThemeTagLabel=new JLabel("Theme");
          actionTagLabel=new JLabel("Actions");
          
          ThemeTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
          actionTagLabel.setBounds(x_cor + 400, y_cor - 50, 100, 30);
            
          ThemeTagLabel.setForeground(Color.red);
          actionTagLabel.setForeground(Color.red);
            
           add(ThemeTagLabel);
           add(actionTagLabel);
            
         for(int i=0; i<ThemeArrayList.size();i++){
               ThemeLabel=new JLabel(ThemeArrayList.get(i).getThemeStyle());
               ThemeLabel.setBounds(x_cor ,y_cor  ,100,30);
               add(ThemeLabel);
         
                JButton editButton=new JButton("Edit");
               editButton.setBounds(x_cor + 350, y_cor, 70, 30);
               add(editButton);
               editButton.setActionCommand(""+i);
               editButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                     int index= Integer.parseInt(e.getActionCommand());
                     EditThemeDashBoardGUI xyf =new EditThemeDashBoardGUI(index,ThemeLabel.getText());
                     
                     ThemeLabel.getText();
                     
                     dispose();
                  }
               });
         
                JButton deleteButton=new JButton("Delete");
               deleteButton.setBounds(x_cor + 450, y_cor, 70, 30);
               add(deleteButton);
               deleteButton.setActionCommand(""+i);
               
               deleteButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                   JOptionPane.showConfirmDialog(rootPane, "for sure to delete this Theme");
                    int index = Integer.parseInt(e.getActionCommand());
                    ThemeDashBoardGUI.ThemeArrayList.remove(index);
                    ThemeDashBoardGUI thedashB=new ThemeDashBoardGUI();
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
              AddThemeDashBoardGUI hatvuv=new AddThemeDashBoardGUI();
              hatvuv.setVisible(true);
              dispose();
 }
           });
         
           SaveButton= new JButton("Save");
           SaveButton.setBounds(500, 600, 80, 30);
           add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                
                   Theme hte=new Theme();
                   try {
                       if(hte.save()){
                   JOptionPane.showMessageDialog(rootPane,"Saved ");
                 }
                   } catch (IOException ex) {
                       Logger.getLogger(OfficiantDashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
                   }



               }
           });
         }
        else {
            
        setTitle("Theme Dashboard");
        setSize(350, 500);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            CheckLabel=new JLabel();
            JOptionPane.showMessageDialog(null, "ArrayList is empty and There's No Theme");
            CheckLabel.setText("ArrayList is empty and There's No Theme");
            CheckLabel.setBounds(50,50,300,200);
            add(CheckLabel);
        
            
            
         AddButton = new JButton("Add");
        AddButton.setBounds(400, 600, 80, 30);
        add(AddButton);
        AddButton.setVisible(true);
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                AddThemeDashBoardGUI htfgr  = new AddThemeDashBoardGUI();
                    htfgr.setVisible(true);
                    setVisible(false);
                
}
        });
            
          }
        
        
        
    }
    
    
}
