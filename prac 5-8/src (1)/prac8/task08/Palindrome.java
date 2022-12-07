package prac8.task08;

import java.util.Scanner;

public class Palindrome {
    private static void isPalindrome(String s){
        if(s.length() == 1){
            System.out.println("YES");
            return;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            System.out.println("NO");
            return;
        }
        if(s.length()==2){
            System.out.println("YES");
            return;
        }
        isPalindrome(s.substring(1, s.length()-1));
    }
    public static void main(String[] args) {
        System.out.println("Введите слово:");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        isPalindrome(word);
    }
}
