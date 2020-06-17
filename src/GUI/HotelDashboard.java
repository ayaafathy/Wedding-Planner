/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
public class HotelDashboard extends JFrame {

    private JLabel nameTagLabel;
    private JLabel websiteTagLabel;
    private JLabel numberTagLabel;
    private JLabel idTagLabel;
    private JLabel ratingTagLabel;
    private JLabel actionsTagLabel;

    private JLabel nameLabel;
    private JLabel websiteLabel;
    private JLabel numberLabel;
    private JLabel idLabel;
    private JLabel ratingLabel;
    public JLabel Cheke;

    private JButton addButton;
    private JButton saveButton;
    public static ArrayList<Hotel> HotelssArrayList = new ArrayList();
    int x_cor = 50;
    int y_cor = 80;

    public HotelDashboard() {
        
          setTitle("Hotels Dashboard");
            setSize(650, 700);
            setLayout(null);
            setVisible(true);
            getContentPane().setBackground(Color.white);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        if (HotelssArrayList.size() != 0) {

            nameTagLabel = new JLabel("Hotel Name");
            websiteTagLabel = new JLabel("Website");
            numberTagLabel = new JLabel("Phone Number");
            idTagLabel = new JLabel("ID");
            ratingLabel = new JLabel("Rating");

            actionsTagLabel = new JLabel("Actions");

            nameTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
            websiteTagLabel.setBounds(x_cor + 150, y_cor - 50, 100, 30);
            numberTagLabel.setBounds(x_cor + 250, y_cor - 50, 100, 30);
            idTagLabel.setBounds(x_cor + 350, y_cor - 50, 100, 30);
            ratingLabel.setBounds(x_cor + 450, y_cor - 50, 100, 30);
            actionsTagLabel.setBounds(x_cor + 700, y_cor - 50, 100, 30);

            idTagLabel.setForeground(Color.red);
            nameTagLabel.setForeground(Color.red);
            websiteTagLabel.setForeground(Color.red);
            ratingLabel.setForeground(Color.red);
            numberTagLabel.setForeground(Color.red);
            actionsTagLabel.setForeground(Color.red);

            add(idTagLabel);
            add(nameTagLabel);
            add(ratingLabel);
            add(websiteTagLabel);
            add(numberTagLabel);
            add(actionsTagLabel);

            for (int i = 0; i < HotelssArrayList.size(); i++) {

                nameLabel = new JLabel(HotelssArrayList.get(i).getName());
                websiteLabel = new JLabel(HotelssArrayList.get(i).getWebsite());
                numberLabel = new JLabel(HotelssArrayList.get(i).getPhoneNumber());
                idLabel = new JLabel(HotelssArrayList.get(i).getID());
                ratingLabel = new JLabel(HotelssArrayList.get(i).getHotelRate());

                
                nameLabel.setBounds(x_cor, y_cor, 100, 30);
                websiteLabel.setBounds(x_cor + 150, y_cor, 100, 30);
                numberLabel.setBounds(x_cor + 250, y_cor, 100, 30);
                idLabel.setBounds(x_cor + 350, y_cor, 100, 30);
                ratingLabel.setBounds(x_cor + 450, y_cor, 100, 30);
                add(idLabel);
                add(nameLabel);
                add(websiteLabel);
                add(numberLabel);
                add(ratingLabel);

                JButton editButton = new JButton("EDIT");
                 editButton.setBounds(x_cor + 650, y_cor, 70, 30);
                add(editButton);
                editButton.setActionCommand("" + i);
                editButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int index = Integer.parseInt(e.getActionCommand());
                        EditHotel x = new EditHotel(index, nameLabel.getText(), websiteLabel.getText(), numberLabel.getText(), idLabel.getText(), ratingLabel.getText());
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
                        JOptionPane.showConfirmDialog(rootPane, "for sure to delete the Hotel");
                        //todo : check if the user wants for sure to delete the student if the user said yes
                        // then remove the student from the students array list and re draw the dashboard frame
                        int index = Integer.parseInt(e.getActionCommand());
                        HotelDashboard.HotelssArrayList.remove(index);
                        HotelDashboard dashboardGUI = new HotelDashboard();
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
            JOptionPane.showMessageDialog(null, "List is empty and there is no Hotels");
            Cheke.setText("List is empty and there is no Hotels");
            Cheke.setBounds(50, 50, 300, 200);
            add(Cheke);

            setTitle("Hotels Dashboard");
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
                    AddHotel add = new AddHotel();
                    add.setVisible(true);
                    setVisible(false);
                }
            });

        }
    }
}
