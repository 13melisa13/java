package task01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    Integer idNumber = 0;
    String name = "";
    String surname = "";
    String specialty = "";
    Integer course = 0;
    String group = "";
    Integer GPA = 0;
    Date dateOfBirthday;
    int format = 0;
    SimpleDateFormat dateFormat;
    public Student(){

    }
    public Student(int idNumber, String surname, int gpa){
        setIdNumber(idNumber);
        setSurname(surname);
        setGPA(gpa);

    }
    public Student(int idNumber, String name, String surname, String specialty, int course, String group, int gpa){
        setIdNumber(idNumber);
        setCourse(course);
        setGroup(group);
        setName(name);
        setSpecialty(specialty);
        setSurname(surname);
        setGPA(gpa);
    }

    public Integer getGPA() {
        return GPA;
    }

    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;

    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public Integer getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getIdNumber(),o.getIdNumber());
    }

    public void setFormat(int format) {
        this.format = format;
        setDateFormat(format);
    }

    public void setDateFormat(int format) {
        if (format == -1){
            dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        } else if (format == 0) {
            dateFormat = new SimpleDateFormat("dd MMM yyyy");
        } else {
            dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        }
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public String toString() {
        return getIdNumber() + " " + getGroup() + " " + getGPA() + "  " + dateFormat.format(getDateOfBirthday());
    }
}
