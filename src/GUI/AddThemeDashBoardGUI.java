/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Decorations.Florists;
import WeddVendors.Decorations.Theme;
import WeddVendors.Officiant;
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
public class AddThemeDashBoardGUI extends JFrame{
    
     private JLabel ThemeTypeLabel;
    private JTextField ThemeTypeField;
    
    private JButton SaveButton;
    
    int width = 300;
    int height = 30;
    
    public AddThemeDashBoardGUI(){
        
        setTitle("Add Theme");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.RED);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ThemeTypeLabel=new JLabel("Theme");
        ThemeTypeField=new JTextField();
        SaveButton=new JButton ("Add");
        SaveButton.addActionListener(e->this.dispose());
        
        ThemeTypeLabel.setBounds(50,50,width,height);
        ThemeTypeField.setBounds(200,50,width,height);
        SaveButton.setBounds(200,100,width,height);
        
        
        add(ThemeTypeLabel);
        add(ThemeTypeField);
        add(SaveButton);
        
        
      SaveButton.addActionListener(new Action());
        
    }
    private class Action implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          Theme hemet=new Theme();
          hemet.setThemeStyle(ThemeTypeField.getText());
          ThemeDashBoardGUI.ThemeArrayList.add(hemet);
          ThemeDashBoardGUI dhtgk = new ThemeDashBoardGUI();
          dhtgk.setVisible(true);
        }
    }

}

        
        

