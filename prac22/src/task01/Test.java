package task01;

public class Test {
    public static void main(String[] args) {
        String s = "2 0 /";
        RPN polish = new RPN(s);
        System.out.println(polish.calculations());
    }
}
