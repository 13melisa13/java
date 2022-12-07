package task01;

public class Animal {
    String say = "";
    public Animal(){}
    public Animal(String say){
        this.say = say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public String getSay() {
        return say;
    }

    @Override
    public String toString() {
        return "Animal " +
                " say '" + say + '\'' +
                '}';
    }
}
