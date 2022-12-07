package prac14.task07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        Pattern p = Pattern.compile("[A-Za-z[_]\\d]");
        Pattern[] patterns = {Pattern.compile("[A-Z]+"),
                Pattern.compile("[a-z]+"),Pattern.compile("\\d+")};
        Matcher m = p.matcher(password);
        int n = 0;
        if (m.find()) {
            for (Pattern pattern : patterns) {
                m = pattern.matcher(password);
                if (m.find()) {
                    n++;
                }
            }
            if (n == 3 && password.length() >= 8)
                System.out.println("YES");
            else
                System.out.println("NO" );
        }
        else
            System.out.println("Wrong format");
    }
}
