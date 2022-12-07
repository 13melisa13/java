package task03;

import java.util.Scanner;

public class ExceptionParseIntAndDivByZeroWithCatch {
    public static void exceptionDemo(){
        Scanner in = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = in.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (Exception exception){
            System.out.println("Not integer or Attempted division by zero");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
