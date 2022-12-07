package prac6.task06_07_08_09;

import prac6.task04.Bread;
import prac6.task04.Milk;

public class Shop implements Printable {
    String nameOfShop;
    Milk milk;
    Bread bread;
    public Shop(String nameOfShop, Milk milk, Bread bread){
        this.nameOfShop = nameOfShop;
        this.milk = milk;
        this.bread = bread;

    }

    @Override
    public String toString() {
        return "Shop{" +
                "nameOfShop='" + nameOfShop + '\'' +
                ", milk=" + milk +
                ", bread=" + bread +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
