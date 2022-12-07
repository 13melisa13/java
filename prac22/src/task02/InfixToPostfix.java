package task02;

import java.util.Stack;

public class InfixToPostfix {
    private static int getPrecedence(String ch) {
        return switch (ch) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            default -> throw new NumberFormatException("Bad format of operator"+ch);
        };
    }
    public static String convertToPostfix(String str) throws Exception {
        Stack <String> stack = new Stack<>();
        String[] infix = format(str).split(" ");
        StringBuffer postfix = new StringBuffer(str.length());
        for (String value: infix) {
            System.out.println(value);
            try {
                Double d = Double.parseDouble(value);
                postfix.append(d+" ");
            } catch (NumberFormatException e) {
                getPrecedence(value);
                if(!stack.empty() && getPrecedence(value) <= getPrecedence(stack.peek())){
                    postfix.append(stack.pop()+" ");
                }
                stack.push(value);
            }
        }
        while (!stack.empty()){
            postfix.append(stack.pop()+" ");
        }
        System.out.println(postfix);
        return postfix.toString();
    }



    static String format (String notation){
        String[] s = {"+","-","/","*"};
        for (String symbol: s) {
            notation = notation.replace(symbol, " "+symbol+" ");
        }
        return  notation;
    }
}
