package task04;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\((?:\\d|[+*-])+\\)");
        String[] array = {"(12+13)-9*4", "(12+13))-9*6", "((12+13)-9*9",
                "12+13-9*", "()12+13-9*()"};
        for (String element: array) {
            String[] parts = pattern.split(element);
            boolean isFoundExp = false;
            //System.out.print(Arrays.toString(parts)+" ");
            for (String part: parts) {
                if (Pattern.compile("[()]").matcher(part).find()){
                    isFoundExp = true;
                }

            }
            if(!isFoundExp) System.out.println(element);


        }
    }
}
