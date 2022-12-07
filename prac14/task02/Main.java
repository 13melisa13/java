package prac14.task02;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("abcdefgijklmonpqrstuv18340");
        Matcher matcher = pattern.matcher(str);
       if(matcher.matches()){
           System.out.println(str + " является");
       }
       else {
           System.out.println(str + " не является");
       }


    }

}
