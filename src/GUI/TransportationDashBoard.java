/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.HotelDashboard.HotelssArrayList;
import WeddVendors.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jana
 */
public class TransportationDashBoard extends JFrame {

    private JLabel NameTagLabel;
    private JLabel IDTagLabel;
    private JLabel costTagLabel;
    private JLabel actionsTagLabel;

    private JLabel NameLabel;
    private JLabel IDLabel;
    private JLabel costLabel;

    public JLabel Cheke;

    private JButton addButton;
    private JButton saveButton;

    public static ArrayList<Transportation> TransportationArrayList = new ArrayList();
    int x_cor = 50;
    int y_cor = 80;

    public TransportationDashBoard() {

        setTitle("Transportation Dashboard");
        setSize(650, 700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (TransportationArrayList.size() != 0) {

            NameTagLabel = new JLabel("Car type");
            IDTagLabel = new JLabel("ID");
            costTagLabel = new JLabel("Cost");

            actionsTagLabel = new JLabel("Actions");

            
            NameTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
            IDTagLabel.setBounds(x_cor + 150, y_cor - 50, 100, 30);
            costTagLabel.setBounds(x_cor + 250, y_cor - 50, 100, 30);
            actionsTagLabel.setBounds(x_cor + 650, y_cor - 50, 100, 30);

            NameTagLabel.setForeground(Color.red);
            IDTagLabel.setForeground(Color.red);
            costTagLabel.setForeground(Color.red);
            actionsTagLabel.setForeground(Color.red);
            
            add(NameTagLabel);
            add(IDTagLabel);
            add(costTagLabel);
            add(actionsTagLabel);
            
             for (int i = 0; i < TransportationArrayList.size(); i++) {

                NameLabel = new JLabel(TransportationArrayList.get(i).getCarType());
                IDLabel = new JLabel(TransportationArrayList.get(i).getCarID());
                costLabel = new JLabel(TransportationArrayList.get(i).getCarCost());
               
                
                NameLabel.setBounds(x_cor, y_cor, 100, 30);
                IDLabel.setBounds(x_cor + 150, y_cor, 100, 30);
                costLabel.setBounds(x_cor + 250, y_cor, 100, 30);
                add(NameLabel);
                add(IDLabel);
                add(costLabel);
                
                
                 JButton editButton = new JButton("EDIT");
                 editButton.setBounds(x_cor + 650, y_cor, 70, 30);
                add(editButton);
                editButton.setActionCommand("" + i);
                editButton.addActionListener(new ActionListener() {
                    
                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int index = Integer.parseInt(e.getActionCommand());
                        EditTransportation x = new EditTransportation(index, NameLabel.getText(), IDLabel.getText(), costLabel.getText());
                        dispose();
                    }
                });
                
                 JButton deleteButton = new JButton("Delete");
               deleteButton.setBounds(x_cor + 750, y_cor, 70, 30);
                add(deleteButton);
                deleteButton.setActionCommand("" + i);
                //todo : Set action command for the delete button to check which student is selected for delete
                deleteButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showConfirmDialog(rootPane, "for sure to delete the car");
                        //todo : check if the user wants for sure to delete the student if the user said yes
                        // then remove the student from the students array list and re draw the dashboard frame
                        int index = Integer.parseInt(e.getActionCommand());
                        TransportationDashBoard.TransportationArrayList.remove(index);
                        TransportationDashBoard dashboardGUI = new TransportationDashBoard();
                        dispose();
                    }
                });
                
                    y_cor += 40;

            }
            addButton = new JButton("Add");
            addButton.setBounds(400, 600, 80, 30);
            add(addButton);
            addButton.setVisible(true);
            addButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    AddHotel add = new AddHotel();
                    add.setVisible(true);

                    dispose();
                }
            });

            saveButton = new JButton("SAVE");
            saveButton.setBounds(500, 600, 80, 30);
            add(saveButton);

            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Hotel student = new Hotel();
                    if (student.save()) {
                        JOptionPane.showMessageDialog(rootPane, "Saved ");
                    }
                }

            });
             } else {
             
           
            Cheke = new JLabel();
            JOptionPane.showMessageDialog(null, "ArrayList is empty and there is no cars");
            Cheke.setText("ArrayList is empty and there is no cars");
            Cheke.setBounds(50, 50, 300, 200);
            add(Cheke);
            
             setTitle("Transportation Dashboard");
            setSize(650, 700);
            setLayout(null);
            setVisible(true);
            getContentPane().setBackground(Color.white);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
             addButton = new JButton("Add");
            addButton.setBounds(400, 600, 80, 30);
            add(addButton);
            addButton.setVisible(true);
            addButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    AddTransportation add = new AddTransportation();
                    add.setVisible(true);
                    setVisible(false);
                }
            });

        }
    }
}