package task2;


public class ArrayQueue extends AbstractQueue {
    private static final int max = 100;
    private static Object array[] = new Object[max];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    @Override
    public  void enqueue(Object element) {
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }
    public  Object element() {
        return array[head];
    }
    @Override
    public Object dequeue() {
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public  boolean isEmpty() {
        return size == 0;
    }
    @Override
    public  void clear() {
        size = head = tail = 0;
        array = new Object[max];
    }

}

