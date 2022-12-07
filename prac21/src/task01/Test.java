package task01;

public class Test {
    public static void main(String[] args) {
        String[] stringArray = {"Hello",", ","Word","!"};
        ArrayHolder <String> stringArrayHolder = new ArrayHolder<>(stringArray);
        System.out.println(stringArrayHolder);
        System.out.println(stringArrayHolder.getArrayIndex(1));

        Integer[]integerArray = {1, 2, 3, 4, 5};
        ArrayHolder <Integer> integerArrayHolder = new ArrayHolder<>(integerArray);
        System.out.println(integerArrayHolder);
        System.out.println(integerArrayHolder.getArrayIndex(1));

        Double[] doubleArray = {1.2, 1.3, 0.1};
        ArrayHolder <Double> doubleArrayHolder = new ArrayHolder<>(doubleArray);
        System.out.println(doubleArrayHolder);
        System.out.println(doubleArrayHolder.getArrayIndex(1));

        System.out.println(FileArray.readDir("\\src\\dir"));
    }
}
