package prac31;
import org.junit.Test;

import prac31.items.Dish;


import prac31.manager.OrderAlreadyException;
import prac31.manager.OrderManager;

import prac31.orders.RestaurantOrder;

public class OrderAlreadyExceptionTest {
        @Test(expected = OrderAlreadyException.class)
        public void test() throws OrderAlreadyException, Exception {
            Dish dish1 = new Dish("Борщ", "Описание1",1);
            OrderManager orderManager = new OrderManager();
            RestaurantOrder restaurantOrder = new RestaurantOrder();
            restaurantOrder.addItem(dish1);
            orderManager.add(restaurantOrder, 2);
            orderManager.add(restaurantOrder, 2);
        }

}
