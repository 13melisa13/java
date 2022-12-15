package prac31;


import prac31.items.Dish;
import prac31.items.Drink;
import prac31.items.DrinkTypeEnum;
import prac31.items.Item;
import prac31.manager.OrderAlreadyException;
import prac31.manager.OrderManager;
import prac31.orders.InternetOrder;
import prac31.orders.RestaurantOrder;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;


public class OrderUI extends JFrame {
    GridLayout grid = new GridLayout();
    JPanel panel = new JPanel(grid);

    JLabel total = new JLabel("Total: 0");
    JButton ok = new JButton("Ok");
    ArrayList<JLabel> items = new ArrayList<>();

    public OrderUI(Customer customer, InternetOrder internetOrder, OrderManager orderManager) {
        super(customer.getFirstName()+" "+customer.getSecondName()+", welcome to our restaurant");
        add(panel);
        grid.setColumns(1);
        grid.setVgap(10);
        add(ok,BorderLayout.SOUTH);
        setJMenuBar(createFileMenu(internetOrder));
        ok.addActionListener(e -> {
            try {
                orderManager.add(internetOrder, customer.getAddress());
                System.out.println(orderManager.getInternetOrder());
                FileOutputStream outputStream = new FileOutputStream("src/save.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(orderManager);
                objectOutputStream.close();
            } catch (OrderAlreadyException ex){
                JOptionPane.showMessageDialog(OrderUI.this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex){
                throw new RuntimeException(ex);
            }

        });
        add(total, BorderLayout.NORTH);

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
        for (JMenuItem item:dishes) {
            dish.add(item);
            item.addActionListener(e -> {
                String[] itemInfo = item.getText().split(" ", 3);
                try {
                    Item prodForAdd = new Dish(itemInfo[0],itemInfo[1],Integer.parseInt(itemInfo[2]));
                    internetOrder.addItem(prodForAdd);
                    items.add(new JLabel(item.getText()));
                    panelUpdate();
                    total.setText("Total: "+ internetOrder.amount());


                } catch (Exception exception){
                    JOptionPane.showMessageDialog(OrderUI.this,exception.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
            });
        }

        JMenu alco = new JMenu("Alcoholic");
        JMenu non_al = new JMenu("Non-alcoholic");
        drink.add(alco);
        drink.add(non_al);

        ArrayList <JMenuItem> drinks = new ArrayList<>();
        drinks.add(new JMenuItem("Wine Italian 2000"));
        drinks.add(new JMenuItem("Vodka Russian 1000"));
        drinks.add(new JMenuItem("Coffee Turkish 150"));
        drinks.add(new JMenuItem("Tea Chinese 100"));

        for (JMenuItem item:drinks) {
            String[] itemInfo = item.getText().split(" ", 3);
            try {
                Drink prodForAdd = new Drink(itemInfo[0],itemInfo[1],Integer.parseInt(itemInfo[2]),
                        findNameOfDrink(itemInfo[0]), findNameOfDrink(itemInfo[0]).vol);
                if (prodForAdd.isAlcoholicDrink()) alco.add(item);
                else non_al.add(item);
                item.addActionListener(e -> {
                    try {
                        internetOrder.addItem(prodForAdd);
                        items.add(new JLabel(item.getText()));
                        panelUpdate();
                        total.setText("Total: "+ internetOrder.amount());

                    } catch (Exception exception){
                        JOptionPane.showMessageDialog(OrderUI.this,exception.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                });
            } catch (Exception e){
                throw new RuntimeException(e);
            }

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
    private void panelUpdate(){
        panel.removeAll();
        grid.setRows(items.size());
        for (JLabel comp:items) {
            panel.add(comp);
        }
    }

    private DrinkTypeEnum findNameOfDrink(String name){
        DrinkTypeEnum[] drinkTypeEnums = DrinkTypeEnum.getAll();
        for (DrinkTypeEnum one: drinkTypeEnums) {
            if (name.equalsIgnoreCase(one.name()))
                return one;
        }
     return null;
    }



    public static void main(String[] args) throws Exception {

        OrderManager orderManager;
        if (new File("src/save.ser").exists()){
            FileInputStream fileInputStream = new FileInputStream("src/save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            orderManager = (OrderManager)objectInputStream.readObject();
        } else {
            orderManager = new OrderManager();
        }
        System.out.println(orderManager);

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        RestaurantOrder restaurantOrder2 = new RestaurantOrder();
        restaurantOrder1.addItem(new Dish("Lasagna", "Tasty Italian dish", 600));
        restaurantOrder1.addItem(new Drink("Juice", "Orange", 190, DrinkTypeEnum.JUICE, 0));
        restaurantOrder2.addItem(new Dish("LALALA", "Tasty LALALAncki dish", 300));
        restaurantOrder2.addItem(new Drink("Wine", "Orange", 1190, DrinkTypeEnum.JUICE, 17));
        try {
            orderManager.add(restaurantOrder1, (int) Math.ceil(Math.random() * 10));

        } catch (OrderAlreadyException e){
            System.out.println("Уже был такой заказ - по мнению Сериализации");
        }
        try {
            orderManager.add(restaurantOrder2, (int) Math.ceil(Math.random() * 10));

        } catch (OrderAlreadyException e){
            System.out.println("Уже был такой заказ - по мнению Сериализации");
        }
        System.out.println("Restaurant orders: ");
        System.out.println(orderManager.getRestaurantOrder());
        System.out.println();

        Address address = new Address("Moscow", 111, "pr.Mira", (int)Math.ceil(Math.random()*10), 24);
        Customer customer = new Customer("Ivanov", "Ivan", 20, address);
        InternetOrder internetOrder = new InternetOrder();
        new OrderUI(customer,internetOrder, orderManager);
    }
}
