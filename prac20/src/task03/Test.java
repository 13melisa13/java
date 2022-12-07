package task03;
import java.text.DecimalFormat;
public class Test {
    public static void main(String[] args) {
        printAllResults(getArrayOfCalcOperations());
    }
    public static double[] getArrayOfCalcOperations() {
        return new double[]{
                Calculator.division(54, 15.5),
                Calculator.addition((short) 5, (float)0.1),
                Calculator.multiplication((byte) 8, 7.01),
                Calculator.subdivide((long) 17, (short) 15)
        };
    }
    public static void printAllResults(double[] results) {
        DecimalFormat nf = new DecimalFormat("###.###");
        for (double result : results) {
            System.out.println("result = " + nf.format(result) + ";");
        }
    }
}
