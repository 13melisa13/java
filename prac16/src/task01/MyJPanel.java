package task01;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {
    MyJPanel(String name) {
        setLayout(new BorderLayout());
        setName(name);
        setPreferredSize(new Dimension(200,200));
        setBorder(BorderFactory.createLineBorder(Color.black));
        Label label = new Label(getName());
        add(label,BorderLayout.NORTH);


    }
}
