package task01;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Calc extends JFrame {
    JTextField jTextField1 = new JTextField(10);
    JTextField jTextField2 = new JTextField(10);
    JButton buttonAddition = new JButton("+");
    JButton buttonSubdivide = new JButton("-");
    JButton buttonDivision = new JButton("/");
    JButton buttonMultiplication = new JButton("*");
    Font font = new Font("Times new roman", Font.BOLD, 20);

    Calc() {
        super("Calculator");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(230, 150);
        add(new JLabel("1st Number"));
        add(jTextField1);
        add(new JLabel("2nd Number"));
        add(jTextField2);
        add(buttonAddition);
        buttonAddition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                try{
                    double x1 = Double.parseDouble(jTextField1.getText().trim());
                    double x2 = Double.parseDouble(jTextField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result ="+(x1+x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(buttonSubdivide);
        buttonSubdivide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                try{
                    double x1 = Double.parseDouble(jTextField1.getText().trim());
                    double x2 = Double.parseDouble(jTextField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result ="+(x1-x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(buttonMultiplication);
        buttonMultiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                try{
                    double x1 = Double.parseDouble(jTextField1.getText().trim());
                    double x2 = Double.parseDouble(jTextField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result ="+(x1*x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(buttonDivision);
        buttonDivision.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                try{
                    double x1 = Double.parseDouble(jTextField1.getText().trim());
                    double x2 = Double.parseDouble(jTextField2.getText().trim());
                    if (x2 != 0)
                        JOptionPane.showMessageDialog(null, "Result ="+(x1/x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                    else JOptionPane.showMessageDialog(null, "You can`t divide by zero",
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args){
        new Calc();
    }
}