package task01;

public class Test {
    public static void main(String[] args) {
        String say = "mey";
        AnimalSerializable animal = new AnimalSerializable(say);
        NumberAnimal number = new NumberAnimal(say);
        GenericBox <String,AnimalSerializable,NumberAnimal> genericBox =
                new GenericBox<>(say, animal, number);
        System.out.println(genericBox);
    }
}
