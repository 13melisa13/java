package task02;

public class EmptyStringException extends Exception{
    EmptyStringException(){
        super("Text field is empty");
    }
}
