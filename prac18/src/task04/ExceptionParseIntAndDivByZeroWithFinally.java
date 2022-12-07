package task04;

import java.util.Scanner;

public class ExceptionParseIntAndDivByZeroWithFinally {
    public static void exceptionDemo(){
        Scanner in = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = in.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException numberFormatException){
            System.out.println("Not integer");
        } catch (ArithmeticException arithmeticException){
            System.out.println("Attempted division by zero");
        } finally {
            System.out.println("It doesn't matter if there was a mistake");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
