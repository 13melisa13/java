package task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends JFrame implements MouseListener {

    Double number = Math.random()*21;
    int n = 0;
    Game(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        JPanel panel = new JPanel(new BorderLayout());
        setPreferredSize(getPreferredSize());

        MyJPanel center = new MyJPanel("ЦАО");
        center.addMouseListener(this);

        MyJPanel north = new MyJPanel("САО");
        north.addMouseListener(this);


        SpringLayout layout = new SpringLayout();
        JPanel northPanel = new JPanel();
        northPanel.setPreferredSize(new Dimension(100,100));
        northPanel.setBorder(BorderFactory.createLineBorder(Color.red));
        northPanel.setLayout(layout);
        TextField answer = new TextField();
        northPanel.add(answer);
        layout.putConstraint(SpringLayout.NORTH, answer, 10,
                SpringLayout.NORTH, northPanel);
        layout.putConstraint(SpringLayout.WEST, answer, 250,
                SpringLayout.WEST, northPanel);
        JButton button = new JButton("Enter");
        button.addActionListener(e -> {
            if (n == 0){
                JOptionPane.showMessageDialog(Game.this,
                        number.intValue(), "",JOptionPane.INFORMATION_MESSAGE);
            }
            if (game(answer.getText()).equals("y"))
                System.exit(0);
            else
                n++;
            if (n == 3){
                JOptionPane.showMessageDialog(Game.this,
                        "Вы проиграли!", "",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }


        });
        northPanel.add(button);
        layout.putConstraint(SpringLayout.NORTH, button, 10,
                SpringLayout.NORTH, northPanel);
        layout.putConstraint(SpringLayout.WEST, button, 40,
                SpringLayout.EAST, answer);
        north.add(northPanel,BorderLayout.SOUTH);

        button.setPreferredSize(new Dimension(80,30));
        answer.setPreferredSize(new Dimension(80,30));

        MyJPanel south = new MyJPanel("ЮАО");
        south.addMouseListener(this);

        MyJPanel east = new MyJPanel("ВАО");
        east.addMouseListener(this);

        MyJPanel west = new MyJPanel("ЗАО");
        west.addMouseListener(this);

        panel.add(center,BorderLayout.CENTER);
        panel.add(north, BorderLayout.NORTH);
        panel.add(south, BorderLayout.SOUTH);
        panel.add(east, BorderLayout.EAST);
        panel.add(west, BorderLayout.WEST);

        add(panel);
        pack();
        setVisible(true);
    }
    String game(String text){
        try {
            int num = Integer.parseInt(text);
            if (num == number.intValue()){
                JOptionPane.showMessageDialog(Game.this,
                        "Вы угадали!", "",JOptionPane.INFORMATION_MESSAGE);
                return "y";
            } else{
                if (num < number.intValue())
                    JOptionPane.showMessageDialog(Game.this,
                        "Вы не угадали. Ваше число меньше!", "",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(Game.this,
                            "Вы не угадали. Ваше число больше!", "",JOptionPane.INFORMATION_MESSAGE);
                return "n";
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(Game.this,
                    "Ошибка ввода", "",JOptionPane.ERROR_MESSAGE);
            return "";
        }

    }



    public static void main(String[] args) {
        new Game();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog((MyJPanel) e.getSource(),
                "Добро пожаловать в "+((MyJPanel)e.getSource()).getName(),
                "",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
