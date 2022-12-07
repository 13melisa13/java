package task01;

public class NumberAnimal extends Number{
    String age = "";
    NumberAnimal(String age){
        this.age = age;
    }
    @Override
    public int intValue() {
        return age.length();
    }

    @Override
    public long longValue() {
        return age.length();
    }

    @Override
    public float floatValue() {
        return age.length();
    }

    @Override
    public double doubleValue() {
        return age.length();
    }

    @Override
    public String toString() {
        return "NumberAnimal{" +
                "age='" + age + '\'' +
                '}';
    }
}
