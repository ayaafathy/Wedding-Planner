/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import static GUI.OfficiantDashBoardGUI.OfficiantArrayList;
import WeddVendors.Decorations.Florists;
import WeddVendors.Officiant;
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
public class FloristsDashBoardGUI extends JFrame {
    
    private JLabel FlowerTagLabel;
    private JLabel actionTagLabel;
    
    private JLabel FlowerLabel;
    private JLabel CheckLabel;
    
    private JButton SaveButton;
    private JButton AddButton;
    
    
    public static ArrayList<Florists>FloristsArrayList=new ArrayList();
     int x_cor =50;
     int y_cor=80;
    
    
    public FloristsDashBoardGUI(){
        
        setTitle("Florist Dashboard");
        setSize(800,800);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(FloristsArrayList.size()!=0){
            
          FlowerTagLabel=new JLabel("Flowers");
          actionTagLabel=new JLabel("Actions");
          
          FlowerTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
          actionTagLabel.setBounds(x_cor + 400, y_cor - 50, 100, 30);
            
          FlowerTagLabel.setForeground(Color.red);
          actionTagLabel.setForeground(Color.red);
            
           add(FlowerTagLabel);
           add(actionTagLabel);
            
            
            for(int i=0; i<FloristsArrayList.size();i++){
               FlowerLabel=new JLabel(FloristsArrayList.get(i).getFlowers());
               FlowerLabel.setBounds(x_cor ,y_cor  ,100,30);
               add(FlowerLabel);
            
               
               JButton editButton=new JButton("Edit");
               editButton.setBounds(x_cor + 350, y_cor, 70, 30);
               add(editButton);
               editButton.setActionCommand(""+i);
               editButton.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                     int index= Integer.parseInt(e.getActionCommand());
                     EditFloristsDashBoardGUI xy =new EditFloristsDashBoardGUI(index, FlowerLabel.getText());
                     FlowerLabel.getText();
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
                   JOptionPane.showConfirmDialog(rootPane, "for sure to delete this Florists");
                    int index = Integer.parseInt(e.getActionCommand());
                    FloristsDashBoardGUI.FloristsArrayList.remove(index);
                    FloristsDashBoardGUI flodashB=new FloristsDashBoardGUI();
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
              AddFloristsDashBoardGUI afdfl=new AddFloristsDashBoardGUI();
              afdfl.setVisible(true);
              dispose();
 }
           });
           
            SaveButton= new JButton("Save");
           SaveButton.setBounds(500, 600, 80, 30);
           add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                
                   Florists fld=new Florists();
                   try {
                       if(fld.save()){
                   JOptionPane.showMessageDialog(rootPane,"Saved ");
                 }
                   } catch (IOException ex) {
                       Logger.getLogger(OfficiantDashBoardGUI.class.getName()).log(Level.SEVERE, null, ex);
                   }



               }
           });
         }
        
        else{
        setTitle("Florists Dashboard");
        setSize(350, 500);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         CheckLabel=new JLabel();
            JOptionPane.showMessageDialog(null, "ArrayList is empty and There's No Florists");
            CheckLabel.setText("ArrayList is empty and There's No Florists");
            CheckLabel.setBounds(50,50,300,200);
            add(CheckLabel);
        
        
         AddButton = new JButton("Add");
        AddButton.setBounds(400, 600, 80, 30);
        add(AddButton);
        AddButton.setVisible(true);
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                AddFloristsDashBoardGUI affdk  = new AddFloristsDashBoardGUI();
                    affdk.setVisible(true);
                    setVisible(false);
                
}
        });
            
          }
        
        
        
    }
    
    
}
