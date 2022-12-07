import items.Dish;
import items.Drink;
import manager.OrderAlreadyException;
import manager.OrderManager;
import orders.InternetOrder;
import orders.RestaurantOrder;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws OrderAlreadyException {
            ArrayList<String> dish = new ArrayList<>();
            dish.add("Pizza: Peperoni: 590");
            dish.add( "Pizza: 4 cheeses: 550");
            dish.add("Lasagna: Tasty Italian dish: 600");
            dish.add("Greek salad: Vegetables: 320");
            dish.add("water: original, carbonated: 160");
            dish.add("beer: light, dark: 260");
            dish.add("Juice: Orange, Apple, Multi: 190");
            System.out.println("Menu: ");
            for (String s: dish)
                System.out.println(s);

            RestaurantOrder restaurantOrder = new RestaurantOrder();
            restaurantOrder.addItem(new Dish("Lasagna", "Tasty Italian dish", 600));
            restaurantOrder.addItem(new Drink("Juice", "Orange", 190));
            System.out.println("\nPositions in the order: " + restaurantOrder.countOfItem());
            System.out.println(Arrays.toString(restaurantOrder.itemUniqNames()));

            RestaurantOrder restaurantOrder1 = new RestaurantOrder();
            restaurantOrder1.addItem(new Dish("Greek salad", "Vegetables", 320));
            restaurantOrder1.addItem(new Dish("Pizza", "4 cheeses", 550));
            restaurantOrder1.addItem(new Drink("water", "original, carbonated", 160));
            System.out.println("Positions in the order: " + restaurantOrder1.countOfItem());
            System.out.println(Arrays.toString(restaurantOrder1.itemUniqNames()));

            System.out.println("\n" + "Restaurant orders: ");
            OrderManager orderManager = new OrderManager();
            orderManager.add(restaurantOrder, 1);
            orderManager.add(restaurantOrder1, 2);
            System.out.println(orderManager.orders());

            InternetOrder internetOrder = new InternetOrder();
            internetOrder.addItem(new Dish("Pizza", "Peperoni", 590));
            internetOrder.addItem(new Dish("Pizza", "Peperoni", 590));
            internetOrder.addItem(new Dish("Pizza", "4 cheeses", 550));
            System.out.println("\n" + "Internet orders: ");
            orderManager.add(internetOrder, "Rostov-on-Don");
            System.out.println(orderManager.getInternetOrder());

        }
}
