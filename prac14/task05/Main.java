package prac14.task05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");

        Matcher m = pattern.matcher(date);
        if(m.matches()){
            Pattern p = Pattern.compile("/");
            String[] dates = p.split(date);
            int day = Integer.parseInt(dates[0]);
            int month = Integer.parseInt(dates[1]);
            int year = Integer.parseInt(dates[2]);
            if(day >= 0 && day < 32 && month > 0 && month < 13 && year >= 1900)
                System.out.println(date + " является");
            else
                System.out.println(date + " не является");
        }
        else {
            System.out.println(date + " не является");
        }
    }
}
