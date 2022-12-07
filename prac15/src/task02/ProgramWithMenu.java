package task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramWithMenu extends JFrame {
    ProgramWithMenu(String name){
        super(name);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        String[] items = {
                "Country",
                "Australia",
                "Russia",
                "China"
        };
        JComboBox comboBox = new JComboBox(items);
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                String information = "Some text about " + item;
                JOptionPane.showMessageDialog(null, information,
                        "Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        };
        add(comboBox);
        comboBox.addActionListener(actionListener);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProgramWithMenu("Hi!");
    }
}
