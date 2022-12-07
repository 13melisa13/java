package task07;

import java.util.Scanner;

public class ThrowDemo {
    public static void getKey(){
        Scanner in = new Scanner( System.in);
        String key = "";//in.next();
        try {
            printDetails(key);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void printDetails(String key) throws Exception {
            String message = getDetails(key);
            if (message.isEmpty()) throw new Exception("Key set to empty string");
            System.out.println(message);
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

