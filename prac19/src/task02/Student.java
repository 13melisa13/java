package task02;

public class Student{
    String nameSurname = "";
    Integer course = 0;
    Integer GPA = 0;
    public Student(String nameSurname, int course, int gpa){
        setCourse(course);
        setNameSurname(nameSurname);
        setGPA(gpa);
    }

public Student (String nameSurname){
        setNameSurname(nameSurname);
}

    public String getNameSurname() {
        return nameSurname;
    }
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
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
    public Integer getCourse() {
        return course;
    }
    @Override
    public String toString() {
        return getNameSurname()+ " " + getCourse() + " "+ getGPA() ;
    }
}
