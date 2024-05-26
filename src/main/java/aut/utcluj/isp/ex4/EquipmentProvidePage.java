package aut.utcluj.isp.ex4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class EquipmentProvidePage extends JFrame {
    private JPanel panel=new JPanel();

    private JLabel l1=new JLabel();
    private JLabel l2=new JLabel();
    private JLabel l3=new JLabel();
    //private JLabel l4=new JLabel();

    private JTextField t1=new JTextField();
    private JTextField t2=new JTextField();

    private JButton b1=new JButton();

    private void submitButton(JFrame frame){
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().isEmpty() || t2.getText().isEmpty()) {
                    l3.setText("Please enter all fields");
                    l3.setBounds(220,150,200,30);
                }else{
                    l3.setText(t1.getText() + " added with serial number " + t2.getText());
                    l3.setBounds(220,150,200,30);
                }
                frame.revalidate();
                frame.repaint();
            }

        });
    }

    EquipmentProvidePage(List<Equipment> list) {
        this.setTitle("Equipment Provide Page");
        this.setSize(800,400);
        panel.setSize(800,400);

        l1.setText("Name: ");
        l1.setBounds(200,20,150,30);

        l2.setText("Serial Number: ");
        l2.setBounds(200,60,150,30);

        t1.setColumns(10);
        t1.setBounds(300,20,150,30);
        t2.setColumns(10);
        t2.setBounds(300,60,150,30);

        b1.setBounds(500, 40, 100, 20);
        b1.setText("Submit");

        submitButton(this);

        panel.setLayout(null);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b1);
        panel.add(l3);

        this.add(panel);
        this.setLayout(null);
        this.setVisible(true);
    }
}
