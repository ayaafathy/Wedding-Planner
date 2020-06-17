/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import WeddVendors.Decorations.Florists;
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
public class EditFloristsDashBoardGUI  extends JFrame{
    
    private JLabel FlowerTypeLabel;
    private JTextField FlowerTypeField;
    
    private JButton SaveButton;
    
    public EditFloristsDashBoardGUI(int index , String name){
        
        setTitle("Edit Florists");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        FlowerTypeLabel=new JLabel("Flower Type");
        FlowerTypeField=new JTextField();
        SaveButton=new JButton("Save");
        SaveButton.addActionListener(e->this.dispose());
        
        FlowerTypeLabel.setBounds(50,50,width,height);
        FlowerTypeField.setBounds(200,50,width,height);
        SaveButton.setBounds(200,100,width,height);
        
        
        add(FlowerTypeLabel);
        add(FlowerTypeField);
        add(SaveButton);
        
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             Florists flor=new Florists( FlowerTypeField.getText());
            
             FloristsDashBoardGUI.FloristsArrayList.set(index,flor);
             FloristsDashBoardGUI florDashB=new FloristsDashBoardGUI();
             
             dispose();
             
 }
       });
      
    }
    
    public EditFloristsDashBoardGUI(int index, Florists florists){
        
        setTitle("Edit Florists");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int width = 300;
        int height = 30;
        
        
        FlowerTypeLabel=new JLabel("Florists");
        FlowerTypeField=new JTextField(florists.getFlowers());
        SaveButton=new JButton("Edit");
        FlowerTypeLabel.setBounds(50,50,width,height);
        FlowerTypeField.setBounds(200,50,width,height);
        SaveButton.setBounds(200,100,width,height);
        
        add(FlowerTypeLabel);
        add(FlowerTypeField);
        add(SaveButton);
        
        
       SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Florists updatedFlorists=new Florists();
                updatedFlorists.setFlowers(FlowerTypeField.getText());
                FloristsDashBoardGUI.FloristsArrayList.set(index,updatedFlorists);
                FloristsDashBoardGUI flordashgui=new FloristsDashBoardGUI();
                flordashgui.setVisible(true);
                 dispose(); 
                 
            }
        });
                
        }
    
 }
