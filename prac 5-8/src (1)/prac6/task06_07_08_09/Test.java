package prac6.task06_07_08_09;

import prac6.task04.Bread;
import prac6.task04.Food;
import prac6.task04.Milk;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        Milk milk = new Milk();
        Bread bread = new Bread();
        milk.setWeight(0.9);
        bread.setWeight(0.45);
        ArrayList<Food> products = new ArrayList<>();
        products.add(milk);
        products.add(bread);
        for (Food product :products) {
            product.setCount(r.nextInt(300));
            product.setUnitPrice(r.nextDouble()+ r.nextInt(24)+50);
        }
        Shop shop = new Shop("Shop", milk, bread);
        Shop shop1 = new Shop("Shop1", milk, bread);
        ArrayList <Shop> shops = new ArrayList<>();
        shops.add(shop1);
        shops.add(shop);
        Book book = new Book("The Beast and The Beauty", "Grim", 1834);
        Jornal jornal = new Jornal("Jornal", shops );
        ArrayList <Printable> forPrint = new ArrayList<>();
        forPrint.add(book);
        forPrint.add(jornal);
        for (Printable printable :forPrint) {
            printable.print();
        }
        System.out.println();
        jornal.printJornal(forPrint);
        System.out.println();
        book.printBook(forPrint);
    }

}
