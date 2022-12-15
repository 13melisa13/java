package prac31;

import org.junit.Assert;
import org.junit.Test;
import prac31.items.Dish;
import prac31.items.Drink;
import prac31.items.DrinkTypeEnum;
import prac31.items.Item;
import prac31.manager.OrderAlreadyException;
import prac31.manager.OrderManager;
import prac31.orders.InternetOrder;
import prac31.orders.RestaurantOrder;

public class SortTest {
    @Test
    public void sorting_test() throws Exception {
        Dish dish1 = new Dish("Борщ", "Описание1", 50);
        Dish dish2 = new Dish( "Цезарь", "Описание2", 100);
        Drink drink1 = new Drink("Wine", "Orange", 1190, DrinkTypeEnum.JUICE, 17);
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addItem(dish1);
        internetOrder.addItem(dish2);
        internetOrder.addItem(drink1);
        Item[] sorted = internetOrder.itemsSortByCost();
        Item[] expected = {drink1, dish2, dish1};
        Assert.assertArrayEquals(sorted,expected);
    }

}
