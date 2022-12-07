package task02;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        MinMax<Character> aChar = new MinMax<>(new Character[]{'a', 'k', 'r', 'd'});
        printMinMaxInfo(aChar);

        MinMax<Integer> aInt = new MinMax<>(new Integer[]{
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100)
        });
        printMinMaxInfo(aInt);

        MinMax<Double> aDouble = new MinMax<>(new Double[]{68.54, 71.75, 19.21, 7.88});
        printMinMaxInfo(aDouble);
    }

    public static void printMinMaxInfo(MinMax<?> array) {
        System.out.println(array);
        System.out.println("Минимальный элемент - \'" + array.getMinElement() + '\'');
        System.out.println("Максимальный элемент - \'" + array.getMaxElement() + '\'');
        System.out.println();
    }
}
