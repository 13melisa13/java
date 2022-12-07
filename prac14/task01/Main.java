package prac14.task01;


import java.util.regex.Pattern;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("\\s");
        String[] words = pattern.split(str);
        for (String word: words) {
            System.out.println(word);
        }

    }

}
