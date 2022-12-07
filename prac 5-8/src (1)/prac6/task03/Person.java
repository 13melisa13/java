package prac6.task03;

public class Person implements Nameable {
    private String name;
    private String phone;
    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String getName() {
        return name;
    }
}
