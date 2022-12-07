package task01;

public class ExceptionDivisionByZero {
    public static void exceptionDemo(){
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException arithmeticException){
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
