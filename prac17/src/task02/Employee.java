package task02;

public class Employee {
    private String name = "";
    private String surname = "";
    private int experience = 0;
    private int hoursPerWeek = 0;
    private double salaryPerHour = 0;
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) { this.experience = experience; }
    public double getSalaryPerHour() {
        return salaryPerHour;
    }
    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}

