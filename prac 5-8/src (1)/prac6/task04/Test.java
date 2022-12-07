package prac6.task04;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        Priceable laptop = new Laptop("Lenovo3006", r.nextInt(30000));
        System.out.println(laptop);
        Milk milk = new Milk();
        Bread bread = new Bread();
        milk.setWeight(0.9);
        bread.setWeight(0.45);
        ArrayList<Food> products = new ArrayList<>();
        products.add(milk);
        products.add(bread);
        double bill = laptop.getPrice();
        for (Food product :products) {
            product.setCount(r.nextInt(3));
            product.setUnitPrice(r.nextDouble()+ r.nextInt(24)+50);
        }
        bill += milk.getPrice();
        System.out.println(milk);
        bill += bread.getPrice();
        System.out.println(bread);
        DecimalFormat dF = new DecimalFormat( "#.##" );
        System.out.println(dF.format(bill));
    }
}
