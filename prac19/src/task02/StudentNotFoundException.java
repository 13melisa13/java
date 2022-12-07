package task02;

public class StudentNotFoundException extends Exception{
    StudentNotFoundException(){
        super("Student was not found");
    }
}
