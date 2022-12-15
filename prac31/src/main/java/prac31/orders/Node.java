package prac31.orders;


import prac31.items.Item;

import java.io.Serializable;

public  class Node implements Serializable {
    public Item value;
    public Node prev;
    public Node next;

    public Node(Item value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}