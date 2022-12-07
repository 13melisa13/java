package task01;

import java.io.Serializable;

public class AnimalSerializable extends Animal implements Serializable {

    public AnimalSerializable(String say) {
        super(say);
    }
}
