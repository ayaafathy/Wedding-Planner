/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import WeddVendors.*;

/**
 *
 * @author Jana
 */
public class AddTransportation extends JFrame{
    
    
    
    private JLabel NameLabel;
    private JTextField NameField;
    private JLabel IDLabel;
    private JTextField IDField;
    private JLabel costLabel;
    private JTextField costField;

    private JButton saveButton;

    int x_cor = 50;
    int y_cor = 50;
    int width = 300;
    int height = 30;

    public AddTransportation() {
        setTitle("Add Transportation");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NameLabel = new JLabel("Car type");
        NameField = new JTextField();

        IDLabel = new JLabel("ID");
        IDField = new JTextField();
        costLabel = new JLabel("cost");
        costField = new JTextField();

        saveButton = new JButton("ADD");
        saveButton.addActionListener(e -> this.dispose());


        NameLabel.setBounds(50, 50, width, height);
        NameField.setBounds(200, 50, width, height);
        IDLabel.setBounds(50, 100, width, height);
        IDField.setBounds(200, 100, width, height);
        costLabel.setBounds(50, 150, width, height);
        costField.setBounds(200, 150, width, height);
        
        saveButton.setBounds(200, 300, 100, height);

        add(NameLabel);
        add(NameField);
        add(IDLabel);
        add(IDField);
        add(costLabel);
        add(costField);
        
        
        add(saveButton);
        saveButton.addActionListener(new Action());

    }


   private class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Transportation tt = new Transportation();
            tt.setCarType(NameField.getText());
            tt.setCarID(IDField.getText());
            tt.setCarCost(costField.getText());
           
            TransportationDashBoard.TransportationArrayList.add(tt);
            TransportationDashBoard fr = new TransportationDashBoard();
            fr.setVisible(true);
        }
    }

}

