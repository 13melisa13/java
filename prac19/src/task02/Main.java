package task02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.setArray(fill());
        new GUI(model);
    }
    static ArrayList <Student> fill(){
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student("P A", 2, 208));
        array.add(new Student("I A", 4, 278));
        array.add(new Student("R A", 1, 298));
        array.add(new Student("M A", 3, 270));
        array.add(new Student("Q A", 2, 178));
        return array;
    }
}
