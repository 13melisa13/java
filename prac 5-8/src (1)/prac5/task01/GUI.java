package prac5.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI {
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonReal = new JButton("Real Madrid");
    JLabel labelResult = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    JLabel labelWinner = new JLabel("Winner: DRAW", SwingConstants.LEFT);
    JLabel labelLastScorer = new JLabel("Last Scorer: N/A", SwingConstants.RIGHT);
    GUI() {
    }
    public void setGUI() {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize( new Dimension(300, 500));
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 200));

        panel.add(buttonMilan);
        panel.add(buttonReal);
        panel.add(labelLastScorer);
        panel.add(labelWinner);
        panel.add(labelResult);
        buttonMilan.addActionListener(new TestActionListener());
        buttonReal.addActionListener(new TestActionListener());
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            String text = labelResult.getText();
            String symbol1 = text.substring(text.indexOf(' ') + 1 , text.indexOf('X') - 1);
            int count1 = Integer.parseInt(symbol1);
            String symbol2 = text.substring(text.lastIndexOf(' ') + 1);

            int count2 = Integer.parseInt(symbol2);
            if (command.equals(buttonMilan.getText())){
                count1++;
                text = text.replaceFirst(": " + symbol1, ": "+ count1);
            }
            else{
                count2++;
                text = text.replaceFirst(" X " + symbol2, " X "+ count2);
            }

            labelResult.setText(text);
            if (count1 > count2)
                labelWinner.setText("Winner: " + buttonMilan.getText());
            else
                if (count1 == count2)
                    labelWinner.setText("Winner: DRAW");
                else
                    labelWinner.setText("Winner: " + buttonReal.getText());
            labelLastScorer.setText("Last Scorer: " + command);
        }

    }
}
