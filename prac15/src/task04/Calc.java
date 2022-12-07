package task04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Calc extends JFrame implements ActionListener{
    JPanel panel = new JPanel(new GridLayout(4,4, 4,4));
    JPanel p = new JPanel();
    JTextArea jTextArea = new JTextArea(2,25);
    MyJButton buttonAddition = new MyJButton("+");
    MyJButton buttonSubdivide = new MyJButton("-");
    MyJButton buttonDivision = new MyJButton("/");
    MyJButton buttonMultiplication = new MyJButton("*");
    MyJButton button1 = new MyJButton("1");
    MyJButton button2 = new MyJButton("2");
    MyJButton button3 = new MyJButton("3");
    MyJButton button4 = new MyJButton("4");
    MyJButton button5 = new MyJButton("5");
    MyJButton button6 = new MyJButton("6");
    MyJButton button7 = new MyJButton("7");
    MyJButton button8 = new MyJButton("8");
    MyJButton button9 = new MyJButton("9");
    MyJButton button0 = new MyJButton("0");
    MyJButton buttonDot = new MyJButton(".");
    MyJButton buttonResult = new MyJButton("=");
    int countOfSymbol(String text, String symbol){
        text += " ";
        if (text.isEmpty() || symbol.isEmpty()) {
            return 0;
        } else {
            int i = 0;
            while (text.contains(symbol)) {
                text = text.substring(text.indexOf(symbol) + 1);
                i++;
            }
            return i;
        }
    }
    Calc() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setSize(250, 600);
        p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        p.setLayout(new BorderLayout());

        p.add(jTextArea, "North");
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivision);
        panel.add(button4);
        panel.add(button6);
        panel.add(button5);
        panel.add(buttonMultiplication);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonSubdivide);
        panel.add(button0);
        panel.add(buttonDot);
        panel.add(buttonResult);
        buttonResult.setMnemonic(KeyEvent.VK_ENTER);
        panel.add(buttonAddition);
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonResult.addActionListener(event -> {
            String text = jTextArea.getText().trim();
            String[] symbols = {"+","-","/","*"};
            String operator = "";
            int count = 0;
            for(String symbol: symbols){
                if (countOfSymbol(text,symbol) == 1  )
                    operator += symbol;
            }
            if(operator.length() != 1) {
                JOptionPane.showMessageDialog(this, "Error in count of operator!",
                        "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                double x1 = Double.parseDouble(text.substring(0,text.indexOf(operator)));
                Double x2 = Double.parseDouble(text.substring(text.indexOf(operator)+1));
                switch (operator){
                    case ("+"):{
                        x2 = x1 + x2;
                        break;
                    }
                    case ("-"):{
                        x2 = x1 - x2;
                        break;
                    }
                    case ("/"):{
                        x2 = x1 / x2;//div 0
                        break;
                    }
                    case ("*"):{
                        x2 = x1 * x2;
                        break;
                    }
                }
                jTextArea.setText(x2.toString());
            }catch(Exception e){
                JOptionPane.showMessageDialog( this, "Error in Numbers!",
                        "Alert" , JOptionPane.ERROR_MESSAGE);
            }
        });
        buttonMultiplication.addActionListener(this);
        buttonDivision.addActionListener(this);
        buttonSubdivide.addActionListener(this);
        buttonAddition.addActionListener(this);
        p.add(panel);
        add(p);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        JButton myButton = (JButton)ae.getSource();
        String s = myButton.getText();
        jTextArea.append(s);
    }
    public static void main(String[]args){
        new Calc();
    }
}