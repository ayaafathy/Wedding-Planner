/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import WeddVendors.Decorations.Theme;
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
public class EditThemeDashBoardGUI extends JFrame{
    
    private JLabel ThemeTypeLabel;
    private JTextField ThemeTypeField;
    
    private JButton SaveButton;
    
    public EditThemeDashBoardGUI(int index, String theme){
        
        setTitle("Edit Theme");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        ThemeTypeLabel=new JLabel("Theme Type");
        ThemeTypeField=new JTextField();
        SaveButton=new JButton("Save");
        SaveButton.addActionListener(e->this.dispose());
        
        ThemeTypeLabel.setBounds(50,50,width,height);
        ThemeTypeField.setBounds(200,50,width,height);
        SaveButton.setBounds(200,100,width,height);
        
        
        add(ThemeTypeLabel);
        add(ThemeTypeField);
        add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             Theme the=new Theme(ThemeTypeField.getText());
             
             ThemeDashBoardGUI.ThemeArrayList.set(index,the);
             ThemeDashBoardGUI TheDashB=new ThemeDashBoardGUI();
             dispose();
             
 }
       });
      
    }
    
    
    
    
     public EditThemeDashBoardGUI(int index, Theme theme){
        
        setTitle("Edit Theme");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        
        ThemeTypeLabel=new JLabel("Theme");
        ThemeTypeField=new JTextField(theme.getThemeStyle());
        SaveButton=new JButton("Edit");
        ThemeTypeLabel.setBounds(50,50,width,height);
        ThemeTypeField.setBounds(200,50,width,height);
        SaveButton.setBounds(200,100,width,height);
        
        add(ThemeTypeLabel);
        add(ThemeTypeField);
        add(SaveButton);
        
        
       SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               Theme updatedTheme=new Theme();
                updatedTheme.setThemeStyle(ThemeTypeField.getText());
                ThemeDashBoardGUI.ThemeArrayList.set(index,updatedTheme);
                ThemeDashBoardGUI thedashBGUI=new ThemeDashBoardGUI();
                thedashBGUI.setVisible(true);
                 dispose(); 
                 
            }
        });
                
        }
    
 }
