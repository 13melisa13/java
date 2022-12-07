package task02;

import javax.swing.*;
import java.awt.*;

public class FontColorText extends JFrame{
    JTextArea textArea = new JTextArea(3, 20);
    FontColorText(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 150));
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,120));
        textArea.setLineWrap(true);
        panel.add(textArea,"North");
        JMenuBar menu = new JMenuBar();
        JMenu font = new JMenu("Font");
        JMenuItem tnr = new JMenuItem();
        tnr.setText("Time New Roman");
        tnr.setFont(new Font("TimesRoman",Font.PLAIN,16));
        tnr.addActionListener(e -> textArea.setFont(new Font("TimesRoman",Font.PLAIN,16)));
        JMenuItem mss = new JMenuItem();
        mss.setText("MS Sans Serif");
        mss.setFont(new Font("Serif",Font.BOLD,14));
        mss.addActionListener(e -> textArea.setFont(new Font("Serif",Font.BOLD,14)));
        JMenuItem cn = new JMenuItem();
        cn.setText("Courier New");
        cn.setFont(new Font("Courier",Font.ITALIC,12));
        cn.addActionListener(e -> textArea.setFont(new Font("Courier",Font.ITALIC,12)));
        JMenu color = new JMenu("Color");
        JMenuItem black = new JMenuItem();
        black.addActionListener(e -> textArea.setForeground(Color.BLACK));
        black.setText("black");
        JMenuItem red = new JMenuItem();
        red.setText("red");
        red.setForeground(Color.RED);
        red.addActionListener(e -> textArea.setForeground(Color.RED));
        JMenuItem blue = new JMenuItem();
        blue.setText("blue");
        blue.setForeground(Color.BLUE);
        blue.addActionListener(e -> textArea.setForeground(Color.BLUE));
        font.add(tnr);
        font.add(mss);
        font.add(cn);
        menu.add(font);
        color.add(black);
        color.add(blue);
        color.add(red);
        menu.add(color);
        setJMenuBar(menu);
        add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new FontColorText();
    }

}

