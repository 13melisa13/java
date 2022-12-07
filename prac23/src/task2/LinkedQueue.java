package task2;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {
    private LinkedList<Object> list;

    @Override
    public void enqueue(Object element) {
        list.addLast(element);
    }

    @Override
    public Object element() {
        return list.getFirst();
    }

    @Override
    public Object dequeue() {
        return list.removeFirst();
    }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
