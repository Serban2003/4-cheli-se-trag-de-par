package aut.utcluj.isp.ex4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Equipment> sampleHistory(){
        List<Equipment> list=new ArrayList<>();

        Equipment equipment1 = new Equipment("Dell", "SN123","John");
        Equipment equipment2 = new Equipment("Asus", "SN124","Maria");
        Equipment equipment3 = new Equipment("HP", "SN125","Ana");
        Equipment equipment4 = new Equipment("Myria", "SN126","Smiley");
        Equipment equipment5 = new Equipment("Alienware", "SN127","Bourbon");

        list.add(equipment1);
        list.add(equipment2);
        list.add(equipment3);
        list.add(equipment4);
        list.add(equipment5);
        return list;
    }

    public static void mainUI(){
        JFrame frame = new JFrame("Equipment Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        List<Equipment> list=sampleHistory();
        JButton showEquipment = new JButton("Show Provided Equipment");
        showEquipment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EquipmentInventory inventory=new EquipmentInventory(list);
            }
        });
        showEquipment.setBounds(50,50,200,20);


        JButton provideEquipment = new JButton("Provide Equipment");
        provideEquipment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EquipmentProvidePage epp=new EquipmentProvidePage(list);
            }
        });
        provideEquipment.setBounds(50, 80, 200, 20);

        frame.add(provideEquipment);
        frame.add(showEquipment);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        mainUI();
    }
}
