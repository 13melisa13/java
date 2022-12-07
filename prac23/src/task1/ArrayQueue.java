package task1;


public class ArrayQueue {
    private static final int max = 100;
    private static Object array[] = new Object[max];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;


    public static void enqueue(Object element) {
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }
    public static Object element() {
        return array[head];
    }

    public static Object dequeue() {
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        size = head = tail = 0;
        array = new Object[max];
    }

}

