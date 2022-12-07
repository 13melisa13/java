package task03;

public class Calculator {
    public static <T extends Number, V extends Number> double addition(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Number, V extends Number> double multiplication(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number, V extends Number> double subdivide(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
    public static <T extends Number, V extends Number> double division(T a, V b) {
        if (b.doubleValue() != 0)
            return a.doubleValue() / b.doubleValue();
        else
            System.out.println("div by 0");
        return 0;
    }

}
