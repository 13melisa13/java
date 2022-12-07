package task02;

import javax.swing.*;
import java.awt.*;

public class EmployeeView extends JFrame {
    Label surname = new Label("\tSurname: ");
    Label name = new Label("\tName: ");
    Label experience = new Label("\tExperience: ");
    Label hours = new Label("\tHours per week: ");
    Label salaryPerHour = new Label("\tSalary per hour: ");
    JButton button = new JButton("\tFinal salary");
    EmployeeView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300,250));
        JPanel panel =new JPanel(new GridLayout(6,1));
        panel.setPreferredSize(new Dimension(200,200));
        panel.add(surname);
        panel.add(name);
        panel.add(experience);
        panel.add(hours);
        panel.add(salaryPerHour);
        panel.add(button);
        add(panel);
        pack();
        setVisible(true);
    }
    void printEmployeeDetails( String surnameEmployee,String nameEmployee,
                              int experienceEmployee, int hoursPerWeekEmployee,
                              double salaryPerHourEmployee){
        surname.setText("\tSurname: " + surnameEmployee);
        name.setText("\tName: " + nameEmployee);
        experience.setText("\tExperience: " + experienceEmployee);
        hours.setText("\tHours per week: " + hoursPerWeekEmployee);
        salaryPerHour.setText("\tSalary per hour: " + salaryPerHourEmployee);
    }
}
