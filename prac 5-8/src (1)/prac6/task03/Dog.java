package prac6.task03;

public class Dog implements Nameable{
    String nameOfDog;
    Person owner;
    public Dog(String nameOfDog, Person owner){
        this.nameOfDog = nameOfDog;
        this.owner = owner;
    }

    @Override
    public String getName() {
        return owner.getName();
    }
}
