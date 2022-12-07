package task1;


public class ArrayQueueADT {
    private static final int max = 100;
    private static Object array[];
    private static int size;
    private static int head;
    private static int tail;

    public ArrayQueueADT() {
        array = new Object[max];
        size = head = tail = 0;
    }

    public static void enqueue(ArrayQueueADT queueADT,Object element) {
        queueADT.array[queueADT.tail] = element;
        queueADT.tail = (queueADT.tail + 1) % queueADT.array.length;
        size++;
    }
    public static Object element(ArrayQueueADT queueADT) {
        return queueADT.array[queueADT.head];
    }

    public static Object dequeue(ArrayQueueADT queueADT) {
        Object result = element(queueADT);
        queueADT.array[queueADT.head] = null;
        queueADT.size--;
        queueADT.head = (queueADT.head + 1) % queueADT.array.length;
        return result;
    }

    public static int size(ArrayQueueADT queueADT) {
        return queueADT.size;
    }

    public static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.size == 0;
    }
    
    public static void clear(ArrayQueueADT queueADT) {
        queueADT.size = queueADT.head = queueADT.tail = 0;
        queueADT.array = new Object[queueADT.max];
    }

}

