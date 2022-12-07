package task02;

import javax.swing.*;

public class EmployeeMVCTest {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model,view);
        controller.view.button.addActionListener( e ->
                JOptionPane.showMessageDialog(controller.view,"Salary: "+
                controller.finalSalary(controller.model),"Salary per week", 1) );
        controller.updateView();
    }

    static Employee retrieveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setSurname("Isaeva");
        employee.setName("Adelina");
        employee.setExperience(1);
        employee.setHoursPerWeek(40);
        employee.setSalaryPerHour(700);
        return employee;
    }
}
