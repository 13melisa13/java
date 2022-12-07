package task02;

public class EmployeeController {
    Employee model;
    EmployeeView view;
    EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.getName();
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeSurname() {
        return model.getSurname();
    }

    public void setEmployeeSurname(String surname) {
        model.setSurname(surname);
    }

    public int getEmployeeExperience() {
        return model.getExperience();
    }

    public void setEmployeeExperience(int experience) {
        model.setExperience(experience);
    }

    public double getSalaryPerHour() {
        return model.getSalaryPerHour();
    }

    public void setEmployeeSalaryPerHour(double salaryPerHour) {
        model.setSalaryPerHour(salaryPerHour);
    }

    public int getEmployeeHoursPerWeek() {
        return model.getHoursPerWeek();
    }

    public void setEmployeeHoursPerWeek(int hoursPerWeek) {
        model.setHoursPerWeek(hoursPerWeek);
    }
    public void updateView(){
         view.printEmployeeDetails(model.getSurname(),
                model.getName(), model.getExperience(), model.getHoursPerWeek(),
                model.getSalaryPerHour());
    }
    static double finalSalary(Employee employee){
        return employee.getSalaryPerHour()*employee.getHoursPerWeek()*
                (1+0.2*employee.getExperience());
    }
}
