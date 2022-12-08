import items.Dish;
import items.Drink;
import items.DrinkTypeEnum;
import manager.OrderAlreadyException;
import manager.OrderManager;
import orders.InternetOrder;
import orders.RestaurantOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderUI extends JFrame {


    public OrderUI(){
        super("Food order");
        setPreferredSize(new Dimension(400, 400));
        setJMenuBar(createFileMenu());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
    private JMenuBar createFileMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Menu");
        JMenu dish = new JMenu("Dish");
        JMenu drink = new JMenu("Drink");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem dish1 = new JMenuItem("Pizza: 4 cheeses, peperoni: 590");
        JMenuItem dish2 = new JMenuItem("Salad: Greek, Caesar: 330");
        JMenuItem dish3 = new JMenuItem("Lasagna: 660");
        JMenuItem alco = new JMenuItem("Alcoholic");
        JMenuItem non_al = new JMenuItem("Non-alcoholic");
        drink.add(alco); drink.add(non_al);
        dish.add(dish1); dish.add(dish2); dish.add(dish3);
        file.add(dish);
        file.addSeparator();
        file.add(drink);
        file.addSeparator();
        file.add(exit);
        exit.addActionListener(e -> System.exit(0));
        menuBar.add(file);
        return menuBar;
    }




    public static void main(String[] args) throws Exception {
        new OrderUI();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addItem(new Dish("Lasagna", "Tasty Italian dish", 600));
        restaurantOrder.addItem(new Drink("Juice", "Orange", 190, DrinkTypeEnum.JUICE, 0));

        //System.out.println(Arrays.toString(restaurantOrder.getMenu()));
        //System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);

        //System.out.println(orderManager.orders());
        OrderManager orderManager1 = new OrderManager();
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addItem(new Dish("Lasagna", "Tasty Italian dish", 600));
        internetOrder.addItem(new Drink("Juice", "Orange", 190, DrinkTypeEnum.JUICE, 0));
        Address address = new Address("Moscow", 111, "pr.Mira", 15, 24);
        Customer customer = new Customer("Ivanov", "Ivan", 20, address);
        String cust = customer.getFirstName()+ " " + customer.getSecondName()+ " " + customer.getAge()
                + "-> " + customer.getAddress();
        orderManager1.add(internetOrder, cust);
        System.out.println(orderManager1.getInternetOrder());
    }
}
