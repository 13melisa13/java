package prac6.task03;

public class Test {
    public static void main(String[] args) {
        Person first = new Person("Lera", "8900");
        Dog dog1 = new Dog("Bon", first);
        Dog dog2 = new Dog("Don", first);
        System.out.println(first.getName() + " " + dog2.getName());
    }

}
