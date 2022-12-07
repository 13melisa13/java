package task2;

public abstract class AbstractQueue implements Queue {
    public abstract void enqueue(Object element);

    public abstract Object element();

    public abstract Object dequeue();

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract void clear();
}
