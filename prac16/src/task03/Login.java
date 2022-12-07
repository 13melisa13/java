package task03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    TextField service = new TextField(15);
    TextField login = new TextField(15);
    JPasswordField password = new JPasswordField(15);
    Label result = new Label();
    Login(){
        super("Password application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(350,300));
        Label labelService = new Label("Service");
        Label labelLogin = new Label("Login");
        Label labelPassword = new Label("Password");
        result.setPreferredSize(new Dimension(100,30));
        Dimension dimension = new Dimension(100,30);
        login.setPreferredSize(dimension);
        service.setPreferredSize(dimension);
        password.setPreferredSize(new Dimension(120,25));
        JButton button = new JButton("Login");
        button.setPreferredSize(new Dimension(100,30));
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(350,200));
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        panel.add(labelService);
        panel.add(service);
        layout.putConstraint(SpringLayout.WEST , labelService, 10,
                SpringLayout.WEST , panel);
        layout.putConstraint(SpringLayout.NORTH, labelService, 25,
                SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, service, 25,
                SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST , service, 100,
                SpringLayout.WEST, panel);
        panel.add(labelLogin);
        panel.add(login);
        layout.putConstraint(SpringLayout.WEST , labelLogin, 10,
                SpringLayout.WEST , panel);
        layout.putConstraint(SpringLayout.NORTH, labelLogin, 25,
                SpringLayout.SOUTH, labelService);
        layout.putConstraint(SpringLayout.NORTH, login, 25,
                SpringLayout.SOUTH, service);
        layout.putConstraint(SpringLayout.WEST , login, 100,
                SpringLayout.WEST, panel);
        panel.add(labelPassword);
        panel.add(password);
        layout.putConstraint(SpringLayout.WEST , labelPassword, 10,
                SpringLayout.WEST , panel);
        layout.putConstraint(SpringLayout.NORTH, labelPassword, 25,
                SpringLayout.SOUTH, labelLogin);
        layout.putConstraint(SpringLayout.NORTH, password, 25,
                SpringLayout.SOUTH, login);
        layout.putConstraint(SpringLayout.WEST , password, 100,
                SpringLayout.WEST, panel);
        panel.add(button);
        layout.putConstraint(SpringLayout.NORTH, button, 25,
                SpringLayout.SOUTH, password);
        layout.putConstraint(SpringLayout.WEST , button, 100,
                SpringLayout.WEST, panel);
        button.addActionListener(this);
        panel.add(result);
        layout.putConstraint(SpringLayout.NORTH, result, 25,
                SpringLayout.SOUTH, button);
        layout.putConstraint(SpringLayout.WEST , result, 100,
                SpringLayout.WEST, panel);
        add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((service.getText()+password.getText()
                +login.getText()).equals("SPL")){
            result.setText("Ok!");
        }
        else {
            result.setText("Wrong");
        }

    }
}
