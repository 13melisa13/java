package prac31.orders;


import prac31.items.Item;

public interface Order {
    public boolean addItem(Item item);
    public boolean removeFirstItemByName(String name);
    public int removeAllItemByName(String name);
    public int countOfItem();
    public int amount();
    public int countOfItemByName(String name);
    public Item[] items();
    public Item[] itemsSortByCost();
    public String[] itemUniqNames();
}

