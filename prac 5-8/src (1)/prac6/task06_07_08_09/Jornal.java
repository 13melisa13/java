package prac6.task06_07_08_09;

import java.util.ArrayList;

public class Jornal implements Printable {
    String nameOfJornal;
    ArrayList <Shop> shops = new ArrayList<>(); //information about Shop
    public Jornal (String nameOfJornal, ArrayList<Shop> shops){
        this.nameOfJornal = nameOfJornal;
        this.shops = shops;
    }
    @Override
    public void print() {
        System.out.println(nameOfJornal);
    }
    public static void printJornal(ArrayList<Printable>  printables){
        for (Printable printable: printables) {
            if (printable instanceof Jornal){
                printable.print();
            }
        }
    }
}
