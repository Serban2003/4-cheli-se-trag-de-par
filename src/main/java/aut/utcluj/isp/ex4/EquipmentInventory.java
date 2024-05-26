package aut.utcluj.isp.ex4;

import javax.swing.*;
import java.util.List;

public class EquipmentInventory extends JFrame {

    private JPanel panel=new JPanel();

    private JLabel l=new JLabel();

    public EquipmentInventory(List<Equipment> list) {
        this.setSize(600,300);
        this.setTitle("Equipment Inventory");
        panel.setSize(600,300);
        int yAxis=30;
        for (Equipment equipment : list) {
            JLabel l1=new JLabel(equipment.getName() + " " + equipment.getSerialNumber() + " " +
                    equipment.getCurrentOwner());
            l1.setBounds(220,yAxis,200,30);
            yAxis+=30;
            panel.add(l1);
        }

        this.add(panel);
        panel.setLayout(null);
        this.setLayout(null);
        this.setVisible(true);
    }
}
