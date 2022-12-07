package task01;

import java.util.Stack;

public class RPN {
    Stack <Double> numbers = new Stack<>();
    String notation = "";
    RPN(String notation){
        this.notation = notation;
    }
    Double calculations() throws ArithmeticException{
        String[] s = notation.split(" ");
        for (int i = 0; i < s.length; i++) {

            try {
                numbers.push(Double.parseDouble(s[i]));
            } catch (NumberFormatException e){
                Double b = numbers.pop();
                Double a = numbers.pop();
                switch (s[i]){
                    case("+"):{
                        numbers.push(a+b);
                    }
                    case("-"):{
                        numbers.push(a-b);
                    }
                    case("/"):{
                        if (b == 0.0) throw new ArithmeticException("Div By Zero");
                        numbers.push(a/b);
                    }
                    case("*"):{
                        numbers.push(a*b);
                    }
                    default: {
                        break;
                    }
                }
            }
        }
        return numbers.pop();
    }

}
