package prac6.task10;

import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> computers = new ArrayList<>();
    public int indexOfComputer(Computer ideal){
        for (Computer computer: computers) {
            if (computer.getModel().equals(ideal.getModel())){
                return computers.indexOf(computer);
            }
        }
        System.out.println("Not good");
        return -1;

    }

    public void remove(Computer ideal){
        if (indexOfComputer(ideal) != -1){
        computers.remove(indexOfComputer(ideal));
        }
    }

    public void add(Computer ideal){
        computers.add(ideal);
    }
    public void print(){
        for(Computer computer : computers) {
            System.out.println(computer);
        }
    }

}
