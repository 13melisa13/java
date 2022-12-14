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
import java.util.ArrayList;

public class OrderUI extends JFrame {

    JPanel panel = new JPanel();
    JLabel order = new JLabel();
    JLabel total = new JLabel();
    ArrayList<JLabel> items = new ArrayList<>();
    GridLayout grid = new GridLayout();
    public OrderUI(Customer customer, InternetOrder internetOrder){
        super(customer.getFirstName()+" "+customer.getSecondName()+", welcome to our restaurant");

        grid.setColumns(1);
        grid.setRows(2);
        setJMenuBar(createFileMenu(internetOrder));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        pack();
        setVisible(true);
    }
    private JMenuBar createFileMenu(InternetOrder internetOrder) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Menu");
        JMenu dish = new JMenu("Dish");
        JMenu drink = new JMenu("Drink");
        JMenuItem exit = new JMenuItem("Exit");
        ArrayList <JMenuItem> dishes = new ArrayList<>();
        dishes.add(new JMenuItem("Cezar Salad 550"));
        dishes.add(new JMenuItem("Greek Salad 310"));
        dishes.add(new JMenuItem("Peperoni Pizza 750"));
        JMenu alco = new JMenu("Alcoholic");
        JMenu non_al = new JMenu("Non-alcoholic");
        drink.add(alco); drink.add(non_al);
        for (JMenuItem item:dishes) {
            dish.add(item);
            item.addActionListener(e -> {
                //internetOrder.addItem();
            });
        }
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
        Address address = new Address("Moscow", 111, "pr.Mira", 15, 24);
        Customer customer = new Customer("Ivanov", "Ivan", 20, address);
        InternetOrder internetOrder = new InternetOrder();
        new OrderUI(customer,internetOrder );
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addItem(new Dish("Lasagna", "Tasty Italian dish", 600));
        restaurantOrder.addItem(new Drink("Juice", "Orange", 190, DrinkTypeEnum.JUICE, 0));

        //System.out.println(Arrays.toString(restaurantOrder.getMenu()));
        //System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);

        //System.out.println(orderManager.orders());
        OrderManager orderManager1 = new OrderManager();

        internetOrder.addItem(new Dish("Lasagna", "Tasty Italian dish", 600));
        internetOrder.addItem(new Drink("Juice", "Orange", 190, DrinkTypeEnum.JUICE, 0));
        String cust = customer.getFirstName()+ " " + customer.getSecondName()+ " " + customer.getAge()
                + "-> " + customer.getAddress();
        orderManager1.add(internetOrder, cust);
        System.out.println(orderManager1.getInternetOrder());
    }
}
