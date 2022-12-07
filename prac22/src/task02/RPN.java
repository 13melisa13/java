package task02;

import java.util.Stack;

public class RPN {
    Stack <Double> numbers = new Stack<>();
    String notation = "";

    RPN(){

    }

    public void setNotation(String notation) {
        this.notation = notation;
    }

    public Double calculations() throws Exception{
        String[] s = notation.split(" ");
        System.out.println(notation+"!");
        for (String value : s) {
            try {
                numbers.push(Double.parseDouble(value));
            } catch (NumberFormatException e) {

                if (numbers.size() < 2) throw new Exception("Bad format of notation"+numbers.size());
                Double b = numbers.pop();
                Double a = numbers.pop();
                switch (value) {
                    case ("+"): {
                        numbers.push(a + b);
                        break;
                    }
                    case ("-"): {
                        numbers.push(a - b);
                        break;
                    }
                    case ("/"): {
                        if (b == 0.0) throw new ArithmeticException("Div By Zero");
                        numbers.push(a / b);
                        break;
                    }
                    case ("*"): {
                        numbers.push(a * b);
                        break;
                    }
                    default: {
                        throw new NumberFormatException("Bad format of numbers1"+value);
                    }
                }
            }
        }
        return numbers.pop();
    }
}
