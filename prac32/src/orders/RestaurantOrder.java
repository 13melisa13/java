package orders;

import items.Item;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class RestaurantOrder implements Order, Comparator<Item>, Serializable {
    private Node head;
    private Node current;
    private int size;
    private int amount;
    private final int max = 100;

    public RestaurantOrder() {
        current = head = new Node(null, null, null);
        head.prev = head.next = head;
        size = 0;
        amount = 0;
    }
    public RestaurantOrder(Item[]items) {
        if (size >= max || size <= 0) return;
        current = head = new Node(items[0], null, null);
        for (Item item:items) {
            amount += current.value.getCost();
            Node temp = new Node(item, current, head);
            current.next = temp;
            current = temp;
            size++;
        }
    }

    @Override
    public boolean addItem(Item item) {

        Node temp = new Node(item, current, head);
        if (size == 0){
            head = current = temp;
            size++;
            amount += temp.value.getCost();
            return true;
        }


        if (size < max && size >= 0){
            current.next = temp;
            size++;
            amount += temp.value.getCost();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeFirstItemByName(String name) {
        Node temp = head;
        while (!temp.value.getName().equals(name)){
            temp = temp.next;
            if (temp.next == head) return false;
        }
        amount -= temp.value.getCost();
        temp.prev = temp.next;
        size--;
        return true;
    }

    @Override
    public int removeAllItemByName(String name) {
        Node temp = head;
        int n = 0;
        while (true){
            if(!temp.value.getName().equals(name)) {
                temp = temp.next;
            } else {
                amount -= temp.value.getCost();
                temp.prev = temp.next;
                size--;
                n++;
            }
            if (temp.next == head) return n;
        }

    }

    @Override
    public int countOfItem() {
        return size;
    }

    @Override
    public int amount() {
        return amount;
    }

    @Override
    public int countOfItemByName(String name) {
        Node temp = head;
        int n = 0;
        while (true){
            if(!temp.value.getName().equals(name)) {
                temp = temp.next;
            } else {
                n++;
            }
            if (temp.next == head) return n;
        }
    }

    @Override
    public Item[] items() {
        Item[] itemsArray = new Item[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            itemsArray[i] = temp.value;
            temp = temp.next;
        }
        return itemsArray;
    }

    @Override
    public Item[] itemsSortByCost() {
        Item[] itemsArray = items();
        Arrays.sort( itemsArray,this);
        return itemsArray;
    }

    @Override
    public String[] itemUniqNames() {
        String[] names = new String[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            //System.out.println(temp.value.getName());
            names[i] = temp.value.getName();
            temp = temp.next;
        }
        String[] a = new HashSet<String>(Arrays.asList(names)).toArray(new String[0]);
        return  a;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o2.getCost() - o1.getCost();
    }
    @Override
    public String toString() {
        return " "+Arrays.toString(itemUniqNames())+" ";
    }
}
