package task08;

import java.util.Scanner;

public class ThrowDemo {
    public static void getKey(){
        Scanner in = new Scanner( System.in);
        String key = "";
        while (true) {
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("enter");
                key = in.next();
            }
        }

    }
    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowDemo t = new ThrowDemo();
        t.getKey();
    }
}

