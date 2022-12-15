package prac31;

import org.junit.Test;
import prac31.items.Dish;
import prac31.manager.OrderAlreadyException;
import prac31.manager.OrderManager;
import prac31.orders.RestaurantOrder;

public class RemoveExceptionTest {
        @Test(expected = Exception.class)
        public void test() throws  Exception {
            Dish dish1 = new Dish("Борщ", "Описание1",1);
            OrderManager orderManager = new OrderManager();
            RestaurantOrder restaurantOrder = new RestaurantOrder();
            restaurantOrder.addItem(dish1);
            restaurantOrder.removeFirstItemByName(""); //отсутствие элементов в очереди
        }

}
