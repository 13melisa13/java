package prac14.task03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String strs = in.nextLine();
        Pattern p = Pattern.compile(",");
        String[] str = p.split(strs);
        Pattern[] patterns = {Pattern.compile("\\d+[.]\\d{2}\\sEU"),
                Pattern.compile("\\d+[.]\\d{2}\\sUSD"),Pattern.compile("\\d+[.]\\d{2}\\sRUB")};
        Matcher m;
        StringBuilder result = new StringBuilder("");
        for (String word: str) {
            for (Pattern pattern: patterns) {
                m = pattern.matcher(word);
                if (m.find()){
                    result.append(word).append(",");
                }
            }
        }
        if (!result.toString().isEmpty())
            System.out.println(result.deleteCharAt(result.length()-1));
        else
            System.out.println("Нет таких");

    }
}
